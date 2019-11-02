/**
 * Kotlin ハンズオン
 * null 安全
 * @ Author Nozawa
 */
fun getFruitsName(): String?{
    return null
}


fun main() {
    // nullを許容する型宣言
    val s: String? = getFruitsName()

    // sがnullの場合はnullになる
    println(s?.length)
}
