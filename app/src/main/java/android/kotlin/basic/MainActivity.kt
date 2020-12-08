package android.kotlin.basic

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener { sendToProfilePage() }


    }

    fun sendToProfilePage(){
        val name = inputName.text.toString()
        val intent = Intent(this,ProfileActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent)

    }

}