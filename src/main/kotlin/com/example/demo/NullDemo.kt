//package com.example.demo
//
//class NullDemo {
//    fun NullDemo() {
//        val a: int = 2
//
//        // Does not work, as a is val
//        a=3
//
//        var b=5
//        b=6
//
//        // Does not work, as b is not nullable
//        b=null
//
//
//        var c: Int? = 3
//        c=null
//
//        var classWithMethods: ClassWithMethods? = ClassWithMethods()
//
//        //Does not work, as classWithMethods might be null
//        classWithMethods.getClassWithMethods()
//
//        //Safe call: Returns null if the object is null
//        classWithMethods?.getClassWithMethods(true)?.getClassWithMethods(false)?.getClassWithMethods(false)?.getClassWithMethods(true)
//
//        //Using the Not-Null-Assertion-Operator. This way, a Null Pointer Exception is thrown if something is Null
//        classWithMethods!!.getClassWithMethods(true)!!.getClassWithMethods(false)!!.getClassWithMethods(false)!!.getClassWithMethods(true)
//
//
//    }
//
//    class ClassWithMethods{
//        fun getClassWithMethods(returnNull: Boolean): ClassWithMethods? {
//
//            return if (returnNull) null else ClassWithMethods()
//        }
//    }
//
//}