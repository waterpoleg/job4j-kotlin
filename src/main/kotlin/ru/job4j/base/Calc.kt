package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun mult(first : Int, second : Int) : Int {
    return first * second
}

fun division(first : Int, second : Int) : Int {
    return first / second
}

fun main() {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val mul = mult(2, 2)
    println("2 * 2 = $mul")

    val div = division(4, 2)
    println("4 / 2 = $div")
}
