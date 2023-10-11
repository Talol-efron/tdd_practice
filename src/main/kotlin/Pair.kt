class Pair(private val from: String, private val to: String) {
    override fun equals(obj: Any?): Boolean {
        val pair = obj as Pair
        return from == pair.from && to == pair.to
    }

    override fun hashCode(): Int {
        return 0
    }
}