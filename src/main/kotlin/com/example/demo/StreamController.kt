package com.example.demo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class StreamController {
    @PostMapping("/stream/")
    fun stream(
        @RequestBody numbers: List<Int>,
    ): String {
        return "There are ${numbers.count()} numbers. \n" +
                "They sum up to ${numbers.sum()}. \n" +
                "Only counting the even ones gives ${numbers.filter{n->n%2==0}.count()} entries, \n" +
                "and their doubles sum up to ${numbers.filter{n->n%2==0}.map{n->n*2}.sum()}"
    }

}
