package vn.edu.ntu.tuananh.nguyenxuanhuy_59130967_baitapsimplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNgaySinh, edtSoThichKhac;
    RadioGroup rdgGT;
    Button btnSubmit;
    CheckBox check1, check2, check3,check4,check5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addView();
        addEvent();
    }
    private void addView(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        rdgGT = findViewById(R.id.rdgGT);
        btnSubmit = findViewById(R.id.btnSubmit);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        check5 = findViewById(R.id.check5);
    }
    private void addEvent(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, edtTen.getText()  + "\n"
                        + "Ngày sinh: " + edtNgaySinh.getText()
                        + "\nGiới tính: " + checkGT()
                        + "\nSở thích: " + checkBox(check1) + checkBox(check2) +checkBox(check3)
                        + checkBox(check4) + checkBox(check5) + edtSoThichKhac.getText()
                        ,Toast.LENGTH_SHORT).show();
            }
        });
    }
    private String checkGT(){
        if(rdgGT.getCheckedRadioButtonId() == R.id.rbNam)
            return "Nam";
        else
            return "Nữ";
    }
    private String checkBox(CheckBox check){
        if(check.isChecked())
            return check.getText().toString() + ", ";
        else
            return "";
    }
}
