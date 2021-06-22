package com.omar_aly.todo_list.app


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.omar_aly.todo_list.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val floatingActionButton = onView(
            allOf(
                withId(R.id.create_button)
            )
        )
        floatingActionButton.perform(click())

        val textInputEditText = onView(
            allOf(
                withId(R.id.task_name_edit_text),
                
                isDisplayed()
            )
        )
        textInputEditText.perform(replaceText("Title"), closeSoftKeyboard())

        val textInputEditText2 = onView(
            allOf(
                withId(R.id.task_description_edit_text),
               
                isDisplayed()
            )
        )
        textInputEditText2.perform(replaceText("Body"), closeSoftKeyboard())

        val materialCheckBox = onView(
            allOf(
                withId(R.id.remind10MinutesCheck), withText("Remind me 10 minutes ahead of time"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialCheckBox.perform(click())

        val materialCheckBox2 = onView(
            allOf(
                withId(R.id.remind10MinutesCheck), withText("Remind me 10 minutes ahead of time"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialCheckBox2.perform(click())

        val materialCheckBox3 = onView(
            allOf(
                withId(R.id.remind10MinutesCheck), withText("Remind me 10 minutes ahead of time"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialCheckBox3.perform(click())

        val materialCheckBox4 = onView(
            allOf(
                withId(R.id.remind10MinutesCheck), withText("Remind me 10 minutes ahead of time"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialCheckBox4.perform(click())

        val appCompatImageView = onView(
            allOf(
                withId(R.id.tag_color), withContentDescription("task_tag_color"),
                childAtPosition(
                    allOf(
                        withId(R.id.tag_color_item),
                        childAtPosition(
                            withId(R.id.tag_list),
                            3
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView.perform(click())

        val appCompatImageView2 = onView(
            allOf(
                withId(R.id.tag_color), withContentDescription("task_tag_color"),
                childAtPosition(
                    allOf(
                        withId(R.id.tag_color_item),
                        childAtPosition(
                            withId(R.id.tag_list),
                            4
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView2.perform(click())

        val appCompatImageView3 = onView(
            allOf(
                withId(R.id.tag_color), withContentDescription("task_tag_color"),
                childAtPosition(
                    allOf(
                        withId(R.id.tag_color_item),
                        childAtPosition(
                            withId(R.id.tag_list),
                            5
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView3.perform(click())

        val materialCheckBox5 = onView(
            allOf(
                withId(R.id.remind10MinutesCheck), withText("Remind me 10 minutes ahead of time"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialCheckBox5.perform(click())

        val materialButton = onView(
            allOf(
                withId(R.id.save), withText("save"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.save), withText("save"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.save), withText("save"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())

        val materialButton4 = onView(
            allOf(
                withId(R.id.save), withText("save"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton4.perform(click())

        val floatingActionButton2 = onView(
            allOf(
                withId(R.id.create_button)
            )
        )
        floatingActionButton2.perform(click())

        val textInputEditText3 = onView(
            allOf(
                withId(R.id.task_name_edit_text),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_name_input),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        textInputEditText3.perform(replaceText("Test title"), closeSoftKeyboard())

        val textInputEditText4 = onView(
            allOf(
                withId(R.id.task_description_edit_text),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_description_input),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        textInputEditText4.perform(replaceText("Test body"), closeSoftKeyboard())

        val appCompatImageView4 = onView(
            allOf(
                withId(R.id.tag_color), withContentDescription("task_tag_color"),
                childAtPosition(
                    allOf(
                        withId(R.id.tag_color_item),
                        childAtPosition(
                            withId(R.id.tag_list),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView4.perform(click())

        val appCompatImageView5 = onView(
            allOf(
                withId(R.id.tag_color), withContentDescription("task_tag_color"),
                childAtPosition(
                    allOf(
                        withId(R.id.tag_color_item),
                        childAtPosition(
                            withId(R.id.tag_list),
                            2
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView5.perform(click())

        val materialButton5 = onView(
            allOf(
                withId(R.id.save), withText("save"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton5.perform(click())

        val materialCardView = onView(
            allOf(
                withId(R.id.task_card),
                childAtPosition(
                    allOf(
                        withId(R.id.container),
                        childAtPosition(
                            withId(R.id.tasks_recycler_view),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialCardView.perform(click())

        val appCompatImageView6 = onView(
            allOf(
                withId(R.id.edit),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.app_bar_layout),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageView6.perform(click())

        val textInputEditText5 = onView(
            allOf(
                withId(R.id.task_name_edit_text), withText("Title"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_name_input),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        textInputEditText5.perform(replaceText("Title edit"))

        val textInputEditText6 = onView(
            allOf(
                withId(R.id.task_name_edit_text), withText("Title edit"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_name_input),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        textInputEditText6.perform(closeSoftKeyboard())

        val textInputEditText7 = onView(
            allOf(
                withId(R.id.task_description_edit_text), withText("Body"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_description_input),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        textInputEditText7.perform(click())

        val textInputEditText8 = onView(
            allOf(
                withId(R.id.task_description_edit_text), withText("Body"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_description_input),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        textInputEditText8.perform(replaceText("Body edit"))

        val textInputEditText9 = onView(
            allOf(
                withId(R.id.task_description_edit_text), withText("Body edit"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_description_input),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        textInputEditText9.perform(closeSoftKeyboard())

        val materialButton6 = onView(
            allOf(
                withId(R.id.edit), withText("Edit"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("androidx.core.widget.NestedScrollView")),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton6.perform(click())

        val appCompatImageButton = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(R.id.toolbar),
                        childAtPosition(
                            withClassName(`is`("com.google.android.material.appbar.CollapsingToolbarLayout")),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageButton.perform(click())

        val floatingActionButton3 = onView(
            allOf(
                withId(R.id.create_button)
            )
        )
        floatingActionButton3.perform(click())

        val materialCardView2 = onView(
            allOf(
                withId(R.id.task_card),
                childAtPosition(
                    allOf(
                        withId(R.id.container),
                        childAtPosition(
                            withId(R.id.tasks_recycler_view),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialCardView2.perform(click())

        val appCompatImageButton2 = onView(
            allOf(
                withId(R.id.check_task_button), withContentDescription("delete_task_button"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.task_card),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton2.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }

    fun pressBack() {
        onView(isRoot()).perform(ViewActions.pressBack())
    }


}
