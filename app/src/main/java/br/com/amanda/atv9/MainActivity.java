
//Olá, Quando você rodar o aplicativo, toda vez que o usuário tocar na tela,
// uma mensagem Toast aparecerá dizendo "Tela tocada pelo Professor Ademar!".

package br.com.amanda.atv9; // Nome do pacote do projeto

import android.os.Bundle;  // Importando o pacote para gerenciar o ciclo de vida da Activity.
import android.view.MotionEvent;  // Importando o pacote para capturar eventos de toque na tela.
import android.view.View;  // Importando o pacote para interagir com as Views.
import android.widget.LinearLayout;  // Importando o pacote para o layout LinearLayout.
import android.widget.Toast;  // Importando o pacote para exibir mensagens Toast.
import androidx.appcompat.app.AppCompatActivity;  // Importando a classe base para a Activity.

public class MainActivity extends AppCompatActivity {  // Definindo a classe principal da Activity.

    @Override
    protected void onCreate(Bundle pacoteDoProfessorAdemar) {  // Método que é chamado quando a Activity é criada.
        super.onCreate(pacoteDoProfessorAdemar);
        setContentView(R.layout.activity_main);  // Definindo qual layout usar para esta Activity.

        // Encontrando o layout principal pelo ID ProfessorAdemarLayout
        LinearLayout ProfessorAdemarLayout = findViewById(R.id.ProfessorAdemarLayout);

        // Configurando o listener para capturar toques na tela
        ProfessorAdemarLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent toqueDoProfessorAdemar) {
                // Exibindo o Toast ao tocar na tela
                Toast.makeText(MainActivity.this, "Tela tocada pelo Professor Ademar!", Toast.LENGTH_SHORT).show();
                return true;  // Retornando true indica que o evento de toque foi consumido.
            }
        });
    }
}
