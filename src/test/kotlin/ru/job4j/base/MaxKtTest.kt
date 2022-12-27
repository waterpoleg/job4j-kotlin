package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxKtTest : StringSpec({

    "1 or 1 = 1" {
        max(1, 1) shouldBe 1
    }

    "1 or 3 = 3" {
        max(1, 3) shouldBe 3
    }

    "-2 or 0 = 0" {
        max(-2, 0) shouldBe 0
    }

    "-2 or 0 or 5 = 5" {
        maxFromThree(-2, 0, 5) shouldBe 5
    }

    "1 or 2 or 3 = 3" {
        maxFromThree(1, 2, 3) shouldBe 3
    }

    "5 or 5 or 5 = 5" {
        maxFromThree(5, 5, 5) shouldBe 5
    }
})
