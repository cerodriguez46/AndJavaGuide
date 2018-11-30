package christopher.andjavaguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void passData(View view) {
        String message = "You passed the data to the other activity!";
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("CUSTOMESSAGE", message);
        startActivity(intent);
    }


}
