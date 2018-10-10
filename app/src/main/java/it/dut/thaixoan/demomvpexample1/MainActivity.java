package it.dut.thaixoan.demomvpexample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import it.dut.thaixoan.demomvpexample1.XuLyDangNhap.PresenterLogicXuLyDangNhap;
import it.dut.thaixoan.demomvpexample1.XuLyDangNhap.ViewXuLyDangNhap;

public class MainActivity extends AppCompatActivity
        implements ViewXuLyDangNhap, View.OnClickListener {

    private EditText mEditTextTenDangNhap;
    private EditText mEditTextMatKhau;
    Button mButtonDangNhap;
    PresenterLogicXuLyDangNhap logicXuLyDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        mEditTextTenDangNhap = findViewById(R.id.edittext_tendangnhap);
        mEditTextMatKhau = findViewById(R.id.edittext_matkhau);
        mButtonDangNhap = findViewById(R.id.button_dangnhap);
        logicXuLyDangNhap = new PresenterLogicXuLyDangNhap(this);
        mButtonDangNhap.setOnClickListener(this);
    }

    @Override
    public void dangNhapThanhCong(String tenDangNhap) {
        Toast.makeText(MainActivity.this, "Đăng nhập thành công " + tenDangNhap, Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void dangNhapThatBai() {
        Toast.makeText(MainActivity.this, "Đăng nhập thất bai", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        logicXuLyDangNhap.kiemTraDangNhap(mEditTextTenDangNhap.getText().toString(),
                mEditTextMatKhau.getText().toString());
    }
}
