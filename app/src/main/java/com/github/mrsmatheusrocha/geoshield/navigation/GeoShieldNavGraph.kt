import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun GeoShieldNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onNavigateToList = { navController.navigate("alert_list") })
        }
        composable("alert_list") {
            AlertListScreen(
                onNavigateToDetail = { alertId -> navController.navigate("alert_detail/$alertId") }
            )
        }
        composable(
            route = "alert_detail/{alertId}",
            arguments = listOf(navArgument("alertId") { type = NavType.StringType })
        ) { backStackEntry ->
            val alertId = backStackEntry.arguments?.getString("alertId")
            AlertDetailScreen(
                alertId = alertId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}