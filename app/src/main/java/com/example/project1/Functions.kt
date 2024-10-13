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

fun withDefaultParameter(name: String =" Indra" , age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main (){
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", Age = 30)
    withDefaultParameter(age = 30)
    withReturn(5, 5)
}