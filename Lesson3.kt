/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    // レンジを使った繰り返し文
//     for(i in 1..10){
//         println("i = ${i}")
//     }
    
//     // オブジェクトを使った繰り返し文
//     val names = listOf("Fujiki", "Baba", "Mayama", "Tanaka")
//     for(name in names){
//         println("名前は${name}です！")
//     }
    
    for(i in 0..100){
        // 15の倍数の時FizzBuzz
        if(i % (3 * 5) == 0){
            println("FizzBuzz")
        }
        // 3の倍数の時FizzBuzz
        else if(i % 3 == 0){
            println("Fizz")
        }
        // 5の倍数の時FizzBuzz
        else if(i % 5 == 0){
            println("Buzz")
        }
        else {
            println(i)
        }
    }
    
}