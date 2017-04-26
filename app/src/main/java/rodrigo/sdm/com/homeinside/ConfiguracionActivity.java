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
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor= preferences.edit();
       /* editor.putString("usuario", );
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
        TextView user=(TextView) findViewById(R.id.textViewUser);
        TextView email= (TextView) findViewById(R.id.textViewEmail);
        TextView datosUser= (TextView) findViewById(R.id.user);
        TextView datosEmail= (TextView) findViewById(R.id.email);
        TextView pass= (TextView) findViewById(R.id.pass);
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        String contrasena= preferences.getString("userRodrigoPass", "1234");

        if(contrasena.equals(pass.getText())){
            user.setText(datosUser.getText());
            email.setText(datosEmail.getText());
        }else Toast.makeText(ConfiguracionActivity.this,R.string.error_login,Toast.LENGTH_SHORT).show();

    }
    protected void onClickIdentification(View v){
       /* EditText user=(EditText) findViewById(R.id.user);
        EditText pass=(EditText) findViewById(R.id.pass);
        TextView tvUser=(TextView) findViewById(R.id.textViewUser);
        TextView tvEmail=(TextView) findViewById(R.id.textViewEmail);
        tvUser.setText(user.getText());
        tvEmail.setText(pass.getText());*/

    }
}
