/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    for(i in 0..100){
        var i_num_pointer : String = i.toString()
        // 3の倍数の時FizzBuzz
        if(i == 0){
            println("${i}")
        }
        else if(i % 3 == 0){
            println("${i}!")
        }
        else {
            var includeThreeFlg : Boolean  = false
            // 文字列に3が含まれる時、フラグをオン
            for(str : Char in i_num_pointer.asIterable()){
                if('3'.equals(str)){
                    includeThreeFlg = true
                }
            }
            
            // フラグがオンなら！
            if(includeThreeFlg) {
            	println("${i}!")
            }
            // フラグがオフならそのまま出力
            else {
            	println("${i}")
            }
        }
    }
    
}