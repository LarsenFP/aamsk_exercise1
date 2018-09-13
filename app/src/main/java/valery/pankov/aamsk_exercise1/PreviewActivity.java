package valery.pankov.aamsk_exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity
{
    public static final String KEY_MSG = "KEY_MSG";
    private Button btn_send;
    private TextView tv_preview;
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        msg = getIntent().getStringExtra("KEY_MSG");
        tv_preview = findViewById(R.id.tv_preview);
        btn_send = findViewById(R.id.btn_send);
        tv_preview.setText(msg);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, msg);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }


}