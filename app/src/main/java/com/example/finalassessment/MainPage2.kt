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
import kotlinx.android.synthetic.main.main_page_2.*

@Suppress("DEPRECATION")
class MainPage2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_2)
        //Loading Animations
        val sunAnim = AnimationUtils.loadAnimation(this,R.anim.sun_pg2)
        val mercuryAnim = AnimationUtils.loadAnimation(this,R.anim.mercury_pg2)
        val venusAnim = AnimationUtils.loadAnimation(this,R.anim.venus_pg2)
        val earthAnim = AnimationUtils.loadAnimation(this,R.anim.earth_pg2)
        val marsAnim = AnimationUtils.loadAnimation(this,R.anim.mars_pg2)
        val jupiterAnim = AnimationUtils.loadAnimation(this,R.anim.jupiter_pg2)
        val saturnAnim = AnimationUtils.loadAnimation(this,R.anim.saturn_pg2)
        val uranusAnim = AnimationUtils.loadAnimation(this,R.anim.uranus_pg2)
        val neptuneAnim = AnimationUtils.loadAnimation(this,R.anim.neptune_pg2)
        val arrowAnim = AnimationUtils.loadAnimation(this,R.anim.arrow_pg2)
        val headingsExitFromRight = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_right_pg2)
        val headingsExitFromLeft = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_left_pg2)

        //Loading the TextView Animations
        val headingsEntryToRight = AnimationUtils.loadAnimation(this,R.anim.heading_entry_to_right_pg2)
        val headingsEntryToLeft = AnimationUtils.loadAnimation(this,R.anim.heading_entry_to_left_pg2)

        val planetExit = AnimationUtils.loadAnimation(this,R.anim.main_planet_exit)
        val panelExit = AnimationUtils.loadAnimation(this,R.anim.planet_panel_exit)

        blockUserInput()
        when (intent.getIntExtra("Planet2",-1)) {
            0 -> {
                thePlanetPg2.setImageResource(R.drawable.sun)
                planetPanelPg2.setImageResource(R.drawable.sun_panel)
                planetNamePg2.text = "Sun"
                planetLocationPg2.text = "Our Star"
                planetInfoPg2.text = getString(R.string.sun_info)
            }
            1 -> {
                thePlanetPg2.setImageResource(R.drawable.mercury)
                planetPanelPg2.setImageResource(R.drawable.mercury_panel)
                planetNamePg2.text = "Mercury"
                planetLocationPg2.text = "First Planet"
                planetInfoPg2.text = getString(R.string.mercury_info)
            }
            2 -> {
                thePlanetPg2.setImageResource(R.drawable.venus)
                planetPanelPg2.setImageResource(R.drawable.venus_panel)
                planetNamePg2.text = "Venus"
                planetLocationPg2.text = "Second Planet"
                planetInfoPg2.text = getString(R.string.sun_info)
            }
            3 -> {
                thePlanetPg2.setImageResource(R.drawable.earth)
                planetPanelPg2.setImageResource(R.drawable.earth_panel)
                planetNamePg2.text = "Earth"
                planetLocationPg2.text = "Third Planet"
                planetInfoPg2.text = getString(R.string.earth_info)
            }
            4 -> {
                thePlanetPg2.setImageResource(R.drawable.mars)
                planetPanelPg2.setImageResource(R.drawable.mars_panel)
                planetNamePg2.text = "Mars"
                planetLocationPg2.text = "Forth Planet"
                planetInfoPg2.text = getString(R.string.mars_info)
            }
            5 -> {
                thePlanetPg2.setImageResource(R.drawable.jupiter)
                planetPanelPg2.setImageResource(R.drawable.jupiter_panel)
                planetNamePg2.text = "Jupiter"
                planetLocationPg2.text = "Fifth Planet"
                planetInfoPg2.text = getString(R.string.jupiter_info)
            }
            6 -> {
                thePlanetPg2.setImageResource(R.drawable.saturn)
                planetPanelPg2.setImageResource(R.drawable.saturn_panel)
                planetNamePg2.text = "Saturn"
                planetLocationPg2.text = "Sixth Planet"
                planetInfoPg2.text = getString(R.string.saturn_info)
            }
            7 -> {
                thePlanetPg2.setImageResource(R.drawable.uranus)
                planetPanelPg2.setImageResource(R.drawable.uranus_panel)
                planetNamePg2.text = "Uranus"
                planetLocationPg2.text = "Seventh Planet"
                planetInfoPg2.text = getString(R.string.uranus_info)
            }
            8 -> {
                thePlanetPg2.setImageResource(R.drawable.neptune)
                planetPanelPg2.setImageResource(R.drawable.neptune_panel)
                planetNamePg2.text = "Neptune"
                planetLocationPg2.text = "Eighth Star"
                planetInfoPg2.text = getString(R.string.neptune_info)
            }
        }


        jupiterHeading2.startAnimation(headingsEntryToRight)
        saturnHeading2.startAnimation(headingsEntryToLeft)
        uranusHeading2.startAnimation(headingsEntryToRight)
        neptuneHeading2.startAnimation(headingsEntryToLeft)

        if(intent.getIntExtra("Checker", 0) == 1){
            planetInfoPg2.startAnimation(panelExit)
            planetLocationPg2.startAnimation(panelExit)
            planetNamePg2.startAnimation(panelExit)
            planetPanelPg2.startAnimation(panelExit)
            thePlanetPg2.startAnimation(planetExit)
            underlinePg2.startAnimation(panelExit)
            jupiter2.startAnimation(jupiterAnim)
            saturn2.startAnimation(saturnAnim)
            uranus2.startAnimation(uranusAnim)
            neptune2.startAnimation(neptuneAnim)
            nextPg2.startAnimation(arrowAnim)
            popupBtnPg2.startAnimation(arrowAnim)
        }
        else{
            sun2.startAnimation(sunAnim)
            mercury2.startAnimation(mercuryAnim)
            venus2.startAnimation(venusAnim)
            earth2.startAnimation(earthAnim)
            mars2.startAnimation(marsAnim)
            jupiter2.startAnimation(jupiterAnim)
            saturn2.startAnimation(saturnAnim)
            uranus2.startAnimation(uranusAnim)
            neptune2.startAnimation(neptuneAnim)
            nextPg2.startAnimation(arrowAnim)
            popupBtnPg2.startAnimation(arrowAnim)
            mercuryHeading2.startAnimation(headingsExitFromRight)
            venusHeading2.startAnimation(headingsExitFromLeft)
            earthHeading2.startAnimation(headingsExitFromRight)
            marsHeading2.startAnimation(headingsExitFromLeft)
        }
        nextPg2.setOnClickListener {
            val intent = Intent(this,MainPage1::class.java)
            intent.putExtra("Checker",2)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        jupiter2.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",5)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        saturn2.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",6)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        uranus2.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",7)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        neptune2.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",8)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        popupBtnPg2.setOnClickListener {
            val myDialog = Dialog(this)
            myDialog.setContentView(R.layout.dialoug_box)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
        }
    }
    private fun blockUserInput() {
        val inputBlocker = object : CountDownTimer(7500, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val handler = Handler()
                // Disable user input
                window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
                // Wait for 5 seconds
                handler.postDelayed({
                    // Enable user input
                    window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
                }, 7500)

            }
            override fun onFinish() {
                // enable user input here
            }
        }
        inputBlocker.start()
    }
}