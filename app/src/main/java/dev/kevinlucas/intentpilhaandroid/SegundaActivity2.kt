package dev.kevinlucas.intentpilhaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SegundaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda2)
    }

    fun voltar(view: View?) {
        finish()
    }
}