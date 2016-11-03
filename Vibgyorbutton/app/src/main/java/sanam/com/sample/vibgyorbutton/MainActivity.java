package sanam.com.sample.vibgyorbutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button redbutton;
    private Button orangebutton;
    private Button yellowbutton;
    private Button greenbutton;
    private Button bluebutton;
    private Button indigobutton;
    private Button violetbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redbutton = (Button) findViewById(R.id.redbutton);
        orangebutton = (Button) findViewById(R.id.orangebutton);
        yellowbutton = (Button) findViewById(R.id.yellowbutton);
        greenbutton = (Button) findViewById(R.id.greenbutton);
        bluebutton = (Button) findViewById(R.id.bluebutton);
        indigobutton = (Button) findViewById(R.id.indigobutton);
        violetbutton = (Button) findViewById(R.id.violetbutton);

        redbutton.setTag("Red button");
        orangebutton.setTag("Orange button");
        yellowbutton.setTag("Yellow button");
        greenbutton.setTag("Green button");
        bluebutton.setTag("Blue button");
        indigobutton.setTag("Indigo button");
        violetbutton.setTag("Violet button");

        redbutton.setOnClickListener(this);
        orangebutton.setOnClickListener(this);
        yellowbutton.setOnClickListener(this);
        greenbutton.setOnClickListener(this);
        bluebutton.setOnClickListener(this);
        indigobutton.setOnClickListener(this);
        violetbutton.setOnClickListener(this);





    }

    @Override
    public void onClick(View V) {

        Toast.makeText(MainActivity.this, "The "+ V.getTag()+ " is clicked", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity","The "+ V.getTag()+ " is clicked");



    }
}
