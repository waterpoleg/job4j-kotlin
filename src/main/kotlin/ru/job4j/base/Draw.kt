package ru.job4j.base

fun draw(size: Int) {
    for (y in 0 until size) {
        for (x in 0 until size) {
            if (x == y || (x + y == size - 1)) print("X") else print(" ")
        }
        println()
    }
}

fun main() {
    draw(9)
}
