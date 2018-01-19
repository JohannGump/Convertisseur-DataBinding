package ja.fr.convertervalues;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ja.fr.convertervalues.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Converter valueToConvert;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciation d'une valeur à convertir
        valueToConvert = new Converter(100.00);


        //Création d'un objet de liason (binding)
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main);

            //Définition des variables à lier
            binding.setConverter(valueToConvert);

    }

}
