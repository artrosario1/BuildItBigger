package com.udacity.gradle.finalproject;

import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.espresso.Espresso;

import com.softcap.artrosario.mylibrary.JokerActivity;
import com.udacity.gradle.builditbigger.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    @Rule
    public ActivityTestRule<JokerActivity> mActivityRule = new ActivityTestRule<>(JokerActivity.class);

    @Test
    public void jokeButtonisClicked(){
        onView(withId(R.id.jokeButton)).perform(click());
    }
    @Test
    public void jokeTextViewisMatched(){
        jokeButtonisClicked();
        onView(withId(R.id.tv_joker)).check(matches(withText("A hand-crafted joke")));
    }
}
