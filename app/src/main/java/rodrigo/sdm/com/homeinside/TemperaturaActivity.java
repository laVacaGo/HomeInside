package rodrigo.sdm.com.homeinside;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

import rodrigo.sdm.com.homeinside.adapters.TemperaturaAdapter;
import rodrigo.sdm.com.homeinside.model.Temperatura;

public class TemperaturaActivity extends AppCompatActivity {

    public int hp,hs,sc,co,ba;
    public static final ArrayList<Temperatura> tmp = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reciclerView);
        recyclerView.setHasFixedSize(true);

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        hp = preferences.getInt("Habitación Principal",24);
        hs = preferences.getInt("Habitacion Secundaria",22);
        sc = preferences.getInt("Salón Comedor",23);
        co = preferences.getInt("Cocina",20);
        ba = preferences.getInt("Baño",21);

        Temperatura temperatura = new Temperatura("Habitación Principal",hp);
        tmp.add(temperatura);
        Temperatura temperatura2 = new Temperatura("Habitacion Secundaria",hs);
        tmp.add(temperatura2);
        Temperatura temperatura3 = new Temperatura("Salón Comedor",sc);
        tmp.add(temperatura3);
        Temperatura temperatura4 = new Temperatura("Cocina",co);
        tmp.add(temperatura4);
        Temperatura temperatura5 = new Temperatura("Baño",ba);
        tmp.add(temperatura5);

        TemperaturaAdapter temperaturaAdapter = new TemperaturaAdapter(tmp);
        recyclerView.setAdapter(temperaturaAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        hideSoftKeyboard();

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor= preferences.edit();
        editor.putInt("Habitación Principal",tmp.get(0).getTemperatura());
        editor.putInt("Habitacion Secundaria",tmp.get(1).getTemperatura());
        editor.putInt("Salón Comedor",tmp.get(2).getTemperatura());
        editor.putInt("Cocina",tmp.get(3).getTemperatura());
        editor.putInt("Baño",tmp.get(4).getTemperatura());

    }

    public void hideSoftKeyboard() {
        if(getCurrentFocus()!=null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }


}
