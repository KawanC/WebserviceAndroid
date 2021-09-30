package com.tcc.webserviceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button buscarTodos = findViewById(R.id.buscarTodos);
        buscarTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Caminho da API (URL do webservice)
                String url = "http://10.87.106.26/Thalis/api/Produto";
                
                //Iniciar a requisição ao webservice
                RequestQueue requisicao = Volley.newRequestQueue(MainActivity.this);
                
                //Configurar a requisicao com a URl, o método (Get, Post, Pur ou Delete)
                //Como o método do webservice retorna um Array, devemos fazer a chamada
                //usando a classe JsonArrayRequest
                JsonArrayRequest config = new JsonArrayRequest(
                        Request.Method.GET, //Método que será usado
                        url, //Caminho da API do webservice
                        null, //Não haverá parâmetros a serem passados
                        new
                )
            }
        });
    }
}