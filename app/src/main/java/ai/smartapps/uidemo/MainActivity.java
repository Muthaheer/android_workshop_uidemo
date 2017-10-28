package ai.smartapps.uidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.editText);
        tv=(TextView) findViewById(R.id.textView);

        btn=(Button) findViewById(R.id.btn_submit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String s = et.getText().toString();
                tv.setText(s);
                Toast.makeText(MainActivity.this,"Button was clicked",Toast.LENGTH_LONG).show();
            }
        });


    }
}
