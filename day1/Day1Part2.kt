package day1

fun calculate3Expenses(expenses: IntArray): Int? {
    var array2 = expenses.drop(1)
    var array3 = expenses.drop(2)
    for (i in expenses) {
        for (j in array2) {
            for (k in array3) {
                if (i + j + k == 2020) {
                    return i * j * k
                }
            }
        }
    }
    return null
}