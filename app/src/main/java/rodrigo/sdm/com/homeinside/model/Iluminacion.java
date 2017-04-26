package rodrigo.sdm.com.homeinside.model;

/**
 * Created by rodriGO on 25/04/2017.
 */

public class Iluminacion {
    protected String habitacion, lampara;
    protected boolean estado;

    public Iluminacion(boolean est, String hab, String lam){
        this.habitacion=hab;
        this.lampara=lam;
        this.estado=est;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getLampara() {
        return lampara;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setLampara(String lampara) {
        this.lampara = lampara;
    }

}

