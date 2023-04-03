package ba.etf.rma22.rma23_18957

data class UserReview(
    override val username: String,
    override val timestamp: Long,
    val review: String
):UserImpression()
