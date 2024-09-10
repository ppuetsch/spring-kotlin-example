package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.example.demo.DoubleUpService.doubleUpUsingJavaService

@RestController
@RequestMapping("/api")
class DoubleUpController {
    @GetMapping("/doubleUp/{input}")
    fun doubleUp(
        @PathVariable input: Int,
    ): Int = 2 * input

    @GetMapping("/doubleUpWithJava/{input}")
    fun doubleUpWithJava(
        @PathVariable input: Int,
    ): Int {
       return doubleUpUsingJavaService(input)
    }
}
