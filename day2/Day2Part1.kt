package day2

fun validatePassword(passwords: List<String>): Int {
    var validPasswords = 0
    for (p in passwords) {
        var indexOfSpace = p.indexOf(" ")
        var indexOfDash = p.indexOf("-")
        var minRule = p.substringBefore("-").toInt()
        var maxRule = p.subSequence(indexOfDash + 1, indexOfSpace).toString().toInt()
        var specialChar = p[indexOfSpace + 1]
        var password = p.substringAfterLast(": ")

        var instances = 0

        for (char in password) {
            if (char == specialChar) {
                instances++
            }
        }

        if (instances >= minRule && instances <= maxRule) {
            println("$p is valid")
            validPasswords++
        }
    }

    return validPasswords
}
