import kotlinx.serialization.Serializable

const val RestaurantMenuScreenNavigationId = "com.pmtaller2.MiriamDonas_00022423.ui.navigations.RestaurantMenuScreenNavigation/{id}"


@Serializable
object RestaurantScreenNavigation

@Serializable
object SearchScreenNavigation

@Serializable
object OrdersScreenNavigation

@Serializable
data class RestaurantMenuScreenNavigation(val id: Int)