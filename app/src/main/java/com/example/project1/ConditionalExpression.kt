package com.example.project1

import java.lang.NumberFormatException

fun ConditionalStatement(){
    println("=== Conditional Expression ===")

    // if-else
    val number = 10
    if (number > 0){
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // when
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    // Try-Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException){
        println("Invalid Number")
    }
}
fun Perulangan(){
    println()
    println("=== Perulangan ===")

    for (i in 1..5){
        println("Perulangan ke-$i")
    }

}