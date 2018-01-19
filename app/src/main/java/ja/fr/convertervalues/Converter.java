package ja.fr.convertervalues;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Converter extends BaseObservable{

    private Double euro = 0.0;
    private Double yen = 0.0;

    private final Double convertRate = 135.869324;

    public Converter() {
    }

    public Converter(Double euro) {
        this.euro = euro;
        this.yen = this.euro * convertRate;
    }

    @Bindable
    public String getEuro() {
        return String.valueOf(euro);
    }

    public Converter setEuro(String euro) {
        if( ! euro.equals("")) {
            this.euro = Double.valueOf(euro);
            this.yen = this.euro * convertRate;
        } else{
            this.yen = 0.0;
        }

        //indique au moteur de databinding que j'ai une prop qui a changé
        //et que la vue doit se mettre à jour
        notifyPropertyChanged(BR.yen);

        return this;
    }

    @Bindable
    public String getYen() {
        return String.valueOf(yen);
    }

    public Converter setYen(String yen) {
        this.yen = Double.valueOf(yen);
        return this;
    }

}