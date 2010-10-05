package maa.monPorteMonnaie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends Activity implements View.OnClickListener {
    private Button creditCardButton;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        creditCardButton = (Button) findViewById(R.id.myCreditCard);
        creditCardButton.setOnClickListener(this);
    }

    public void onClick(View v) {
    }
}