package de.cdehning.parcelize_serializable

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView


class WithoutSerializableItsFineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_close_bug_if_you_see_me)

        val parcelWithoutSerializable = intent.getParcelableExtra<ParcelWithoutSerializable>(EXTRA)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Parcelize doing its job: " + parcelWithoutSerializable.currency


    }

    companion object {

        val EXTRA = "EXTRA"

        fun createIntent(context: Context, parcelWithoutSerializable: ParcelWithoutSerializable): Intent {
            val intent = Intent(context, WithoutSerializableItsFineActivity::class.java)
            intent.putExtra(EXTRA, parcelWithoutSerializable)
            return intent
        }
    }
}