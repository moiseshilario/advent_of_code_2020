package day3TobogganTrajectory

fun getNumberOfTrees(input: String) {
    var matrix = input.split('\n').toMutableList()
    val treeSpace = '#'
    val pace = 3
    var currentPosition = 0
    val rowLength = matrix[0].length
    var treesCut = 0

    for (i in 1 until matrix.size - 1) {
        if (currentPosition + pace > rowLength - 1) {
            currentPosition = (currentPosition + pace) - rowLength
        } else {
            currentPosition += pace
        }

        if (matrix[i][currentPosition] == treeSpace) {
            treesCut++

            matrix[i] = replaceChar(matrix[i], currentPosition, 'X')
        } else {
            matrix[i] = replaceChar(matrix[i], currentPosition, 'O')
        }
    }

    println(matrix)
    println("trees cut: $treesCut")
}

fun replaceChar(input: String, index: Int, newChar: Char): String {
    var string = input
    val chars = string.toCharArray()
    chars[index] = newChar
    string = String(chars)
    return string
}