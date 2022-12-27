package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcKtTest : StringSpec({

    "1 + 1 = 2" {
        add(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        subtract(1, 1) shouldBe 0
    }

    "2 * 2 = 4" {
        mult(2, 2) shouldBe 4
    }

    "4 / 2 = 2" {
        division(4, 2) shouldBe 2
    }
})
