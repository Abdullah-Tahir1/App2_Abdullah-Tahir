package com.example.finalassessment

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.info_page.*
import kotlinx.android.synthetic.main.main_page_1.*

class InfoPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_page)

        val intentPg1 = Intent(this,MainPage1::class.java)
        val intentPg2 = Intent(this,MainPage2::class.java)

        val value = intent.getIntExtra("var",-1)

        //Loading Page 1 Plants Entry Animations
        val sunAnim = AnimationUtils.loadAnimation(this,R.anim.sun_pg2)
        val mercuryAnim = AnimationUtils.loadAnimation(this,R.anim.mercury_pg2)
        val venusAnim = AnimationUtils.loadAnimation(this,R.anim.venus_pg2)
        val earthAnim = AnimationUtils.loadAnimation(this,R.anim.earth_pg2)
        val marsAnim = AnimationUtils.loadAnimation(this,R.anim.mars_pg2)

        //Loading Page 2 Plants Exit Animations
        val jupiterAnim = AnimationUtils.loadAnimation(this,R.anim.jupiter_pg1)
        val saturnAnim = AnimationUtils.loadAnimation(this,R.anim.saturn_pg1)
        val uranusAnim = AnimationUtils.loadAnimation(this,R.anim.uranus_pg1)
        val neptuneAnim = AnimationUtils.loadAnimation(this,R.anim.neptune_pg1)

        val headingsExitFromRightPg2 = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_right_pg2)
        val headingsExitFromLeftPg2 = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_left_pg2)

        val headingsExitFromRightPg1 = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_right_pg1)
        val headingsExitFromLeftPg1 = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_left_pg1)

        val mainPlanetEntry = AnimationUtils.loadAnimation(this,R.anim.main_planet_entry)
        val planetPanelAnimation = AnimationUtils.loadAnimation(this,R.anim.planet_panel_entry)

        val planet = findViewById<ImageView>(R.id.thePlanet)
        val planetPanel = findViewById<ImageView>(R.id.planetPanel)

        blockUserInput()

        popupBtnPg3.setOnClickListener(){
            val myDialoug = Dialog(this)
            myDialoug.setContentView(R.layout.dialoug_box)
            myDialoug.setCancelable(true)
            myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialoug.show()
        }

        if(value in 0..4){
            sun3.startAnimation(sunAnim)
            mercury3.startAnimation(mercuryAnim)
            venus3.startAnimation(venusAnim)
            earth3.startAnimation(earthAnim)
            mars3.startAnimation(marsAnim)

            mercuryHeading3.startAnimation(headingsExitFromRightPg2)
            venusHeading3.startAnimation(headingsExitFromLeftPg2)
            earthHeading3.startAnimation(headingsExitFromRightPg2)
            marsHeading3.startAnimation(headingsExitFromLeftPg2)
        }
        else{
            jupiter3.startAnimation(jupiterAnim)
            saturn3.startAnimation(saturnAnim)
            uranus3.startAnimation(uranusAnim)
            neptune3.startAnimation(neptuneAnim)

            jupiterHeading3.startAnimation(headingsExitFromRightPg1)
            saturnHeading3.startAnimation(headingsExitFromLeftPg1)
            uranusHeading3.startAnimation(headingsExitFromRightPg1)
            neptuneHeading3.startAnimation(headingsExitFromLeftPg1)
        }
        /*
        * 0 = Sun
        * 1 = Mercury
        * 2 = Venus
        * 3 = Earth
        * 4 = Mars
        * 5 = Jupiter
        * 6 = Saturn
        * 7 = Uranus
        * 8 = Neptune
        * */
        when (value) {
            0 -> {
                planet.setImageResource(R.drawable.sun)
                planetPanel.setImageResource(R.drawable.sun_panel)
                planetName.text = "Sun"
                planetLocation.text = "Our Star"
                planetInfo.text = getString(R.string.sun_info)
            }
            1 -> {
                planet.setImageResource(R.drawable.mercury)
                planetPanel.setImageResource(R.drawable.mercury_panel)
                planetName.text = "Mercury"
                planetLocation.text = "First Planet"
                planetInfo.text = getString(R.string.mercury_info)
            }
            2 -> {
                planet.setImageResource(R.drawable.venus)
                planetPanel.setImageResource(R.drawable.venus_panel)
                planetName.text = "Venus"
                planetLocation.text = "Second Planet"
                planetInfo.text = getString(R.string.sun_info)
            }
            3 -> {
                planet.setImageResource(R.drawable.earth)
                planetPanel.setImageResource(R.drawable.earth_panel)
                planetName.text = "Earth"
                planetLocation.text = "Third Planet"
                planetInfo.text = getString(R.string.earth_info)
            }
            4 -> {
                planet.setImageResource(R.drawable.mars)
                planetPanel.setImageResource(R.drawable.mars_panel)
                planetName.text = "Mars"
                planetLocation.text = "Forth Planet"
                planetInfo.text = getString(R.string.mars_info)
            }
            5 -> {
                planet.setImageResource(R.drawable.jupiter)
                planetPanel.setImageResource(R.drawable.jupiter_panel)
                planetName.text = "Jupiter"
                planetLocation.text = "Fifth Planet"
                planetInfo.text = getString(R.string.jupiter_info)
            }
            6 -> {
                planet.setImageResource(R.drawable.saturn)
                planetPanel.setImageResource(R.drawable.saturn_panel)
                planetName.text = "Saturn"
                planetLocation.text = "Sixth Planet"
                planetInfo.text = getString(R.string.saturn_info)
            }
            7 -> {
                planet.setImageResource(R.drawable.uranus)
                planetPanel.setImageResource(R.drawable.uranus_panel)
                planetName.text = "Uranus"
                planetLocation.text = "Seventh Planet"
                planetInfo.text = getString(R.string.uranus_info)
            }
            8 -> {
                planet.setImageResource(R.drawable.neptune)
                planetPanel.setImageResource(R.drawable.neptune_panel)
                planetName.text = "Neptune"
                planetLocation.text = "Eighth Star"
                planetInfo.text = getString(R.string.neptune_info)
            }
        }
        planet.startAnimation(mainPlanetEntry)
        planetPanel.startAnimation(planetPanelAnimation)
        planetName.startAnimation(planetPanelAnimation)
        planetLocation.startAnimation(planetPanelAnimation)
        planetInfo.startAnimation(planetPanelAnimation)
        underlinePg3.startAnimation(planetPanelAnimation)

        nextPg3.setOnClickListener(){
            if(value in 0..4){
                intentPg1.putExtra("Checker", 1)
                intentPg1.putExtra("Planet", value)
                startActivity(intentPg1)
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            }
            else{
                intentPg2.putExtra("Checker", 1)
                intentPg2.putExtra("Planet2", value)
                startActivity(intentPg2)
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            }
        }
    }
    fun blockUserInput() {
        val inputBlocker = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val handler = Handler()
                // Disable user input
                window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
                // Wait for 5 seconds
                handler.postDelayed({
                    // Enable user input
                    window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
                }, 10000)

            }
            override fun onFinish() {
                // enable user input here
            }
        }
        inputBlocker.start()
    }
}
