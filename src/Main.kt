import kotlin.browser.document

fun main(args: Array<String>) {
    println("hello world")

    var root=document.getElementById("root")
    root!!.innerHTML="<h1>Hello World</h1>"
}
