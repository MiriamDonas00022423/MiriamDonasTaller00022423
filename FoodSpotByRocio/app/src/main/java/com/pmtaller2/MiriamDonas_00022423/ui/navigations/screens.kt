import kotlinx.serialization.Serializable


/*@Serializable allows you to convert objects to text and text to objects automatically.
This is very useful for passing parameters between screens in Compose Navigation*/

@Serializable
object RestaurantScreenNavigation

@Serializable
object SearchScreenNavigation

@Serializable
object OrdersScreenNavigation

@Serializable
data class RestaurantMenuScreenNavigation(val id: Int)