package kr.ac.kumoh.s20221360.w24w05thymeleaf.service

import kr.ac.kumoh.s20221360.w24w05thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random


@Service
class SongService(val repository: SongRepository) {
    fun getRandomSong() = repository.getSong(Random.nextInt(repository.songsSize))
    fun getAllSongs() = repository.fetchSong()
}