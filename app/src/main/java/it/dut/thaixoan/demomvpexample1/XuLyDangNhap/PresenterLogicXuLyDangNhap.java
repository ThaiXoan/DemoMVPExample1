package it.dut.thaixoan.demomvpexample1.XuLyDangNhap;

public class PresenterLogicXuLyDangNhap implements PresenterImplementXuLyDangNhap{
    ViewXuLyDangNhap mViewXuLyDangNhap;
    public PresenterLogicXuLyDangNhap(ViewXuLyDangNhap viewXuLyDangNhap){
        this.mViewXuLyDangNhap = viewXuLyDangNhap;
    }
    @Override
    public void kiemTraDangNhap(String tenDangNhap, String matKhau) {
        // gọi tới model lấy dữ liệu
        if (tenDangNhap.equals("admin") && matKhau.equals("123")){
            // trả ra view đăng nhập thành công
            mViewXuLyDangNhap.dangNhapThanhCong(tenDangNhap);
        } else {
            // trả ra view đăng nhập thất bại
            mViewXuLyDangNhap.dangNhapThatBai();
        }
    }
}
