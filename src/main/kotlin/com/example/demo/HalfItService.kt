package com.example.demo

class HalfItService {
    companion object {
        @JvmStatic
        fun halfItUsingKotlinService(value: Double): Double {
            return value / 2.0
        }
    }
}