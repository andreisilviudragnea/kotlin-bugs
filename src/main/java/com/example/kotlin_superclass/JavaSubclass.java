package com.example.kotlin_superclass;

import com.example.kotlin_superclass.another.ExtensionsKt;
import com.example.kotlin_superclass.another.More;

public class JavaSubclass extends SuperClass {

    public String getValue() {
        ExtensionsKt.getExtension("");
        ExtensionsKt.function("");
        More.INSTANCE.function2("");
        More.function3("");
        return getField();
    }
}
