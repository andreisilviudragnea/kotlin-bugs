package com.example.getter_setter_annotation;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ClassWithGetter {

    @JsonGetter("value")
    public String getCreatedAt() {
        return "value";
    }

    @JsonSetter("value")
    public void setCreatedAt(String value) {
        System.out.println("assign value");
    }
}
