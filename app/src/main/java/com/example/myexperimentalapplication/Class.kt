package com.example.myexperimentalapplication

class Class

// the visibility is set to "public" by default
class User(var email: String, password: String, var age: Int) {

    var password: String = password // "field"
        get() { return field }
        set(value) { field = value }
}

fun main(args: Array<String>) {

    // hot to use class as an object on Kotlin
    val user = User("hello@email.com", "azerty", 27)

    // Setter; to modify the value
    user.password = "123456"
    // Getter; to get the value
    user.password

    // this modification is denied because of using the keyword "val"; immutable
    user.email = "" // val cannot be reassigned

}

// Kotlin classはデフォルトでpublic

// four main visibility modifiers for the members

// private:     inside the class
// protected:   inside the class and its subClass
// internal:    inside the same module; set of Kotlin files compiled together (gradle, Maven)
// public:      visible everywhere by everyone


val user = User("hello@email.com", "azerty", 27)

