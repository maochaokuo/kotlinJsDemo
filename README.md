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
    
### lesson 2 or above
1. lesson 2, pure kotlin language
2. lesson 3, dom object
3. lesson 4, kotlinx.html, 要安裝一個jar, 看起來沒什麼特別。先跳過
4. lesssn 5, interact with javascript

(see source code comments)

### hot keys (short cut)
1. Ctrl-F9 build
2. Ctrl-K commit, type in description
3. then Ctrl-Alt-K push
4. Ctrl-S, save all
5. block comment
  1. Ctrl-/ (toggle selected line comment)
  2. Ctrl-Shift-/ (toggle block comment)
    