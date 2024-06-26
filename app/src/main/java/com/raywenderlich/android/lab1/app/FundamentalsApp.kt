package com.raywenderlich.android.lab1.app

import ScaffoldScreen
import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import com.raywenderlich.android.lab1.screens.AlertDialogScreen
import com.raywenderlich.android.lab1.screens.BoxScreen
import com.raywenderlich.android.lab1.screens.ExploreButtonsScreen
import com.raywenderlich.android.lab1.screens.NavigationScreen
import com.raywenderlich.android.lab1.screens.ProgressIndicatorScreen
import com.raywenderlich.android.lab1.screens.GridScreen
import com.raywenderlich.android.lab1.screens.ListScreen
import com.raywenderlich.android.lab1.screens.SurfaceScreen
import com.raywenderlich.android.lab1.screens.TextFieldScreen
import com.raywenderlich.android.lab1.screens.TextScreen
import com.raywenderlich.android.lab1.screens.ColumnScreen
import com.raywenderlich.android.lab1.screens.RowScreen
import com.raywenderlich.android.lab1.screens.ScrollingScreen

@Composable
fun FundamentalsApp() {
    Surface(color = MaterialTheme.colors.background) {
        Crossfade(targetState = FundamentalsRouter.currentScreen) { screenState ->
            when (screenState.value) {
                is Screen.Navigation -> NavigationScreen()
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
                is Screen.Buttons -> ExploreButtonsScreen()
                is Screen.ProgressIndicator -> ProgressIndicatorScreen()
                is Screen.AlertDialog -> AlertDialogScreen()
                is Screen.Surface -> SurfaceScreen()
                is Screen.Scaffold -> ScaffoldScreen()
                is Screen.Box -> BoxScreen()
                is Screen.Column -> ColumnScreen()
                is Screen.Row -> RowScreen()
                is Screen.Scrolling -> ScrollingScreen()
                is Screen.List -> ListScreen()
                is Screen.Grid -> GridScreen()
            }
        }
    }
}