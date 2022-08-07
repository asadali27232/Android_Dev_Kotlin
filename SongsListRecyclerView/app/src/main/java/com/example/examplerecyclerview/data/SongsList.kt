package com.example.examplerecyclerview.data

class SongsList {
    fun prepare(): List<Song> {
        return listOf<Song>(
            Song("Pasoori" , "Ali Sethi x Shae Gill"),
            Song("Tu Mera Na Hua" , "Dum Mastam"),
            Song("Sang-e-Mah","OST By Atif Aslam"),
            Song("Khudaya Vey" , "Dum Mastam"),
            Song("Mere HumSafar" , "OST I Amanat Ali I Yashal Shahid"),
            Song("Lambiya Judaiyan" , "Bilal Saeed"),
            Song("Badzaat" , "OST | Wajhi Farooki"),
            Song("Beqarar Dil" , "Dum Mastam"),
            Song("Kana Yaari" , "Kaifi Khalil x Eva B x Abdul Wahab Bugti"),
            Song("Humraazi" , "Ruposh")
        )
    }
}