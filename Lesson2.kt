/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    
    // 数字型のキャスト
    // JSPのEL式的な記法を使う
    // ${}で囲む
    val score: Int = (0..500).random()
    println("${score}が選ばれました")
    
    // if文はJavaと同じ
    if(score % 2 == 0) {
        println("これは偶数です")
    }
    else {
        println("これは奇数です")
    }
    
    
}