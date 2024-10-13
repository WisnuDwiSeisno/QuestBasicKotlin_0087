package com.example.project1

fun withoutParameter(){
    println("== withoutParameter")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("== Hello, $name!")
}

// named argument
// named argument merupakan cara untuk mengambil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, Age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $Age years old.")
}