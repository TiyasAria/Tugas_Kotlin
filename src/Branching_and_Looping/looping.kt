package Branching_and_Looping

fun main() {
//do while looping //
    var number = 0
   // var number = 7//
    do {
        println("Bismillah pasti bisa")
        number ++
    } while (number < 5 )
   /*
   ketika dijalankan  var number = 0 akan melakukan perulangan sebanyak 5x yakni (0-4) karena
   ada tambahan ++ jadi nambah 1, lalu ketika akan dijalankan var number = 7 akan muncul 1 kali aja,
   karena bernilai false, jadi do while akan menjalankan perulangan jika bernilai true, jika false
   hanya akan melakukan satu perulangan
    */

    // while loop //
    // var angka = 4 //
    var angka = 0
    while (angka <= 3){
        println("satukan langkah hamasah ilannajah")
        angka++
    }
    /* while loop akan menjalankan perulangan jika bernilai benar, contohnya  ketika variabel
     angka <= 3 makanya bisa run sebanyak 4x, nah tapi ketika kita masukin var angka = 4 maka ketika
     di run tidak melakukan perulangan sama sekali karena bernilai false, jadi while akan berjalan
     mengulangi ketika bernilai true
     */

    //for loop syntax //
    for (data in 1..5) println("Genin official")
// kalau for loop itu lebih simple
}
