package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController

class Hello {

    @GetMapping("/{name}")

    fun Hello(@PathVariable name: String): String {
        return "Hello, hello $name";
    }
}