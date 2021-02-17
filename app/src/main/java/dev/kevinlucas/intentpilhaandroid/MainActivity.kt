package dev.kevinlucas.intentpilhaandroid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun chamaSegundaTela(view: View?) {
        val intent = Intent(this, SegundaActivity2::class.java)
        startActivity(intent)
    }

    fun chamaNavegador(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com.br")
        startActivity(intent)
    }
}