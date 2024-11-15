package com.example.tarearecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tarearecyclerview.Contacto;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements AdaptadorContacto.OnItemClickListener {

    private ArrayList <Contacto> agenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        agenda = new ArrayList<>(Arrays.asList(new Contacto[]{
                new Contacto(R.drawable.hombre1, "734 567 890", "juan.gonzalez@example.com", "González Serrano", "Juan"),
                new Contacto(R.drawable.mujer1, "612 345 678", "maria.lopez@example.com", "López Sánchez", "María"),
                new Contacto(R.drawable.hombre2, "745 678 901", "carlos.ortega@example.com", "Ortega Romero", "Carlos"),
                new Contacto(R.drawable.mujer2, "623 456 789", "ana.garcia@example.com", "García Torres", "Ana"),
                new Contacto(R.drawable.hombre3, "756 789 012", "luis.delgado@example.com", "Delgado Méndez", "Luis"),
                new Contacto(R.drawable.mujer3, "634 567 890", "laura.fernandez@example.com", "Fernández Díaz", "Laura"),
                new Contacto(R.drawable.hombre4, "767 890 123", "miguel.ramos@example.com", "Ramos Cordero", "Miguel"),
                new Contacto(R.drawable.mujer4, "645 678 901", "clara.martinez@example.com", "Martínez Ruiz", "Clara"),
                new Contacto(R.drawable.hombre5, "778 901 234", "javier.castillo@example.com", "Castillo Vázquez", "Javier"),
                new Contacto(R.drawable.mujer5, "656 789 012", "sofia.perez@example.com", "Pérez Gómez", "Sofía"),
                new Contacto(R.drawable.hombre6, "789 012 345", "alvaro.hernandez@example.com", "Hernández Pérez", "Álvaro"),
                new Contacto(R.drawable.mujer6, "667 890 123", "elena.rodriguez@example.com", "Rodríguez Vega", "Elena"),
                new Contacto(R.drawable.hombre7, "790 123 456", "david.sanchez@example.com", "Sánchez Muñoz", "David"),
                new Contacto(R.drawable.mujer7, "678 901 234", "paula.morales@example.com", "Morales Castillo", "Paula"),
                new Contacto(R.drawable.hombre8, "801 234 567", "diego.torres@example.com", "Torres Cabrera", "Diego"),
                new Contacto(R.drawable.mujer8, "689 012 345", "isabel.ramirez@example.com", "Ramírez Hernández", "Isabel"),
                new Contacto(R.drawable.mujer9, "690 123 456", "carmen.sanchez@example.com", "Sánchez Ortiz", "Carmen"),
                new Contacto(R.drawable.mujer10, "701 234 567", "andrea.ruiz@example.com", "Ruiz López", "Andrea"),
                new Contacto(R.drawable.mujer11, "712 345 678", "lucia.jimenez@example.com", "Jiménez Prieto", "Lucía"),
                new Contacto(R.drawable.mujer12, "723 456 789", "eva.gomez@example.com", "Gómez Navarro", "Eva")
        }));

        AdaptadorContacto adaptadorContacto = new AdaptadorContacto(agenda, this);

        RecyclerView rvContactos = findViewById(R.id.rv_contactos);

        rvContactos.setLayoutManager(new LinearLayoutManager(this));

        rvContactos.setAdapter(adaptadorContacto);

    }

    @Override
    public void onItemClick(View view, int position) {
        Contacto contacto = agenda.get(position);
        Toast.makeText(this, contacto.getNombre() + " " + contacto.getApellidos() + "\n" + contacto.getTelefono(), Toast.LENGTH_SHORT).show();
    }
}