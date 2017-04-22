package rodrigo.sdm.com.homeinside;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class IluminacionActivity extends AppCompatActivity {

    protected boolean luz1;
    protected boolean luz2;
    protected boolean luz3;
    protected boolean luz4;
    protected boolean luz5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilumination);

        /*LayoutInflater inflater = (LayoutInflater) getApplicationContext()
                .getSystemService(this.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_main, null, false);
        activity_ilumination.addView(contentView, 0);*/


        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        luz1=preferences.getBoolean("habitacion1",false);
        luz2=preferences.getBoolean("habitacion2",false);
        luz3=preferences.getBoolean("habitacion3",false);
        luz4=preferences.getBoolean("habitacion4",false);
        luz5=preferences.getBoolean("habitacion5",false);

        ImageView image1=(ImageView) findViewById(R.id.bombilla1);
        if(luz1) image1.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
        else  image1.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));

        ImageView image2=(ImageView) findViewById(R.id.bombilla2);
        if(luz2) image2.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
        else  image2.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));

        ImageView image3=(ImageView) findViewById(R.id.bombilla3);
        if(luz3) image3.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
        else  image3.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));

        ImageView image4=(ImageView) findViewById(R.id.bombilla4);
        if(luz4) image4.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
        else  image4.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));

        ImageView image5=(ImageView) findViewById(R.id.bombilla5);
        if(luz5) image5.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
        else  image5.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));


        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }
    @Override
    public void onPause(){
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor= preferences.edit();
        editor.putBoolean("habitacion1", luz1);
        editor.putBoolean("habitacion2", luz2);
        editor.putBoolean("habitacion3", luz3);
        editor.putBoolean("habitacion4", luz4);
        editor.putBoolean("habitacion5", luz5);

        editor.apply();
        super.onPause();
    }
    @Override
    public void onResume(){
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        luz1=preferences.getBoolean("habitacion1",false);
        luz2=preferences.getBoolean("habitacion2",false);
        luz3=preferences.getBoolean("habitacion3",false);
        luz4=preferences.getBoolean("habitacion4",false);
        luz5=preferences.getBoolean("habitacion5",false);
        super.onResume();
    }
    public void onClickBombilla(View v){
        ImageView image=(ImageView) v;
        int id= v.getId();
        switch (id){
            case R.id.bombilla1:
                if(luz1){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));
                    luz1=false;}
                else{
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
                    luz1=true;};
                break;
            case R.id.bombilla2:
                if(luz2){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));
                    luz2=false;}
                else{
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
                    luz2=true;};
                break;
            case R.id.bombilla3:
                if(luz3){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));
                    luz3=false;}
                else{
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
                    luz3=true;};
                break;
            case R.id.bombilla4:
                if(luz4){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));
                    luz4=false;}
                else{
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
                    luz4=true;};
                break;
            case R.id.bombilla5:
                if(luz5){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_apagada_redonda));
                    luz5=false;}
                else{
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.bombilla_encendida_redonda));
                    luz5=true;};
                break;
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;

        if (id == R.id.nav_iluminacion) {
            intent= new Intent(this, IluminacionActivity.class);
            startActivity(intent);

        }/* else if (id == R.id.MainActivty.class) {

        } else if (id == R.id.nav_persianas) {

        } else if (id == R.id.nav_camara) {
            Intent intent=new Intent(this,CamaraActivity.class);

        } else if (id == R.id.nav_tools) {
            Intent intent=new Intent(this,SettingsActivity.class);

        } else if (id == R.id.nav_share) {

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
