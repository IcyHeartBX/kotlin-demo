package com.pix.kotlindemo

fun main(args: Array<String>) {
    print("KtMain run...")
    val a = 9.99F
    val price = """
        ${'$'}$a
    """.trimIndent()
    print(price)
}