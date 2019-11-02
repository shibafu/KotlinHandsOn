/**
 * Kotlin ハンズオン
 * 
 * @ Author Nozawa
 */
fun main() {
    // ラムダ式の実装
    (1..10).forEach {i ->
        println("i = ${i}")
    }
    
    //リスト型が用意しているラムダ式
    val ints = listOf(1, 9, 5)
    // 全て～か
  	println(ints.all { i -> i % 2 == 1 })      //=> true
    // 含まれるか
  	println(ints.any { i -> i == 5 })          //=> true
    // ～がいくつか
 	println(ints.count {i -> i == 5})          //=> 1
    //　全てに対して～する
  	println(ints.map { i -> i + 1 })           //=> [2, 10, 6]
    //　～の適用されるもののみをリストで
  	println(ints.filter { i -> i > 2})         //=> [9, 5]
    //　前回と今回の物に対して、全て足す
  	println(ints.fold(0){ acc, i -> acc + i})  //=> 15

}
