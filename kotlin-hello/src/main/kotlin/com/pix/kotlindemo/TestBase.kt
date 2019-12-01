package com.pix.kotlindemo

import java.nio.file.Files
import java.nio.file.Paths

class TestBase {
    fun test () {
        println("FUNC TestBase::test()");
        var a = sum(1,2)
        var b = sum1(2,3)
        printSum(4,5)
        testStringTemplate()

        // 条件判断
        if(a > b) {

        }
        else {

        }

        // 三目运算
        var c = if(a > b) a else b

        testList()
        testClass()

        // array
        val asc = Array(5,{i -> (i * i).toString()})


    }

    // 带参数和返回值函数
    fun sum(a:Int,b:Int): Int {
        return a + b
    }

    // 自动推断函数
    fun sum1(a:Int,b:Int) = a + b

    // no-return function
    fun printSum(a:Int,b:Int) {
        println("$a + $b = ${a+b}")
    }

    fun testVariable() {
        var a : Int = 3
        var b = 4
        var c : Int
        c = 5;

    }

    // string template
    fun testStringTemplate() {
        var a = 5
        var text = "a is $a"
        println(text)

        var b = 2
        // 模板中的任意表达式：
        val s2 = "${text.replace("is", "was")}, but now is $b"
        println(s2)
    }

    // 测试集合
    fun testList() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
        items.firstOrNull();

        for(index in items.indices) {
            println("$index is ${items[index]}")
        }
    }

    // Test class
    data class Student(var name:String,var age:Int)

    object KTManager {
        var info = "manager"
    }

    fun testClass () {
        var stu1:Student? = Student("zhangsan",30)
        stu1?.name = "lisi"
        println(stu1?.toString())
        println("Sigleton,info :${KTManager.info}")
    }

    fun testBoolean() {
        var b : Boolean ? = true;
        if(true == b){

        }
        var b2 = true;
        if(b2) {

        }
    }

    // Trinocular operation
    fun maxOf(a:Int,b:Int):Int  = if (a > b) a else b

    fun inputStream() {
        val stream = Files.newInputStream(Paths.get("/xxx/xxx"))
        stream.buffered().reader().use { reader->
            println(reader.readText())
        }
    }
}