package demo.submodule.app

class App {

    val svc1: demo.submodule.svc1.Library = demo.submodule.svc1.Library()

    fun hello() {
        println(svc1.hello("SVC1"))
    }

}

fun main(args: Array<String>) {
    App().hello()
}
