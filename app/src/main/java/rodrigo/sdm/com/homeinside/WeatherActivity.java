package rodrigo.sdm.com.homeinside;

import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ignaciosantonjamolina on 19/4/17.
 */

public class WeatherActivity extends AppCompatActivity {

    GetWeatherAsyncTask task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        final TextView temperatura = (TextView) findViewById(R.id.textView3);
        String texto = temperatura.getText().toString();
        texto += "25";
        temperatura.setText(texto);
        temperatura.setBackgroundColor(Color.BLUE);

        final TextView humedad = (TextView) findViewById(R.id.textView5);
        String texto2 = humedad.getText().toString();
        texto2 += "25";
        temperatura.setText(texto2);
        temperatura.setBackgroundColor(Color.BLUE);

        final TextView precipitaciones = (TextView) findViewById(R.id.textView7);
        String texto3 = precipitaciones.getText().toString();
        texto3 += "25";
        temperatura.setText(texto3);
        temperatura.setBackgroundColor(Color.BLUE);

        final TextView viento = (TextView) findViewById(R.id.textView9);
        String texto4 = viento.getText().toString();
        texto4 += "25";
        temperatura.setText(texto4);
        temperatura.setBackgroundColor(Color.BLUE);

        if (isConnectionAvailable()) {

            // Display the ProgressBar to let the user know some operation is in progress
            //progressBar.setVisibility(ProgressBar.VISIBLE);

            // Create a new asynchronous task to connect to the web service
            task = new GetWeatherAsyncTask();
            task.setParent(this);
            // Start the task
            task.execute();
        }
    }



    /*
        Check whether Internet connectivity is available
    */
    private boolean isConnectionAvailable() {

        // Get a reference to the ConnectivityManager
        ConnectivityManager manager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        // Get information for the current default data network
        NetworkInfo info = manager.getActiveNetworkInfo();
        // Return true if there is network connectivity
        return ((info != null) && info.isConnected());
    }

    /*
       Method for asynchronous tasks to notify that a new data has been obtained
   */
    public void gotWeather(Double temperatura, Double humedad, Double precipitaciones, Double viento) {

        // Update information displayed on the screen: temperature, humidity and wind
        ((TextView) findViewById(R.id.textView3)).setText(temperatura.toString());
        ((TextView) findViewById(R.id.textView5)).setText(humedad.toString());
        ((TextView) findViewById(R.id.textView7)).setText(precipitaciones.toString());
        ((TextView) findViewById(R.id.textView9)).setText(viento.toString());


        // Change to true those flags that control whether to display an action for
        // getting a new quotation and adding the current one to the favourites list
        //newQuotation = true;
        //addQuotation = true;

        // Ask the system to rebuild the options of the ActionBar
        supportInvalidateOptionsMenu();

        // Hide the ProgressBar to let the user know that the operation has finished
        //progressBar.setVisibility(ProgressBar.INVISIBLE);
    }

    /*
            Method for asynchronous tasks to notify that
            there was not possible to get the requested quotation
        */

    public void resetWeather() {

        // Display a popup notifying the problem
        //Toast.makeText(this, R.string.problem, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Problemas!", Toast.LENGTH_SHORT).show();

        // Change to true the flag that control whether to display an action for
        // getting a new quotation, and to false that in charge of
        // adding the current quotation to the favourites list
     //   newQuotation = true;
     //   addQuotation = false;
        // Ask the system to rebuild the options of the ActionBar
        supportInvalidateOptionsMenu();

        // Hide the ProgressBar to let the user know that the operation has finished
    //    progressBar.setVisibility(ProgressBar.INVISIBLE);
    }



}
