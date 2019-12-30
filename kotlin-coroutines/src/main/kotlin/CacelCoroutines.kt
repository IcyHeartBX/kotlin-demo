import kotlinx.coroutines.*

/**
 * Two methods that cancel calculate coroutines
 * 1. isActive
 * 2. try...finally...
 */
fun main(args: Array<String>) = runBlocking<Unit>{
   val startTime = System.currentTimeMillis()
   var job = launch(Dispatchers.Default) {
      var nextPrintTime = startTime
      var i = 0
      while (isActive) {
         if(System.currentTimeMillis() >= nextPrintTime) {
            println("job:I'm sleeping ${i++} ...")
            nextPrintTime += 500L
         }
      }
   }
   delay(1300L)
   println("main:I'm tired of waiting!")
   job.cancelAndJoin()
   println("main:Now I can quit!")
    tryFinallyExample()
}

/**
 * 2. try method
 */
fun tryFinallyExample() = runBlocking{
  val job = launch{
     try {
       repeat(1000) {i  ->
            println("job: I'm sleeping $i ...")
           delay(500L)
       }
     }
     finally {
         println("job: I'm running finally")
     }
  }
    delay(1300L)
    println("main:I'm tired of waiting")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}