import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

/**
 * This is demo that is coroutines of kotlin.
 */
fun main(args: Array<String>) {
    // 第一种写法
    GlobalScope.launch{ //在后台启动一个新的协程并继续
        delay(1000L)   // 非阻塞等待1s
        println("coroutines ....") // 延迟的打印
    }

    // 第二种写法
    thread {
        Thread.sleep(2000L)
        println("coroutines 2...")
    }

    println("hello kotlin ") // 上面的代码不影响主线程的执行
//    Thread.sleep(5000) // 阻塞5s保证JVM存活
    runBlocking {
        delay(5000L)
    }
}