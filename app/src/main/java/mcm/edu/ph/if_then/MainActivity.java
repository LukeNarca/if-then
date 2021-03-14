package mcm.edu.ph.if_then;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDecision1 = findViewById(R.id.btngo);
        Button btnDecision2 = findViewById(R.id.btnnah);

        TextView txtLore = findViewById(R.id.txtdisplay);
        txtLore.setText("I think Apple is better than Android");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        TextView txtDecision = findViewById(R.id.txtdisplay);

        switch (view.getId()) {
            case R.id.btngo:
                txtDecision.setText("Yes, you have fine taste despite of financial status");
                break;

            case R.id.btnnah:
                txtDecision.setText("Nah bro you just rich enough to look on down us android ");
                break;
        }
    }
}