package ba.etf.rma22.rma23_18957

data class UserRating(
    override val username: String,
    override val timestamp: Long,
    val rating: Double
):UserImpression()

