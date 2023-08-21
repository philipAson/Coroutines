import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        simpleFunction()
    }

    // SUSPEND FUNCTIONS CAN ONLY BE RUN IN SUSPEND FUNCTIONS or in a coroutine!!!
//    simpleFunction() *!*ERROR*!*

    Thread.sleep(2000)
}

suspend fun simpleFunction() {
    delay(1000)
    println("suspend function")
}