fun foo(x: Int) {
    var y = x
    y++
    println(y)
    ++y
    println(y)
    y += 2
    println(y)
}

// LINES: 9 2 3 4 5 6 7 8