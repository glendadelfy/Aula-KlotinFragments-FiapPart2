package com.glenda.aulafragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// aula dia 24/09/2024
class MainActivity : AppCompatActivity() {
    private lateinit var btnCadastro : Button
    private lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnCadastro = findViewById(R.id.btnCadastro)
        btnCadastro.setOnClickListener{


            val cadastroFragment = CadastroFragment()

            val bundle = bundleOf(
                "nomeAluno" to "Glenda",
                "numFaltas" to 0
            )
            cadastroFragment.arguments = bundle

            //suport o begin. No replace passa o fragmento e cadastro
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, cadastroFragment)
                .commit()
        }

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, LoginFragment())
                .commit()
        }



    }
}