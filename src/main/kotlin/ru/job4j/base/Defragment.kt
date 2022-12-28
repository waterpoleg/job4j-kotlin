package ru.job4j.base

fun defragment(array: Array<String?>): Array<String?> {
    var count = 0
    for (i in array.indices) {
        if (array[i] != null) {
            array[count++] = array[i]
        }
    }
    for (i in count until array.size) {
        array[i] = null;
    }
    return array
}
