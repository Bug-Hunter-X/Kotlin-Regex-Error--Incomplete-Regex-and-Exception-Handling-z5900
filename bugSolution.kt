```kotlin
fun processData(data: String): String {
    val regex = Regex("\d+")
    val numbers = mutableListOf<Int>()
    try {
        numbers.addAll(regex.findAll(data).map { it.value.toInt() })
    } catch (e: NumberFormatException) {
        println("Error converting to integer: "+ e.message)
    }
    return numbers.sum().toString()
}
```