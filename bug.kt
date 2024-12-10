```kotlin
fun processData(data: String): String {
    val regex = Regex("\\d+"
    val matches = regex.findAll(data)
    val numbers = matches.map { it.value.toInt() }
    return numbers.sum().toString()
}
```