/**
 * Kotlin ハンズオン
 * 
 * @ Author Nozawa
 */

/**
 * 抽象クラス
 * @Author Nozawa
 * */
abstract class Person(val name: String, val age: Int){
    // 自己紹介
    // 明示的にオーバーライド可能にする
    abstract fun introduceMyself()
}

// :<親クラス>で継承する
/**
 * 子クラス
 * */
class Student(val id: String,
             name: String,
             age: Int): Person(name, age){
    // 自己紹介をオーバーライドpackage
    // 明示的にoverrideする必要がある
    override fun introduceMyself(){
        println("こんにちは${this.name}です。年齢は${this.age}です。"
               + "IDは${this.id}です")
    }
    
}

fun main() {
    
    // 実際のオブジェクトの子クラスのメソッドが呼ばれる
    val teacher_yamada:Person = Student("TT20191011", "山田", 35)
    teacher_yamada.introduceMyself()
    val s_yamaguchi = Student("XX20191010", "山口", 15)
    s_yamaguchi.introduceMyself()
    
}
