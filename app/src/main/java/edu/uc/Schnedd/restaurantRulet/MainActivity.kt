package edu.uc.Schnedd.restaurantRulet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.Schnedd.restaurantRulet.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
