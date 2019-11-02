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
        return this.first + this.second
    }
    
    // 大きい方を返す
    fun max(): Int {
        if(this.first >= this.second){
          return  this.first 
        }
        else {
          return  this.second
        }
    }
   
    // firstとsecondが逆になったPersonオブジェクトを返す
    fun swap(): IntPair {
        val result : IntPair = IntPair(this.second, this.first)
        return result
    }
}

/**
 * 拡張関数
 * 既に生成されたクラスにメソッドを追加する
 * */
fun Int.meets(x_second : Int) : IntPair {
    return IntPair(this, x_second)
}

fun main() {
    
    // 実際のオブジェクトの子クラスのメソッドが呼ばれる
    val ins : IntPair = 5.meets(3)
    println("生成されたインスタンスのプロパティは1:${ins.first}、2:${ins.second}")
}
