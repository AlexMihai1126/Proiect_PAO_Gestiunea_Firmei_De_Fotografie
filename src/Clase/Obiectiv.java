package Clase;

import java.util.List;
import java.util.Set;

public class Obiectiv extends Echipament{
    private String brandObiectiv;
    private String modelObiectiv;
    private String brandCameraCompatibila;
    private String tipCameraCompatibila;

    public Obiectiv(String brandObiectiv, String modelObiectiv, String brandCameraCompatibila, String tipCameraCompatibila) {
        this.brandObiectiv = brandObiectiv;
        this.modelObiectiv = modelObiectiv;
        this.brandCameraCompatibila = brandCameraCompatibila;
        this.tipCameraCompatibila = tipCameraCompatibila;
    }

    public String getBrandObiectiv() {
        return brandObiectiv;
    }

    public void setBrandObiectiv(String brandObiectiv) {
        this.brandObiectiv = brandObiectiv;
    }

    public String getModelObiectiv() {
        return modelObiectiv;
    }

    public void setModelObiectiv(String modelObiectiv) {
        this.modelObiectiv = modelObiectiv;
    }

    public String getBrandCameraCompatibila() {
        return brandCameraCompatibila;
    }

    public void setBrandCameraCompatibila(String brandCameraCompatibila) {
        this.brandCameraCompatibila = brandCameraCompatibila;
    }

    public String getTipCameraCompatibila() {
        return tipCameraCompatibila;
    }

    public void setTipCameraCompatibila(String tipCameraCompatibila) {
        this.tipCameraCompatibila = tipCameraCompatibila;
    }
    @Override
    public Float calculValoareDepreciata() {
        return null;
    }
}
