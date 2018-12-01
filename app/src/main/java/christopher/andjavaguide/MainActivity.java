package christopher.andjavaguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import icepick.Icepick;
import icepick.State;


public class MainActivity extends AppCompatActivity {

    @State
    String merc = "Mercury";
    @State
    int weight = 102;
    @State
    double circumference = 12345.25;
    @State
    boolean isTitled = true;
    @State
    ArrayList otherPlanets = new ArrayList();

    @BindView(R.id.tv1)
    TextView mercText;

    @BindView(R.id.tv2)
    TextView venText;

    @BindView(R.id.tv3)
    TextView EarthText;

    @BindView(R.id.tv4)
    TextView MarsText;

    @BindView(R.id.tv5)
    TextView otherPlanetsText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Icepick.restoreInstanceState(this, savedInstanceState);

        otherPlanets.add("Venus");
        otherPlanets.add("Earth");
        otherPlanets.add("Mars");
        otherPlanets.add("Jupiter");
        otherPlanets.add("Saturn");
        otherPlanets.add("Uranus");
        otherPlanets.add("Neptune");

        mercText.setText(merc);
        venText.setText(String.valueOf(weight));
        EarthText.setText(String.valueOf(circumference));
        MarsText.setText(String.valueOf(isTitled));
        otherPlanetsText.setText(String.valueOf(otherPlanets));
        for (int i = 0; i > otherPlanets.size(); i++) {
            System.out.println(otherPlanets.get(i));

        }


    }

    public void onSaveInstanceState(Bundle outState) {
        /*outState.putString("FIRST_PLANET", merc);
        outState.putInt("PLANET_WEIGHT", weight);
        outState.putDouble("PLANET_WIDTH", circumference);
        outState.putBoolean("PLANET_TILT", isTitled);
        outState.putStringArrayList("OTHER_PLANET", otherPlanets);*/
        Icepick.saveInstanceState(this, outState);
        super.onSaveInstanceState(outState);
    }

    /*@Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        mercText.setText(savedInstanceState.getString("FIRST_PLANET"));
        venText.setText(savedInstanceState.getInt("PLANET_WEIGHT"));
        EarthText.setText(String.valueOf(savedInstanceState.getDouble("PLANET_WIDTH")));
        MarsText.setText(String.valueOf(savedInstanceState.getBoolean("PLANET_TILT")));
        otherPlanetsText.setText(String.valueOf(savedInstanceState.getStringArrayList("OTHER_PLANET")));
    }*/
}

