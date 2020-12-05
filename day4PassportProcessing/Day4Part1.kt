package day4PassportProcessing

val REQUIRED_FIELDS = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")

fun validatePassport(input: String) {
    val documents = input.split("\n\n")
    documents.forEach {
        it.replace('\n', ' ')
    }

    var validDocuments = 0

    for (doc in documents) {
        val formattedDoc = doc.replace("\n", " ")
        val fields = formattedDoc.split(' ')
        var numberOfValidFields = 0

        for (field in fields) {
            val fieldName = field.substringBefore(':')

            if (REQUIRED_FIELDS.contains(fieldName)) {
                numberOfValidFields++
            }
        }

        if (numberOfValidFields == REQUIRED_FIELDS.size) {
            println("Document is valid:\n$doc\n")
            validDocuments++
        }
    }

    println("Valid documents: $validDocuments")
}
