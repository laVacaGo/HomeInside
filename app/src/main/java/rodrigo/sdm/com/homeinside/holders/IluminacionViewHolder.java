package rodrigo.sdm.com.homeinside.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

import rodrigo.sdm.com.homeinside.R;
import rodrigo.sdm.com.homeinside.model.Iluminacion;

/**
 * Created by rodriGO on 25/04/2017.
 */

public class IluminacionViewHolder extends RecyclerView.ViewHolder {

    public TextView  habitacion;

        //busca los item del cardview
        public IluminacionViewHolder(View itemView) {
            super(itemView);
            habitacion = (TextView)itemView.findViewById(R.id.tv_habitacion1);
        }

        //valor que tienes en la clase y los maqueta
        public void updateUI(final Iluminacion ilum, final int pos){
            habitacion.setText(ilum.getHabitacion());
        }
}
