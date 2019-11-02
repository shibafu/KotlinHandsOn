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
    val name: String? = getFruitsName()

    // sがnullの場合はnullになる
    // letを使うと、型変換が出来る
    val age : Int? = name?.let { it.toInt() }
}
