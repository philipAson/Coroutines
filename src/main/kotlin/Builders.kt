import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlin.random.Random

suspend fun main() {
    coroutineScope {
        val firstDeferred = async {
            println("1st result")
            getValue(1000) }

        val secondDeferred = async { getValue(2000) }

        println("Doing some processing")
        delay(500)

        firstDeferred.await()
        
        println(firstDeferred.await())

        println(secondDeferred.await())

        println("Finished processing")
    }

    Thread.sleep(4000)
}

suspend fun getValue(delay: Long): Int {
    delay(delay)
    return Random.nextInt()
}