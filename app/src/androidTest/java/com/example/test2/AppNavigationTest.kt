package com.example.test2

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.todayonelinememo.ui.theme.TodayOneLineMemoTheme
import org.junit.Rule
import org.junit.Test

/**
 * Simple UI test for checking the initial navigation destination.
 */
class AppNavigationTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun appNavigation_verifyStartDestination() {
        // Set content to the AppNavigation composable under the theme
        composeTestRule.setContent {
            TodayOneLineMemoTheme {
                AppNavigation()
            }
        }

        // Verify that the MainScreen is displayed by checking for its unique text
        // MainScreen contains the text "테스트 모드"
        composeTestRule
            .onNodeWithText("테스트 모드")
            .assertIsDisplayed()

        // Optionally, verify that the HistoryScreen text is not initially displayed
        composeTestRule
            .onNodeWithText("히스토리 화면")
            .assertDoesNotExist()
    }
} 