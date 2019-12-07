import kotlin.browser.document

fun main(args: Array<String>) {
    // lesson 1
    //println("hello world")

    // lesson 2 part 1
    val root=document.getElementById("root")
    /*root!!.innerHTML="<h1>Hello World</h1>"

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
     */

    // lesson 3
//    val div = document.createElement("div")
//    val h1 = document.createElement("h1")
//    val b1 = document.createElement("button")
//
//    h1.textContent="Hello 2"
//    b1.textContent="Click Me 2"
//    b1.addEventListener("click", { println("clicked 2")})
//
//    div.appendChild(h1)
//    div.appendChild(b1)
//
//    root!!.appendChild(div)

    // lesson 4

    // lesson 5
    val xyz:dynamic = js("window.xyz") // how we access in JavaScript
    println(xyz )
}
