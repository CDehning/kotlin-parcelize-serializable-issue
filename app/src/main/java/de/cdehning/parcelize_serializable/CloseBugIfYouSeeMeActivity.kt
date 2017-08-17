package de.cdehning.parcelize_serializable

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView


class CloseBugIfYouSeeMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_close_bug_if_you_see_me)

        val parcelizeMe = intent.getParcelableExtra<ParcelizeMe>(EXTRA)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Success: " + parcelizeMe.currency
    }

    companion object {

        val EXTRA = "EXTRA"

        fun createIntent(context: Context,
                         parcelizeMe: ParcelizeMe): Intent {
            val intent = Intent(context, CloseBugIfYouSeeMeActivity::class.java)
            intent.putExtra(EXTRA, parcelizeMe)
            return intent
        }
    }
}
