package com.example.facebookrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<IViewModel> publications = new ArrayList<IViewModel>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));
        testPublication();
        MyAdapter adapter = new MyAdapter(publications);
        recyclerView.setAdapter(adapter);
    }

    public void testPublication(){
        publications.add(new TextPublic(0,R.mipmap.ic_user2,"Mariel Salcedo", "@MarielS", (float) 10.0, "Este es mi perfil"));
        publications.add(new TextPublic(1,R.mipmap.ic_user, "Daniel GB", "@DanielGB", (float) 11.00, "Bienvenido a mi perfil"));
        publications.add(new TextPublic(2,R.mipmap.ic_user5, "Andrea Torres", "@AndyT", (float) 13.00, "Buenos días"));
        publications.add(new ImagePublic(3,R.mipmap.ic_user3, "Santiago Sanchez", "@SantiagoSanchez", (float) 16.30, "Mi paísaje",R.mipmap.user_post));
        publications.add(new ImagePublic(1,R.mipmap.ic_user, "Daniel GB", "@DanielGB", (float) 18.00, "Fotos de mi viaje",R.mipmap.user_post2));
        publications.add(new TextPublic(2,R.mipmap.ic_user5, "Andrea Torres", "@AndyT", (float) 13.00, "Tengo hambre"));
        publications.add(new ImagePublic(1,R.mipmap.ic_user, "DanieL GB", "@DanielGB", (float) 18.00, "Vacaciones",R.mipmap.user_post3));
    }
}