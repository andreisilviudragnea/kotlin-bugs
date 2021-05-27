package com.example.imports_not_optimized2.another_package;

import com.example.imports_not_optimized2.KotlinClass;
import com.example.imports_not_optimized2.KotlinFileKt;
import com.example.imports_not_optimized2.GlobalObject;

public class Main {

    public static void main(String[] args) {
        System.out.println(KotlinFileKt.globalVal);
        System.out.println(KotlinFileKt.getGlobalVar());
        System.out.println(KotlinFileKt.globalFun());

        System.out.println(GlobalObject.INSTANCE.getObjectVal());
        System.out.println(GlobalObject.INSTANCE.getObjectVar());
        System.out.println(GlobalObject.INSTANCE.objectFun());
        System.out.println(GlobalObject.staticFun());

        System.out.println(KotlinClass.Companion.getCompanionVal());
        System.out.println(KotlinClass.Companion.companionFun());
        System.out.println(KotlinClass.Companion.staticCompanionFun());
        System.out.println(KotlinClass.staticCompanionFun());
    }
}
