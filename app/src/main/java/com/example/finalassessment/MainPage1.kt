// package declaration
package com.example.finalassessment

// import statements
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
import kotlinx.android.synthetic.main.main_page_1.*

// MainPage1 class definition
@Suppress("DEPRECATION")
class MainPage1 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_1)
        //Loading Page 1 Planets Entry Animations
        val sunAnim = AnimationUtils.loadAnimation(this,R.anim.sun_pg1)
        val mercuryAnim = AnimationUtils.loadAnimation(this,R.anim.mercury_pg1)
        val venusAnim = AnimationUtils.loadAnimation(this,R.anim.venus_pg1)
        val earthAnim = AnimationUtils.loadAnimation(this,R.anim.earth_pg1)
        val marsAnim = AnimationUtils.loadAnimation(this,R.anim.mars_pg1)
        //Loading Page 2 Planets Exit Animations
        val jupiterAnim = AnimationUtils.loadAnimation(this,R.anim.jupiter_pg1)
        val saturnAnim = AnimationUtils.loadAnimation(this,R.anim.saturn_pg1)
        val uranusAnim = AnimationUtils.loadAnimation(this,R.anim.uranus_pg1)
        val neptuneAnim = AnimationUtils.loadAnimation(this,R.anim.neptune_pg1)
        //Loading the Arrow Animations
        val arrowAnim = AnimationUtils.loadAnimation(this,R.anim.arrow_pg1)
        //Loading the TextView Animations
        val headingsEntryToRight = AnimationUtils.loadAnimation(this,R.anim.heading_entry_to_right_pg1)
        val headingsEntryToLeft = AnimationUtils.loadAnimation(this,R.anim.heading_entry_to_left_pg1)
        val headingsExitFromRight = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_right_pg1)
        val headingsExitFromLeft = AnimationUtils.loadAnimation(this,R.anim.heading_exit_from_left_pg1)

        //Loading the page 3 exit Animations
        val planetExit = AnimationUtils.loadAnimation(this,R.anim.main_planet_exit)
        val panelExit = AnimationUtils.loadAnimation(this,R.anim.planet_panel_exit)

        //Checker Variable to handle the animations
        val checker = intent.getIntExtra("Checker",0)

        //Loading the Rocket Animation
        val rocketExt = AnimationUtils.loadAnimation(this,R.anim.rocket)

        //Calling the "blockUserInput" to Block any input for 5 seconds
        blockUserInput()

        //Setting up the Exit Animations for Page 3
        when (intent.getIntExtra("Planet",-1)) {
            0 -> {
                thePlanetPg1.setImageResource(R.drawable.sun)
                planetPanelPg1.setImageResource(R.drawable.sun_panel)
                planetNamePg1.text = "Sun"
                planetLocationPg1.text = "Our Star"
                planetInfoPg1.text = getString(R.string.sun_info)
            }
            1 -> {
                thePlanetPg1.setImageResource(R.drawable.mercury)
                planetPanelPg1.setImageResource(R.drawable.mercury_panel)
                planetNamePg1.text = "Mercury"
                planetLocationPg1.text = "First Planet"
                planetInfoPg1.text = getString(R.string.mercury_info)
            }
            2 -> {
                thePlanetPg1.setImageResource(R.drawable.venus)
                planetPanelPg1.setImageResource(R.drawable.venus_panel)
                planetNamePg1.text = "Venus"
                planetLocationPg1.text = "Second Planet"
                planetInfoPg1.text = getString(R.string.sun_info)
            }
            3 -> {
                thePlanetPg1.setImageResource(R.drawable.earth)
                planetPanelPg1.setImageResource(R.drawable.earth_panel)
                planetNamePg1.text = "Earth"
                planetLocationPg1.text = "Third Planet"
                planetInfoPg1.text = getString(R.string.earth_info)
            }
            4 -> {
                thePlanetPg1.setImageResource(R.drawable.mars)
                planetPanelPg1.setImageResource(R.drawable.mars_panel)
                planetNamePg1.text = "Mars"
                planetLocationPg1.text = "Forth Planet"
                planetInfoPg1.text = getString(R.string.mars_info)
            }
            5 -> {
                thePlanetPg1.setImageResource(R.drawable.jupiter)
                planetPanelPg1.setImageResource(R.drawable.jupiter_panel)
                planetNamePg1.text = "Jupiter"
                planetLocationPg1.text = "Fifth Planet"
                planetInfoPg1.text = getString(R.string.jupiter_info)
            }
            6 -> {
                thePlanetPg1.setImageResource(R.drawable.saturn)
                planetPanelPg1.setImageResource(R.drawable.saturn_panel)
                planetNamePg1.text = "Saturn"
                planetLocationPg1.text = "Sixth Planet"
                planetInfoPg1.text = getString(R.string.saturn_info)
            }
            7 -> {
                thePlanetPg1.setImageResource(R.drawable.uranus)
                planetPanelPg1.setImageResource(R.drawable.uranus_panel)
                planetNamePg1.text = "Uranus"
                planetLocationPg1.text = "Seventh Planet"
                planetInfoPg1.text = getString(R.string.uranus_info)
            }
            8 -> {
                thePlanetPg1.setImageResource(R.drawable.neptune)
                planetPanelPg1.setImageResource(R.drawable.neptune_panel)
                planetNamePg1.text = "Neptune"
                planetLocationPg1.text = "Eighth Star"
                planetInfoPg1.text = getString(R.string.neptune_info)
            }
        }

        //Playing animations for different scenarios
        when (checker) {
            0 -> {
                rocket.startAnimation(rocketExt)
                sun1.startAnimation(sunAnim)
                mercury1.startAnimation(mercuryAnim)
                venus1.startAnimation(venusAnim)
                earth1.startAnimation(earthAnim)
                mars1.startAnimation(marsAnim)
                popupBtnPg1.startAnimation(arrowAnim)
                nextPg1.startAnimation(arrowAnim)
            }
            1 -> {
                planetInfoPg1.startAnimation(panelExit)
                planetLocationPg1.startAnimation(panelExit)
                planetNamePg1.startAnimation(panelExit)
                planetPanelPg1.startAnimation(panelExit)
                thePlanetPg1.startAnimation(planetExit)
                underlinePg1.startAnimation(panelExit)
                sun1.startAnimation(sunAnim)
                mercury1.startAnimation(mercuryAnim)
                venus1.startAnimation(venusAnim)
                earth1.startAnimation(earthAnim)
                mars1.startAnimation(marsAnim)
                nextPg1.startAnimation(arrowAnim)
                popupBtnPg1.startAnimation(arrowAnim)
            }
            else -> {
                sun1.startAnimation(sunAnim)
                mercury1.startAnimation(mercuryAnim)
                venus1.startAnimation(venusAnim)
                earth1.startAnimation(earthAnim)
                mars1.startAnimation(marsAnim)
                jupiter1.startAnimation(jupiterAnim)
                saturn1.startAnimation(saturnAnim)
                uranus1.startAnimation(uranusAnim)
                neptune1.startAnimation(neptuneAnim)
                nextPg1.startAnimation(arrowAnim)
                popupBtnPg1.startAnimation(arrowAnim)
                //comment
                jupiterHeading1.startAnimation(headingsExitFromRight)
                saturnHeading1.startAnimation(headingsExitFromLeft)
                uranusHeading1.startAnimation(headingsExitFromRight)
                neptuneHeading1.startAnimation(headingsExitFromLeft)
            }
        }

        //Planets Names TextView Animations
        mercuryHeading1.startAnimation(headingsEntryToRight)
        venusHeading1.startAnimation(headingsEntryToLeft)
        earthHeading1.startAnimation(headingsEntryToRight)
        marsHeading1.startAnimation(headingsEntryToLeft)

        //Popup
        popupBtnPg1.setOnClickListener {
            val myDialog = Dialog(this)
            myDialog.setContentView(R.layout.dialoug_box)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
        }

        //Arrow for the next page
        nextPg1.setOnClickListener {
            val intent = Intent(this,MainPage2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        //All the Planet Buttons
        sun1.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",0)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        mercury1.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",1)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        venus1.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",2)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        earth1.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",3)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        mars1.setOnClickListener {
            val intent = Intent(this,InfoPage::class.java)
            intent.putExtra("var",4)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
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