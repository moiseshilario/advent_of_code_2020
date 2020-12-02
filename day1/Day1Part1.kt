package day1

fun calculate2Expense(expenses: IntArray): Int? {
    for (i in expenses) {
        for (j in expenses) {
            if (i + j == 2020) {
                return i * j
            }
        }
    }
    return null
}
