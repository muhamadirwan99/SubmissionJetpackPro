package com.dicoding.picodiploma.submission.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.picodiploma.submission.R
import com.dicoding.picodiploma.submission.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    /**
     Skenario testing yang dilakukan

     Menampilkan data Movie
        Memastikan rv_movie dalam keadaan tampil.
        Gulir rv_movie ke posisi data terakhir.

     Menampilkan data DetailMovie
         Memberi tindakan klik pada data pertama di rv_movie.
         Memastikan TextView untuk title tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk release tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk duration tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk genre tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk rated tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk rating tampil sesuai dengan yang diharapkan.

     Menampilkan data TvShow
        Memberi tindakan klik pada tabs yang bernama TV SHOWS
        Memastikan rv_tv_show dalam keadaan tampil.
        Gulir rv_tv_show ke posisi data terakhir.

     Menampilkan data TvShow
         Memberi tindakan klik pada data pertama di rv_tv_show.
         Memastikan TextView untuk title tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk release tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk duration tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk genre tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk rated tampil sesuai dengan yang diharapkan.
         Memastikan TextView untuk rating tampil sesuai dengan yang diharapkan.
     */

    private val dummyMovie = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.tv_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_release)).check(matches(withText(dummyMovie[0].release)))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyMovie[0].duration)))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.tv_rated)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rated)).check(matches(withText(dummyMovie[0].rated)))
        onView(withId(R.id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(withText(dummyMovie[0].rating)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.tv_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_release)).check(matches(withText(dummyTvShow[0].release)))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyTvShow[0].duration)))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyTvShow[0].genre)))
        onView(withId(R.id.tv_rated)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rated)).check(matches(withText(dummyTvShow[0].rated)))
        onView(withId(R.id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(withText(dummyTvShow[0].rating)))
    }
}