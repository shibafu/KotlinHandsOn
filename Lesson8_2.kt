/**
 * Kotlin ハンズオン
 * 1000未満の自然数の3、または5の倍数の自然数の総和
 * @ Author Nozawa
 */
fun main() {
    // 3,または5の倍数のリスト
    val th_or_fi_lis = (1..999).filter { i -> i % (3) == 0 || i % (5) == 0 }
    
    val ans = th_or_fi_lis.fold(0){ acc, i -> acc + i}
    //リスト型が用意しているラムダ式
    println(ans)

}
