package com.dicoding.picodiploma.submission.utils

import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.GenresItem
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.Movie
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieDetailResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.Genre
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShow
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShowDetailResponse

object DataDummy {

    fun generateDummyMovies(): List<DataEntity> {
        return listOf(
            DataEntity(
                "460465",
                "Mortal Kombat",
                "2021-04-07",
                110,
                "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
                listOf("Action", "Fantasy", "Adventure", "Science Fiction"),
                "Released",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                null,
                7.8
            ),
            DataEntity(
                "399566",
                "Godzilla Collection",
                "2021-03-24",
                113,
                "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                listOf("Science Fiction", "Action", "Drama"),
                "Released",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                null,
                8.1
            ),
            DataEntity(
                "615457",
                "Nobody",
                "2021-03-26",
                92,
                "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                listOf("Action", "Thriller", "Crime"),
                "Released",
                "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \\\"nobody.\\\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                null,
                8.5
            )
        )
    }

    fun generateDummyDetailMovie(): DataEntity {
        return  DataEntity(
            "460465",
            "Mortal Kombat",
            "2021-04-07",
            110,
            "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
            listOf("Action", "Fantasy", "Adventure", "Science Fiction"),
            "Released",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
            null,
            7.7
        )
    }

    fun generateDummyTvShows(): List<DataEntity> {
        return listOf(
            DataEntity(
                "95557",
                "Invincible",
                "2021-03-26",
                45,
                "/ijDV8Z23iR5B2ftx0WggiXbfqGi.jpg",
                listOf("Animation", "Action & Adventure", "Drama", "Sci-Fi & Fantasy"),
                "Returning Series",
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                null,
                8.9
            ),
            DataEntity(
                "88396",
                "The Falcon and the Winter Soldier",
                "2021-03-19",
                50,
                "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                listOf("Sci-Fi & Fantasy", "Action & Adventure", "Drama", "War & Politics"),
                "Ended",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                null,
                7.9
            ),
            DataEntity(
                "60735",
                "The Flash",
                "2014-10-07",
                44,
                "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
                listOf("Drama", "Sci-Fi & Fantasy"),
                "Returning Series",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                null,
                7.7
            )
        )
    }

    fun generateDummyDetailTvShow(): DataEntity {
        return DataEntity(
            "95557",
            "Invincible",
            "2021-03-26",
            45,
            "/ijDV8Z23iR5B2ftx0WggiXbfqGi.jpg",
            listOf("Animation", "Action & Adventure", "Drama", "Sci-Fi & Fantasy"),
            "Returning Series",
            "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
            null,
            8.9
        )
    }

    fun generateRemoteDummyMovies(): List<Movie> {
        return listOf(
            Movie(
                460465,
                "Mortal Kombat",
                "2021-04-07",
                "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8
            ),
            Movie(
                399566,
                "Godzilla Collection",
                "2021-03-24",
                "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                8.1
            ),
            Movie(
                615457,
                "Nobody",
                "2021-03-26",
                "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \\\"nobody.\\\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                8.5
            )
        )
    }

    fun generateRemoteDummyDetailMovie(): MovieDetailResponse {
        return  MovieDetailResponse(
            460465,
            "Mortal Kombat",
            "2021-04-07",
            110,
            "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
            listOf(
                    GenresItem(name = "Action"),
                    GenresItem(name = "Fantasy"),
                    GenresItem(name = "Adventure"),
                    GenresItem(name = "Science Fiction")
            ),
            "Released",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
            7.8
        )
    }

    fun generateRemoteDummyTvShows(): List<TvShow> {
        return listOf(
            TvShow(
                95557,
                "Invincible",
                "2021-03-26",
                "/ijDV8Z23iR5B2ftx0WggiXbfqGi.jpg",
                8.9,
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage."
            ),
            TvShow(
                88396,
                "The Falcon and the Winter Soldier",
                "2021-03-19",
                "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                7.9,
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience."
            ),
            TvShow(
                60735,
                "The Flash",
                "2014-10-07",
                "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
                .7,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."
            )
        )
    }

    fun generateRemoteDummyDetailTvShow(): TvShowDetailResponse {
        return TvShowDetailResponse(
            95557,
            "Invincible",
            "2021-03-26",
            listOf(45),
            "/ijDV8Z23iR5B2ftx0WggiXbfqGi.jpg",
            listOf(
                Genre(name = "Animation"),
                Genre(name = "Action & Adventure"),
                Genre(name = "Drama"),
                Genre(name = "Sci-Fi & Fantasy"),
            ),
            "Returning Series",
            "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
            8.9
        )
    }
}