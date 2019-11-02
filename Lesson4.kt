/**
 * Kotlin ハンズオン
 * 
 * @ Author Nozawa
 */

fun main() {
    // 1.
    println(square(8))
    // 2.
    println(max(-4, 10))
    // 3.
    println(isEven(5))
    // 4.
    println(factorial(7))
    // 5.
    println(containsThree(1024))
    
}

/**
 * 2乗した関数を返す
 * */
fun square(n: Int): Int {
    return n * n
}


/**
 * 最大値を返す
 * */
fun max(n : Int, compareToN : Int): Int {
    if(n > compareToN){
        return n
    } else {
        return compareToN
    }
}

/**
 * 偶数の時trueを返す
 * */
 fun isEven(n : Int): Boolean{
     if(n % 2 == 0){
         return true
     }
     else {
         return false
     }
 }

/**
 * 整数の階上を返す
 * */
 fun factorial(n : Int): Int{
     var result : Int = 1
     for(i in 1..n){
         result = result * i
     }
     return result
 }

/**
 * 3が含まれるかどうか
 * */
 fun containsThree(n : Int): Boolean {
     return n.toString().toCharArray().contains('3')
 }
