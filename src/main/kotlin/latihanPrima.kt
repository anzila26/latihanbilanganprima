fun primaBilangan(bilangan1 : Int) : Boolean {
            if (bilangan1 <= 1) {
                return false
            }

            for (i in 2 .. bilangan1 / 2){
                if (bilangan1 % i == 0) {
                    return false
                }
            }
            return true
}

fun main() {
    println("Masukkan angka :")
    val bilangan1 = readLine()?.toInt()

    if(bilangan1 != null) {
        val isPrime = primaBilangan(bilangan1)
        if (isPrime) {
            println("$bilangan1 adalah bilangan prima")
        } else{
            println("$bilangan1 bukan bilangan prima")
        }
    } else {
        println("Tidak valid")
    }
}