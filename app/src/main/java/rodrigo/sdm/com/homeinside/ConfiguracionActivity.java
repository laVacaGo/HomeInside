package rodrigo.sdm.com.homeinside;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfiguracionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
    }
    @Override
    protected void onPause(){
        /*SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor= preferences.edit();
        editor.putString("usuario", );
        editor.putBoolean("password", );
        editor.putBoolean("cocina", luz3);*/
        super.onPause();
    }
    @Override
    protected void onResume(){
        /*SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        String contrasena= preferences.getString("userRodrigoPass", "");*/
        super.onResume();
    }

    public void login (View view){
        EditText datosUser= (EditText) findViewById(R.id.user);
        EditText datosEmail= (EditText) findViewById(R.id.email);
        EditText pass= (EditText) findViewById(R.id.pass);


        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        /*SharedPreferences.Editor editor= preferences.edit();
        String aux=(String) datosUser.getText().toString();
        editor.putString("usuario_name", aux);
        aux=(String) datosEmail.getText().toString();
        editor.putString("email_name", aux);
        editor.apply();*/

        String contrasena= preferences.getString("userRodrigoPass", "1234");

        if(!contrasena.equals(pass.getText())) Toast.makeText(ConfiguracionActivity.this,R.string.error_login,Toast.LENGTH_SHORT).show();
    }
}
