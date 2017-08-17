package de.cdehning.parcelize_serializable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_with).setOnClickListener({
            val intent = CloseBugIfYouSeeMeActivity.createIntent(this, ParcelizeMe(Currency.getInstance("EUR")))
            startActivity(intent)
        })

        findViewById<Button>(R.id.button_without).setOnClickListener({
            val intent = WithoutSerializableItsFineActivity.createIntent(this, ParcelWithoutSerializable("EUR"))
            startActivity(intent)
        })
    }
}
