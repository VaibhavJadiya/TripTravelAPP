package com.printoverit.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        login_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}