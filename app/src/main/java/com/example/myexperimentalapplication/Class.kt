package com.example.myexperimentalapplication

class Class

// the visibility is set to "public" by default
// passwordのvisibilityをprivateにしたい場合はコンストラクター上でprivateを追加すればよい
class User(email: String, private val password: String, var age: Int) {

    // コンストラクターに記述した名前からvalを除くと、プロパティではなくパラメータになる
    // emailプロパティを定義し、コンストラクター上の同名のパラメータでイニシャライズする
    var email: String = email
        // getterとsetterのふるまいを変更する
        // statementを続けて記述するには、;を入れて区切る
        get() { println("User is getting his email."); return field } // "field"はプロパティ自身を指す。"Backing Field"という
        set(value) { println("User is setting his email"); field = value }
        // emailプロパティのgetterとsetterをカスタマイズできた。こうすれば、今後コンソールデバッグ用のコードを書く必要がない
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

// declare variables here!

class Course(
    private val id: String,
    var title: String,
    val duration: Int,
    var isActive: Boolean
    )


fun main(args: Array<String>) {

    // write code here!
    println("Welcome OpenClassrooms Students!")

    val course = Course("A01", "how to make people happy by programming", 45, "available")

    println("the course names '${course.title}'")

}
