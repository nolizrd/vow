//package com.example.rabbits


fun countVowels (str: String) : Int{
    var count = 0
    val vowels = arrayOf('a','e','i','o','u')
    for (letter in str.lowercase()){
        if (letter in vowels) {
            count++
        }

    }
    return count
}

fun main() {
    println(countVowels("abcdeaaaaaaafg"))
}
