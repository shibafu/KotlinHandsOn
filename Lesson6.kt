/**
 * Kotlin ハンズオン
 * 
 * @ Author Nozawa
 */

/**
 * 親クラス
 * Openをつける事で継承可能にする
 * @Author Nozawa
 * */
open class Person(val name: String, val age: Int){
    // 自己紹介
    fun introduceMyself(){
        println("こんにちは${name}です。年齢は${age}です。")
    }
}

// :<親クラス>で継承する
/**
 * 子クラス
 * */
class Student(val id: String,
             name: String,
             age: Int): Person(name, age)

fun main() {
    
    val s_yamaguchi = Student("XX20191010", "山口", 15)
    s_yamaguchi.introduceMyself()
    
}
