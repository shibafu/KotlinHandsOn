/**
 * Kotlin ハンズオン
 * 
 * @ Author Nozawa
 */

/**
 * 拡張関数
 * 既に生成されたクラスにメソッドを追加する
 * */
fun String.hello() {
    println("Hello, ${this}")
}

fun main() {
    
    // 実際のオブジェクトの子クラスのメソッドが呼ばれる
    val name : String = "world"
    name.hello()
}
