package maa.monPorteMonnaie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Accueil extends Activity implements View.OnClickListener {
    private ImageButton creditCardButton;
    private ImageButton amexButton;
    private EditText amount;
    private TextView result;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        amount = (EditText) findViewById(R.id.amount);
        creditCardButton = (ImageButton) findViewById(R.id.myCreditCard);
        amexButton = (ImageButton) findViewById(R.id.myAmex);
        result = (TextView) findViewById(R.id.result);
        creditCardButton.setOnClickListener(this);
        amexButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        result.setText(amount.getText());
    }
}