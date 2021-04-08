package com.chetan.kotlin_basic

fun main(){
// Integer types
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    println("Int number "+one)
    println("Long number "+threeBillion)
    println("Long number "+oneLong)
    println("Byte number "+oneByte)
    println("===============================================================")

    // Float types

    fun printDouble(d: Double) { print(d) }

    val i = 1
    val d = 1.0
    val f = 1.0f

    println(i)
    printDouble(d)
    println(f)

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    print(firCharInStr+"    "+lastCharInStr)
}