package syukron.habib.shopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiptList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA);
        TextView messageArea = (TextView) findViewById(R.id.txt_message);























        messageArea.setText(message);
    }
}
