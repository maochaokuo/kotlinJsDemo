# Kotlin Javascript Demo

## IntelliJ

### lesson 1

1. add src/Main.kt (may type psvma for a default main)
2. just build it
3. add root index.html, and manually add:
```
<script src="out/production/<projectName>/lib/kotlin.js"></script>
<script src="out/production/<projectName>/<projectName>.js"></script>
```
4. may not run Kotlin from IntelliJ, right click 
    index.html (or other page), choose open in browser,
    and also which browser, then that is it
5. the println result will be in browser developer tool
    (ex: chrome by press F12 or Ctrl-Shift-J, "console" part)
    