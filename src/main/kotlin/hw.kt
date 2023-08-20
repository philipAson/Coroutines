import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("Couroutines")
    }
    print("Hello ")
    Thread.sleep(2000)
}