package rodrigo.sdm.com.homeinside.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

import rodrigo.sdm.com.homeinside.R;
import rodrigo.sdm.com.homeinside.model.Temperatura;

/**
 * Created by vicov on 24/04/2017.
 */

public class TemperaturaViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    NumberPicker numberPicker;

    public TemperaturaViewHolder(View itemView) {
        super(itemView);
        title = (TextView)itemView.findViewById(R.id.titleTemperatura);
        numberPicker = (NumberPicker)itemView.findViewById(R.id.numberPicker);

    }

    public void updateUI(Temperatura tmp){
        title.setText(tmp.getTitle());
        numberPicker.setMaxValue(30);
        numberPicker.setMinValue(18);
        numberPicker.setValue(tmp.getTemperatura());
    }
}
