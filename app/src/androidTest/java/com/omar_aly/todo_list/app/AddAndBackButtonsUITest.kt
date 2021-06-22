package com.omar_aly.todo_list.app


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
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
class AddAndBackButtonsUITest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun addAndBackButtonsUITest() {
        val floatingActionButton = onView(
            allOf(
                withId(R.id.create_button),
                childAtPosition(
                    allOf(
                        withId(R.id.coordinator_layout),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton.perform(click())

        val appCompatImageButton = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(R.id.toolbar),
                        childAtPosition(
                            withClassName(`is`("com.google.android.material.appbar.AppBarLayout")),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton.perform(click())

        val floatingActionButton2 = onView(
            allOf(
                withId(R.id.create_button),
                childAtPosition(
                    allOf(
                        withId(R.id.coordinator_layout),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton2.perform(click())

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

        val appCompatImageView = onView(
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

        val appCompatImageButton2 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(R.id.toolbar),
                        childAtPosition(
                            withClassName(`is`("com.google.android.material.appbar.AppBarLayout")),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton2.perform(click())

        val floatingActionButton3 = onView(
            allOf(
                withId(R.id.create_button),
                childAtPosition(
                    allOf(
                        withId(R.id.coordinator_layout),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        floatingActionButton3.perform(click())

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

        val appCompatImageButton3 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(R.id.toolbar),
                        childAtPosition(
                            withClassName(`is`("com.google.android.material.appbar.AppBarLayout")),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton3.perform(click())
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
}
