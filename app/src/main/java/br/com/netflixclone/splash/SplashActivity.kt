package br.com.netflixclone.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import br.com.netflixclone.MainActivity
import br.com.netflixclone.R
import br.com.netflixclone.profile.SelectProfileActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        lifecycleScope.launch {
            delay(999)

            val intent = Intent(this@SplashActivity, SelectProfileActivity::class.java)
            this@SplashActivity.startActivity(intent)
            finish()
        }

    }
}