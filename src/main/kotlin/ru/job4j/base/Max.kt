package ru.job4j.base

fun max(first: Int, second: Int) = if (first > second) first else second

fun maxFromThree(first: Int, second: Int, third: Int) = max(first, max(second, third))

