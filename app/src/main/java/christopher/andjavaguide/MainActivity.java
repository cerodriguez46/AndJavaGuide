package christopher.andjavaguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    String merc = "Mercury";
    int weight = 102;
    double circumference = 12345.25;
    boolean isTitled = true;
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

        otherPlanets.add("Venus");
        otherPlanets.add("Earth");
        otherPlanets.add("Mars");
        otherPlanets.add("Jupiter");
        otherPlanets.add("Saturn");
        otherPlanets.add("Uranus");
        otherPlanets.add("Neptune");




    }
}

