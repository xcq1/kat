package com.xcq1.kat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KatApplication

fun main(args: Array<String>) {
    runApplication<KatApplication>(*args)
}
