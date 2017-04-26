package rodrigo.sdm.com.homeinside;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

        super.onResume();
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
