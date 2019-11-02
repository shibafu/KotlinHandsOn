/**
 * Kotlin ハンズオン
 * 
 * @ Author Nozawa
 */

/**
 * 人物クラス
 * 
 * @Author Nozawa
 * */
class Person(val name: String){
    
    // 自己紹介します
    fun introduceMyself() {
        println("私は　${this.name} ですヾ(｡>﹏<｡)ﾉﾞ")
    }
}


fun main() {
    
    val taro = Person("Taro")
    taro.name = "変更後太郎"
    println(taro.introduceMyself())
}
