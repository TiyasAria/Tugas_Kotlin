fun main() {
 val nilaiHadir = 80
 val nilaiIzin = 60
 val nilaiAlfa = 40

    val passNilaiHadir = nilaiHadir > 70
    val passNilaiIzin = nilaiIzin > 65
    val passNilaiAlfa = nilaiAlfa > 50

    // syntax bernilai true
    val pass = passNilaiHadir || passNilaiIzin || passNilaiIzin
    println(pass)

    //syntax bernilai false
    val pass2 = passNilaiHadir && passNilaiIzin && passNilaiAlfa
    println(pass2)

}