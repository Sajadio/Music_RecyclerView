package com.example.music_recyclerview.data

object DataManger {
    private val songs = listOf(
        Music(
            0,
            "Starry Nights",
            "John Doe",
            "https://images.unsplash.com/photo-1500462918059-b1a0cb512f1d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80"
        ),
        Music(
            1,
            "Midnight Memories",
            "Jane Smith",
            "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
        ),
        Music(
            2,
            "Electric Dreams",
            "Bob Johnson",
            "https://images.unsplash.com/photo-1504898770365-14faca6a7320?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=934&q=80"
        ),
        Music(
            3,
            "Summer Breeze",
            "Emily Brown",
            "https://images.unsplash.com/photo-1607499699372-7bb722dff7e2?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
        ),
        Music(
            4,
            "Lost in Love",
            "Jack White",
            "https://images.unsplash.com/photo-1620121692029-d088224ddc74?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1932&q=80"
        ),
        Music(
            5,
            "Chasing Rainbows",
            "Sophie Lee",
            "https://images.unsplash.com/photo-1620121684840-edffcfc4b878?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2064&q=80"
        ),
        Music(
            6,
            "Moonlight Sonata",
            "David Kim",
            "https://images.unsplash.com/photo-1679464307375-ad8ab6a70029?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=928&q=80"
        ),
        Music(
            7,
            "Breaking Free",
            "Karen Lee",
            "https://images.unsplash.com/photo-1603665301175-57ba46f392bf?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80"
        ),
        Music(
            8,
            "Echoes of the Past",
            "Daniel Park",
            "https://images.unsplash.com/photo-1680070568461-0342ba529988?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
        ),
    )

    fun getNewMusic() = songs

    fun getSongByTitle(title: String): List<Music> {
        return songs.filter { it.title.contains(title, ignoreCase = true) }
    }
}