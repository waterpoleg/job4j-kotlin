package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class DefragmentKtTest : StringSpec ({

    "First el is not null" {
        defragment(arrayOf(
            "0", null, "2", "3", null, null, "6"
        )) shouldBe arrayOf(
            "0", "2", "3", "6", null, null, null
        )
    }

    "First el is null" {
        defragment(arrayOf(
            null, "0", null, "2", "3", null, null, "6"
        )) shouldBe arrayOf(
            "0", "2", "3", "6", null, null, null, null
        )
    }

    "Only one is not null" {
        defragment(arrayOf(
            null, null, null, "1", null
        )) shouldBe arrayOf(
            "1", null, null, null, null
        )
    }
})
