package com.dicoding.picodiploma.submission.utils

import com.dicoding.picodiploma.submission.data.DataEntity

object DataDummy {

    fun generateDummyMovies(): List<DataEntity>{
        val movies = ArrayList<DataEntity>()

        movies.add(DataEntity("m1",
            "Godzilla vs. Kong",
            "Mar 24, 2021",
            "1h 53m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
            "Action, Science Fiction",
            "PG-13",
            "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
            false,
            "83"))
        movies.add(DataEntity("m2",
            "Zack Snyder's Justice League",
            "Mar 18, 2021",
            "4h 2m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
            "Action, Adventure, Fantasy, Science Fiction",
            "R",
            "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
            false,
            "85"))
        movies.add(DataEntity("m3",
            "Thunder Force",
            "Apr 09, 2021",
            "1h 47m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/279yOM4OQREL36B3SECnRxoB4MZ.jpg",
            "Action, Adventure, Comedy, Fantasy",
            "PG-13",
            "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
            false,
            "59"))
        movies.add(DataEntity("m4",
            "Mortal Kombat",
            "Apr 14, 2021",
            "1h 50m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8yhtzsbBExY8mUct2GOk4LDDuGH.jpg",
            "Fantasy, Action, Adventure",
            "R",
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
            false,
            "73"))
        movies.add(DataEntity("m5",
            "Chaos Walking ",
            "Apr 07, 2021",
            "1h 49m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9kg73Mg8WJKlB9Y2SAJzeDKAnuB.jpg",
            "Science Fiction, Action, Adventure, Thriller\n",
            "PG-13",
            "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
            false,
            "74"))
        movies.add(DataEntity("m6",
            "Raya and the Last Dragon ",
            "Mar 03, 2021",
            "1h 47m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
            "Animation, Adventure, Fantasy, Family, Action",
            "R13+",
            "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
            false,
            "83"))
        movies.add(DataEntity("m7",
            "Mortal Kombat Legends: Scorpion's Revenge",
            "Apr 12, 2020",
            "1h 20m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4VlXER3FImHeFuUjBShFamhIp9M.jpg",
            "Animation, Action, Fantasy",
            "R",
            "After the vicious slaughter of his family by stone-cold mercenary Sub-Zero, Hanzo Hasashi is exiled to the torturous Netherrealm. There, in exchange for his servitude to the sinister Quan Chi, he’s given a chance to avenge his family – and is resurrected as Scorpion, a lost soul bent on revenge. Back on Earthrealm, Lord Raiden gathers a team of elite warriors – Shaolin monk Liu Kang, Special Forces officer Sonya Blade and action star Johnny Cage – an unlikely band of heroes with one chance to save humanity. To do this, they must defeat Shang Tsung’s horde of Outworld gladiators and reign over the Mortal Kombat tournament.",
            false,
            "84"))
        movies.add(DataEntity("m8",
            "Monster Hunter",
            "Jan 13, 2021",
            "1h 44m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1UCOF11QCw8kcqvce8LKOO6pimh.jpg",
            "Fantasy, Action, Adventure",
            "PG-13",
            "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
            false,
            "71"))
        movies.add(DataEntity("m9",
            "Twist",
            "Jan 22, 2021",
            "1h 30m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/29dCusd9PwHrbDqzxNG35WcpZpS.jpg",
            "Crime, Drama, Action",
            "12",
            "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.",
            false,
            "70"))
        movies.add(DataEntity("m10",
            "Tom & Jerry",
            "Mar 10, 2021",
            "1h 41m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6KErczPBROQty7QoIsaa6wJYXZi.jpg",
            "Comedy, Family, Animation",
            "PG",
            "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
            false,
            "74"))

        return movies
    }

    fun generateDummyTvShows(): List<DataEntity>{

        val tvShows = ArrayList<DataEntity>()

        tvShows.add(DataEntity(
            "tv1",
            "The Falcon and the Winter Soldier",
            "Mar 19, 2021",
            "50m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
            "Sci-Fi & Fantasy, Action & Adventure, Drama, War & Politics",
            "TV-14",
            "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
            false,
            "79"))
        tvShows.add(
            DataEntity(
            "tv2",
            "The Good Doctor",
            "Sep 25, 2017",
            "43m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
            "Drama",
            "TV-14",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
            false,
            "86"))
        tvShows.add(
            DataEntity(
            "tv3",
            "The Flash",
            "Oct 07, 2014",
            "44m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
            "Drama, Sci-Fi & Fantasy",
            "TV-14",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            false,
            "77"))
        tvShows.add(
            DataEntity(
            "tv4",
            "Invincible",
            "Mar 26, 2021",
            "45m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
            "Animation, Action & Adventure, Drama\n",
            "TV-MA",
            "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
            false,
            "89"))
        tvShows.add(
            DataEntity(
            "tv5",
            "Riverdale",
            "Jan 26, 2017",
            "45m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
            "Mystery, Drama, Crime",
            "TV-14",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            false,
            "86"))
        tvShows.add(
            DataEntity(
            "tv6",
            "Grey's Anatomy",
            "Mar 27, 2005",
            "43m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
            "Drama",
            "TV-14",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            false,
            "82"))
        tvShows.add(
            DataEntity(
            "tv7",
            "WandaVision",
            "Jan 15, 2021",
            "36m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
            "Sci-Fi & Fantasy, Mystery, Drama",
            "TV-14",
            "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
            false,
            "84"))
        tvShows.add(
            DataEntity(
            "tv8",
            "Lucifer",
            "Jan 25, 2016",
            "45m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
            "Crime, Sci-Fi & Fantasy",
            "TV-14",
            "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
            false,
            "85"))
        tvShows.add(
            DataEntity(
            "tv9",
            "Who Killed Sara? ",
            "Mar 24, 2021",
            "40m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg",
            "Drama, Crime, Mystery",
            "TV-MA",
            "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
            false,
            "78"))
        tvShows.add(
            DataEntity(
            "tv10",
            "The Walking Dead",
            "Oct 31, 2010",
            "42m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
            "Action & Adventure, Drama, Sci-Fi & Fantasy\n",
            "TV-MA",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            false,
            "81"))

        return tvShows
    }

}