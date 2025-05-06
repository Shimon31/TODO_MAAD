package com.example.todo_maad

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.Layout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration

class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setNavigationDrawer()
        navController = findNavController(R.id.nav_host_fragment)
        appBarConfigurationSetIp()

    }

    private fun appBarConfigurationSetIp() {
        appBarConfiguration =
            AppBarConfiguration.Builder(R.id.statisticsFragment, R.id.taskFragment)
                .setOpenableLayout(drawerLayout).build()
    }

    private fun setNavigationDrawer() {

        drawerLayout = findViewById<DrawerLayout?>(R.id.drawer_layout)
            .apply {
                setStatusBarBackground(R.color.black)
            }
    }
}