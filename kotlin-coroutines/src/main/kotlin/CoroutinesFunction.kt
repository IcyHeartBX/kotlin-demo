import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch {
       showWord()
    }
    println("hello ")

}

suspend fun showWord() {
    delay(1000L)
    println("word...")
}