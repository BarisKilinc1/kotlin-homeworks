package com.example.kotlindersleri.Oop_dersi

class Odev2 {
    fun soru1(derece: Int): Double {
        var fahrenhiet=derece*1.8+32

        return fahrenhiet
    }


    fun soru2(kenar1: Int, kenar2: Int) {

        val cevre=2*(kenar1+kenar2)
        println("Dikdortgenin Cevresi: $cevre")

    }
    fun soru3(sayi: Int): Int {
        var sonuc =1
        for (a in sayi downTo  1)
            sonuc = a * sonuc

        return sonuc

    }
    fun soru4(kelime: String) {
        var sayac = 0

        for (harf in kelime ){
            if (harf=='a' || harf=='A') {
                sayac++
            }
        }
    println("Bu kadar a harfi vardir: $sayac")

    }

    fun soru5(kenarsayisi: Int): Int {
        var toplam=(kenarsayisi-2)*180
        return toplam

    }

    fun soru6(günsayisi: Int): Int {

        var saat=günsayisi*8
        if (saat<=160){
          var toplam=saat*10
            return toplam
        }
        else{
            var toplam1=(saat-160)*20
            var toplamücret=1600+toplam1
            return toplamücret
        }
        
    }
    fun soru7(kota: Int): Int {
        if (kota<=50){
            var ödeme=100
            return ödeme
        }
        else if(kota>50){
            var toplam=(kota-50)*4
            return toplam
        }
        return 0
        
    }
    fun sonuc(){
        println("---------------")

    }

}
