package com.example.project1

class Motor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "mary@gmail.com")

    println(contact.email)
}