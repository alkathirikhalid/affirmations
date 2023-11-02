package com.alkathirikhalid.affirmations

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun scroll_to_item_0() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(0)
        )

        onView(withText(R.string.affirmation1))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_1() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(1)
        )

        onView(withText(R.string.affirmation2))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_2() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(2)
        )

        onView(withText(R.string.affirmation3))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_3() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(3)
        )

        onView(withText(R.string.affirmation4))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_4() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(4)
        )

        onView(withText(R.string.affirmation5))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_5() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(5)
        )

        onView(withText(R.string.affirmation6))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_6() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(6)
        )

        onView(withText(R.string.affirmation7))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_7() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(7)
        )

        onView(withText(R.string.affirmation8))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_8() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(8)
        )

        onView(withText(R.string.affirmation9))
            .check(matches(isDisplayed()))
    }

    @Test
    fun scroll_to_item_9() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(9)
        )

        onView(withText(R.string.affirmation10))
            .check(matches(isDisplayed()))
    }
}