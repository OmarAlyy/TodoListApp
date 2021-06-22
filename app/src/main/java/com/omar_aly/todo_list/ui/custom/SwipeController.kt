package com.omar_aly.todo_list.ui.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.drawable.PaintDrawable
import android.view.MotionEvent
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.ACTION_STATE_SWIPE
import androidx.recyclerview.widget.ItemTouchHelper.RIGHT
import androidx.recyclerview.widget.RecyclerView
import com.omar_aly.todo_list.R


class SwipeController(
    val context: Context,
    private val swipeControllerActions: SwipeControllerActions
) : ItemTouchHelper.Callback() {
    private var swipeBack = false

    private var clearPaint: Paint = Paint()
    private var background: PaintDrawable = PaintDrawable()
    private var colorBackground = ContextCompat.getColor(context, R.color.colorError)
    private var deleteDrawable =
        ContextCompat.getDrawable(context, R.drawable.ic_delete_outline_24dp)
    private var intrinsicWidth: Int
    private var intrinsicHeight: Int

    init {
        clearPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.CLEAR)
        intrinsicWidth = deleteDrawable?.intrinsicWidth ?: 0
        intrinsicHeight = deleteDrawable?.intrinsicHeight ?: 0
    }

    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int = makeMovementFlags(0, RIGHT)

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean = false

    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        if (actionState == ACTION_STATE_SWIPE) {
            setTouchListener(recyclerView, viewHolder, dX, dY)
        }
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)

        val itemView = viewHolder.itemView
        val itemHeight = itemView.height

        val isCancelled = dX == 0F && !isCurrentlyActive
        if (isCancelled) {
            clearCanvas(
                c,
                itemView.left.toFloat(),
                itemView.top.toFloat(),
                itemView.left.toFloat() + dX.toInt(),
                itemView.bottom.toFloat()
            )
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
            return
        }

        background.paint.color = colorBackground
        val cardMargin = context.resources.getDimension(R.dimen.card_margin).toInt()
        val cardCornerRadius = context.resources.getDimension(R.dimen.card_corner_radius)
        background.setBounds(
            itemView.left + cardMargin,
            itemView.top + cardMargin,
            itemView.left + dX.toInt() + cardMargin + cardCornerRadius.toInt() * 2,
            itemView.bottom - cardMargin
        )
        background.setCornerRadius(cardCornerRadius)
        background.draw(c)

        val deleteIconMargin = context.resources.getDimension(R.dimen.delete_button_margin).toInt()
        val deleteIconTop =
            itemView.top + (itemHeight - intrinsicHeight) / 2
        val deleteIconLeft = itemView.left + deleteIconMargin
        val deleteIconRight = itemView.left + deleteIconMargin + intrinsicWidth
        val deleteIconBottom = deleteIconTop + intrinsicHeight
        deleteDrawable?.setTint(context.getColor(R.color.white))
        deleteDrawable?.setBounds(deleteIconLeft, deleteIconTop, deleteIconRight, deleteIconBottom)
        deleteDrawable?.draw(c)
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
    }

    private fun clearCanvas(
        c: Canvas,
        left: Float,
        top: Float,
        right: Float,
        bottom: Float
    ) {
        c.drawRect(left, top, right, bottom, clearPaint)
    }

    override fun convertToAbsoluteDirection(flags: Int, layoutDirection: Int): Int {
        if (swipeBack) {
            swipeBack = false
            return 0
        }
        return super.convertToAbsoluteDirection(flags, layoutDirection)
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setTouchListener(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float
    ) {
        recyclerView.setOnTouchListener { _, event ->
            swipeBack =
                event.action == MotionEvent.ACTION_CANCEL || event.action == MotionEvent.ACTION_UP
            if (swipeBack && dX > 0) {
                swipeControllerActions.onDelete(viewHolder.adapterPosition)
            }
            false
        }
    }

    interface SwipeControllerActions {
        fun onDelete(position: Int)
    }
}
