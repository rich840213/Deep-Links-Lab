package jk.test.deeplinks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvLineId.text = intent.data?.getQueryParameter("id") ?: "No Data"
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        tvLineId.text = intent?.data?.getQueryParameter("id") ?: "No Data"
    }
}