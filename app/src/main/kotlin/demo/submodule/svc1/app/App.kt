package demo.submodule.app

class App {

    val svc1: demo.submodule.svc1.Library = demo.submodule.svc1.Library()

    fun hello() {
        println(svc1.hello("SVC1"))
    }

    val svc2: demo.submodule.svc1.LibrarySvc2 = demo.submodule.svc1.LibrarySvc2()

    fun helloSvc2(){
        println(svc2.hello("SVC2"))
    }
}

fun main(args: Array<String>) {
    App().hello()
    App().helloSvc2()
}
