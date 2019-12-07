import kotlin.browser.document

fun main(args: Array<String>) {
    // lesson 1
    println("hello world")

    // lesson 2 part 1
    val root=document.getElementById("root")
    root!!.innerHTML="<h1>Hello World</h1>"

    // lesson 2 part 2
    val x = 10
    val html =
"""
<h1>Hello</h1>
<p>$x</p>
<button id="b1">Click Me</button>
""".trimIndent()
    root.innerHTML=html
    val b1=document.getElementById("b1")
    b1!!.addEventListener("click", { println("clicked")})
}
