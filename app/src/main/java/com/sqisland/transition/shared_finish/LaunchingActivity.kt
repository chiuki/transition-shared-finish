package com.sqisland.transition.shared_finish

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_launching.*

class LaunchingActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_launching)

    robot.setOnClickListener {
      val intent = Intent(this, ReceivingActivity::class.java)
      val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, robot, "robot")
      startActivity(intent, options.toBundle())
      finish()
    }
  }
}
