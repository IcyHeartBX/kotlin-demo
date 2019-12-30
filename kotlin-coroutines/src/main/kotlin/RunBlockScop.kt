import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking<Unit>{
    launch {
        delay(200L)
        println("launch print ...")
    }
    coroutineScope {
        // 非阻塞式挂起
        launch {
           delay(500L)
            println("coroutine launch ...")
        }
        delay(100L)
        println("coroutine scope print ...")
    }
    println("main  end print ...")

}