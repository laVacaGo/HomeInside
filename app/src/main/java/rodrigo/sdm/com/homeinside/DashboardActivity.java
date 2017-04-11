package rodrigo.sdm.com.homeinside;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ignaciosantonjamolina on 11/4/17.
 */

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    /*
        This method is executed when any button in the Dashboard is clicked
    */
    public void dashboardButtonClicked(View v) {

        // Intent object to launch the related activity
        Intent intent = null;

        // Determine the activity to launch according to the Id of the Button clicked
        switch (v.getId()) {

            // Activity for getting
            case R.id.boton11:
                intent = new Intent(this, HomeActivity.class);
                break;

            // Activity for
            case R.id.boton12:
                intent = new Intent(this, );
                break;

            // Activity for configuring the application
            case R.id.boton13:
                intent = new Intent(this, SettingsActivity.class);
                break;

            // Activity to display the application credits
            case R.id.boton21:
                intent = new Intent(this, CamaraActivity.class);
                break;
        }

        // Launch the required activity
        if (intent != null) {
            startActivity(intent);
        }
    }

}
