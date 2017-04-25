package rodrigo.sdm.com.homeinside;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reciclerView);
        recyclerView.setHasFixedSize(true);

        ArrayList<Temperatura> tmp = new ArrayList<>();
        Temperatura temperatura = new Temperatura("Habitación Principal",24);
        tmp.add(temperatura);
        Temperatura temperatura2 = new Temperatura("Habitacion Secundaria",22);
        tmp.add(temperatura2);
        Temperatura temperatura3 = new Temperatura("Salón Comedor",23);
        tmp.add(temperatura3);
        Temperatura temperatura4 = new Temperatura("Cocina",20);
        tmp.add(temperatura4);
        Temperatura temperatura5 = new Temperatura("Baño",21);
        tmp.add(temperatura5);

        TemperaturaAdapter temperaturaAdapter = new TemperaturaAdapter(tmp);
        recyclerView.setAdapter(temperaturaAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        hideSoftKeyboard();

    }


    public void hideSoftKeyboard() {
        if(getCurrentFocus()!=null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }


}
