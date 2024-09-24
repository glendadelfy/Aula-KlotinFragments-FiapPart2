package com.glenda.aulafragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// deltea o //TODO  que tinha
class CadastroFragment : Fragment() {
    private lateinit var editNome: EditText
    private lateinit var btnEnviar: Button
    private lateinit var txtResultado : TextView

    private var nomeAluno:String? = null
    private var numFaltas:Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nomeAluno = arguments?.getString("nomeAluno")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)

        editNome = view.findViewById(R.id.editNome)
        btnEnviar = view.findViewById(R.id.btnEnviar)
        txtResultado = view.findViewById(R.id.txtResultado)
        txtResultado.text = nomeAluno

        btnEnviar.setOnClickListener{
            //val nome:String = editNome.text.toString()

            numFaltas = arguments?.getInt("numFaltas")


            Log.i("nome", "$nomeAluno - numero de faltas $numFaltas")
        }
        return view

    }


}
//attachtorootfalse ramificação de conteiners em hierarquia, mais de um seria true

