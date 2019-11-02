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
class IntPair(val first: Int, val second: Int){
    
    // 和を返す
    fun sum() : Int {
        return first + second
    }
    
    // 大きい方を返す
    fun max(): Int {
        if(first >= second){
          return  first 
        }
        else {
                   return  second
        }
    }
   
    // firstとsecondが逆になったPersonオブジェクトを返す
    fun swap(): IntPair {
        val result : IntPair = IntPair(this.second, this.first)
        return result
    }
}


fun main() {
    
    val firstInstance = IntPair(-1, 5)
    println("オブジェクトを生成しました"
            +"第一引数${firstInstance.first},${firstInstance.second}")
    println(firstInstance.sum())
    println(firstInstance.max())
    
    
    val secondInstance = firstInstance.swap()
    println("オブジェクトを生成しました"
            +"第一引数${secondInstance.first},${secondInstance.second}")
}
