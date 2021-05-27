package com.example.imports_not_optimized2

const val globalVal: String = ""

var globalVar: String = ""

fun globalFun(): String = ""

object GlobalObject {
  val objectVal: String = ""

  var objectVar: String = ""

  fun objectFun(): String = ""

  @JvmStatic
  fun staticFun(): String = ""
}

class KotlinClass {
  companion object {
    val companionVal: String = ""

    fun companionFun(): String = ""

    @JvmStatic
    fun staticCompanionFun(): String = ""
  }
}
