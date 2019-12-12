import org.w3c.dom.get
import kotlin.browser.document
import kotlin.browser.localStorage
import kotlin.browser.sessionStorage
import kotlin.browser.window

fun main(args: Array<String>) {
    // lesson 1
    //println("hello world")

    // lesson 2 part 1
    val root=document.getElementById("root")
    root!!.innerHTML="<h1>Hello World</h1>"

    // lesson 2 part 2
    val x = 10
    val html =
"""
<h1>Hello</h1>
<p>$x</p>
<button id="b1" class="cls1 cls2">Click Me</button>
""".trimIndent()
    root.innerHTML=html
    val b1=document.getElementById("b1")
    b1!!.addEventListener("click", { println("clicked")})

    // lesson 3
    val div = document.createElement("div")
    val h1 = document.createElement("h1")
    val b2 = document.createElement("button")
    val b3 = document.getElementById("b1")
    val dtl = b3!!.classList // classList showed up
    println(dtl.length)
    println(dtl.get(0))// [0])
    println(dtl.get(1))//[1])
    dtl.add("cls3") // classList add
    dtl.remove("cls1") // classList remove
    println(dtl)
    //println(dtl[2])
    //print(b3!!.classList)
    h1.textContent="Hello 2"
//    h1.classList
//    h1.className
    b2.textContent="Click Me 2"
    b2.addEventListener("click", { println("clicked 2")})

    div.appendChild(h1)
    div.appendChild(b2)

    root.appendChild(div)

    // lesson 4

    // lesson 5
    val xyz:dynamic = js("window.xyz") // how we access in JavaScript
    println("xyz=$xyz" )
    val user:dynamic = js("window.user")
    println(user.firstName )
    val myFunction1:dynamic = js("window.myFunction1")
    myFunction1()
    val myFunction2:dynamic = js("window.myFunction2")
    myFunction2()
}
