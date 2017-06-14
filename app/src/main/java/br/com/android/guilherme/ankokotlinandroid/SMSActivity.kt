package br.com.android.guilherme.ankokotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import br.com.android.guilherme.ankokotlinandroid.R.id.et_mensagem
import kotlinx.android.synthetic.main.activity_sms.*
import org.jetbrains.anko.sendSMS

class SMSActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)

        et_mensagem.text = Editable
                .Factory
                .getInstance()
                .newEditable(intent.getStringExtra("inicio_texto"))


    }

    fun enviarSms(view: View?) {
        sendSMS("981369848", et_mensagem.text.toString())

    }
}
