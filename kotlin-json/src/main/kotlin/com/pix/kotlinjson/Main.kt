package com.pix.kotlinjson

import com.google.gson.Gson

object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        println("--------------------test kotlin start----------------------------")
        println("---parse object---")
        var objString = "{\"name\":\"zhangsan\", \"age\":11}"
        var gson = Gson()
        var user = gson.fromJson<User>(objString)
        print(user)

        println("---parse list----")
        var listString = """
        {
            "userlist":[{"name":"zhangsan","age":12},{"name":"lisi","age":18}]
        }
        """.trimIndent()
        var userList = gson.fromJson<UserList>(listString)
        println(userList)





        println()
        println("--------------------test kotlin end ----------------------------")
    }
}