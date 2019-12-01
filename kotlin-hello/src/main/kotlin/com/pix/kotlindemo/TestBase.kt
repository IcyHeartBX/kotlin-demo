package com.pix.kotlindemo

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

    }

    // 带参数和返回值函数
    fun sum(a:Int,b:Int): Int {
        return a + b
    }

    // 自动推断函数
    fun sum1(a:Int,b:Int) = a + b

    // 无返回值函数
    fun printSum(a:Int,b:Int) {
        println("$a + $b = ${a+b}")
    }

    fun testVariable() {
        var a : Int = 3
        var b = 4
        var c : Int
        c = 5;

    }

    // 字符串模板
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

        for(index in items.indices) {
            println("$index is ${items[index]}")
        }
    }

    // 测试类
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

}