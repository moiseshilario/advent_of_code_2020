package day2

fun validatePassword2(passwords: List<String>): Int {
    var validPasswords = 0
    for (p in passwords) {
        val indexOfSpace = p.indexOf(" ")
        val indexOfDash = p.indexOf("-")
        val minRule = p.substringBefore("-").toInt()
        val maxRule = p.subSequence(indexOfDash + 1, indexOfSpace).toString().toInt()
        val specialChar = p[indexOfSpace + 1]
        val password = p.substringAfterLast(": ")

        var instances = 0

        if (password.elementAtOrNull(minRule - 1) == specialChar) {
            instances++
        }

        if (password.elementAtOrNull(maxRule - 1) == specialChar) {
            instances++
        }

        if (instances == 1) {
            println("$p is valid")
            validPasswords++
        }
    }

    return validPasswords
}
