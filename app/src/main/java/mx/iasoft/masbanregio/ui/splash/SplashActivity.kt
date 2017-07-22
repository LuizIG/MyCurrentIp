package mx.iasoft.masbanregio.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import mx.iasoft.masbanregio.R


/**
 * Created by luisibarra on 20/07/17.
 */
class SplashActivity : AppCompatActivity(), Runnable {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(this, 3000)
    }

    override fun run() {
        /*
        if (Utils.getCardEncript(this).equals("null")) {
            startActivity(Intent(this@SplashActivity, Splash2Activity::class.java))
        } else {
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
        }
        */
        finish()
    }
}
