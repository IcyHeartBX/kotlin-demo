package com.pix.kotlindemo

open class A {
    open fun f() = print("A")
    fun a() = print("a")
}

interface B {
    fun f() = print("B")
    fun b() = print("b")
}

fun main(args: Array<String>) {
    print("KtMain run...")
    val a = 9.99F
    val price = """
        ${'$'}$a
    """.trimIndent().also(::println)
    class C() : A(),B {
        override fun f() {
            super<A>.f()
            super<B>.f()
        }

        override fun b() {
            super.b()
        }
    }
}