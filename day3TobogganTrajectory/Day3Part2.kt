package day3TobogganTrajectory

fun getNumberOfTrees2(input: String, slope: Slope) {
    var matrix = input.split('\n').toMutableList()
    val treeSpace = '#'
    val pace = slope.right
    var currentPosition = 0
    val rowLength = matrix[0].length
    var treesCut = 0

    for (i in slope.down until matrix.size step slope.down) {
        if (currentPosition + pace > rowLength - 1) {
            currentPosition = (currentPosition + pace) - rowLength
        } else {
            currentPosition += pace
        }

        if (matrix[i][currentPosition] == treeSpace) {
            treesCut++

            matrix[i] = replaceChar2(matrix[i], currentPosition, 'X')
        } else {
            matrix[i] = replaceChar2(matrix[i], currentPosition, 'O')
        }
    }

    println(matrix)
    println("trees cut: $treesCut")
}

fun replaceChar2(input: String, index: Int, newChar: Char): String {
    var string = input
    val chars = string.toCharArray()
    chars[index] = newChar
    string = String(chars)
    return string
}