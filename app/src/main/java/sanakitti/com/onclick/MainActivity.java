package sanakitti.com.onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editNumBerA;
    private EditText editNumberB;
    private Button btnButton;
    private int NumBerA, NumBerB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumBerA = (EditText) findViewById(R.id.edit_numberA);
        editNumberB =(EditText)findViewById(R.id.edit_numberB);
        btnButton = (Button) findViewById(R.id.btn_button);
        btnButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(MainActivity.this, "đây là OnLongclicklistener", Toast.LENGTH_SHORT).show();
                return false;
            }

        });

        btnButton.setOnClickListener(new View.OnClickListener() { //cách bắt sự kiện của button.  dm khôn thể nhớ dc
            @Override
            public void onClick(View v) {
                if(!editNumBerA.getText().toString().isEmpty()&&!editNumberB.getText().toString().isEmpty()) {
                    NumBerA = Integer.parseInt(editNumBerA.getText().toString()); //dung để lấy đoạn dữ liệu của EditText
                    NumBerB = Integer.parseInt(editNumberB.getText().toString());
                    Toast.makeText(MainActivity.this, +NumBerA + " + " + NumBerB + "là :" + (NumBerA + NumBerB), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "vui lòng nhập lại", Toast.LENGTH_SHORT).show(); //trường hợp ngược lại của if
                }
            }
        });
    }
}
