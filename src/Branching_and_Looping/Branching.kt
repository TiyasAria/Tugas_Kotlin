package Branching_and_Looping

fun main() {

    // syntax else expression  //
    val nilaiUjian = 75
    if (nilaiUjian > 80) {
        println(" baguss pinter sekali")
    } else {
        println(" tetap sabar semangat, Allah bersamamu :)")
    }

    // syntax else if berlaku untuk kondisi if yang banyak //
    val nilaiRapot = 45
    if (nilaiRapot > 75) {
        println(" you getting score A")
    } else if (nilaiRapot > 50) {
        println(" you getting score B")
    } else if (nilaiRapot > 25) {
        println(" you getting score C")
    } else if (nilaiRapot > 0) {
        println(" you getting score A, you must study hard")
    }

    // syntax when //
    val nilaiAkhir = "C"
    when (nilaiAkhir) {
        "A" -> print(" MasyaAllah nilai bagus sekali")
        "B" -> print(" MasyaAllah nilai bagus")
        "C" -> print(" Allhamdulillah nilai sedang")
        "D" -> print(" Tingkatkan lagi ya belajarnya semangaat")
        "E" -> print(" Maaf anda tidak naik kelas karena sering bolos, silahkan coba tahun depan")
    }
}