package com.example.kotlindersleri.Oop_dersi

fun main() {

    var obj= Odev2()

    obj.sonuc()
    var sonuc1=obj.soru1(23)
    println(" Fahrenhiet sonuc: $sonuc1")
    obj.sonuc()

    obj.soru2(7,4)
    obj.sonuc()

    var sonuc3=obj.soru3(5)
    println("Faktoriyeli: $sonuc3")
    obj.sonuc()

    obj.soru4("Antalya")
    obj.sonuc()

    var sonuc5=obj.soru5(8)
    println("Ic acilar toplami: $sonuc5")
    obj.sonuc()

    var sonuc6=obj.soru6(25)
    println("Alinacak maas: $sonuc6 TL")
    obj.sonuc()

    var sonuc7=obj.soru7(69)
    println("Odenecek ucret: $sonuc7 TL")
    obj.sonuc()

}