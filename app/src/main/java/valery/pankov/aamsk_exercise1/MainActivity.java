package valery.pankov.aamsk_exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_preview;
    private EditText et_preview;
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_preview = findViewById(R.id.et_preview);
        btn_preview = findViewById(R.id.btn_preview);

        btn_preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg = (et_preview.getText()).toString();
                if(msg.length()!=0){
                    watchPreview(msg);
                }
            }
        });
    }

    private void watchPreview(String msg) {
        Intent previewActivityIntent = new Intent(this, PreviewActivity.class);
        previewActivityIntent.putExtra("KEY_MSG", msg);
        startActivity(previewActivityIntent);
    }
}
