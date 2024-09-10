package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PatternMatching {
    @GetMapping("/patternMatching/{type}")
    fun doubleUp(
        @PathVariable type: Type,
    ): ResultData {
        when (type) {
            Type.IntType -> return generateMessage(5)
            Type.StringType -> return generateMessage("Hallo")
            Type.DoubleType -> return generateMessage(2.3)
            Type.ObjectType -> return generateMessage(ResultData("Test"))
        }
    }

    fun generateMessage(unknownObject: Any): ResultData {
        when (unknownObject) {
            is Int -> return ResultData("Int erhalten")
            is String -> return ResultData("String erhalten")
            is Double -> return ResultData("Double erhalten")
            else -> return ResultData("Unbekanntes Objekt erhalten")
        }
    }
}
