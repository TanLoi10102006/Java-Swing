package JTextTareaa.MVC.model;
public class timKiemThongKe {
    private String tuKhoa;
    private String ketqua;
    private String vanBan;

    // Constructor mặc định
    public timKiemThongKe() {
        this.tuKhoa = "";
        this.ketqua = "";
        this.vanBan = "";
    }

    // Getter & Setter cho tuKhoa
    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    // Getter & Setter cho ketqua
    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }

    // Getter & Setter cho ThongKe
    public String getvanBan() {
        return vanBan;
    }

    public void setvanBan(String vanBan) {
        this.vanBan = vanBan;
    }
    public void timkiem(){
         int dem =0;
         int viTri=0;
            
        while (true) { 
           int i=this.vanBan.indexOf(this.tuKhoa,viTri); 
           if (i==-1){
            break;
           }else{
            dem++;
            viTri=i+1;
           }
        }
        this.ketqua="ket qua co "+dem+this.tuKhoa;

    }
}
