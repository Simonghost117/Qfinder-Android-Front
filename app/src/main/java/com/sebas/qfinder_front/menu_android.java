package com.sebas.qfinder_front;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class menu_android extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_android); // Asegúrate de que este es el nombre correcto del XML

        drawerLayout = findViewById(R.id.navigationView); // Verifica que este ID esté en tu XML

        Button btnPerfil = findViewById(R.id.btnPerfil);
        Button btnNotas = findViewById(R.id.btnNotas);
        Button btnTurnos = findViewById(R.id.btnTurnos);
        Button btnRecordatorio = findViewById(R.id.btnRecordatorio);
        Button btnUbicacion = findViewById(R.id.btnUbicacion);

        // En lugar de abrir actividades, muestra un Toast con el nombre del botón
        btnPerfil.setOnClickListener(v -> showMessage("Perfil"));
        btnNotas.setOnClickListener(v -> showMessage("Registrar notas"));
        btnTurnos.setOnClickListener(v -> showMessage("Turnos"));
        btnRecordatorio.setOnClickListener(v -> showMessage("Recordatorio"));
        btnUbicacion.setOnClickListener(v -> showMessage("Ubicación"));
    }

    private void showMessage(String message) {
        Toast.makeText(this, "Clic en: " + message, Toast.LENGTH_SHORT).show();
    }
}
