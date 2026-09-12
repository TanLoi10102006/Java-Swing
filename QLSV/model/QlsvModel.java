package QLSV.model;

import java.util.ArrayList;

public class QlsvModel {
    private ArrayList<ThiSinh> dsThisinh;

    public QlsvModel() {
        this.dsThisinh = new ArrayList<ThiSinh>();
    }

    public QlsvModel(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThisinh = dsThiSinh;

    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThisinh;
    }

    public void setDSThiSinh(ArrayList<ThiSinh> dsThisinh) {
        this.dsThisinh = dsThisinh;

    }

    public void Them(ThiSinh thiSinh) {
        this.dsThisinh.add(thiSinh);
    }

    public void Xoa(ThiSinh thiSinh) {
        this.dsThisinh.remove(thiSinh);
    }

    public void CapNhat(ThiSinh thiSinh) {
        this.dsThisinh.remove(thiSinh);
        this.dsThisinh.add(thiSinh);

    }

    public ArrayList<ThiSinh> loc(String ma, String queQuan) {

        ArrayList<ThiSinh> ketQua = new ArrayList<>();

        for (ThiSinh ts : dsThisinh) {

            boolean dungMa = ma.isEmpty() || String.valueOf(ts.getMaThiSinh()).contains(ma);

            boolean dungQue =
                    queQuan.isEmpty() || ts.getQueQuan().getTenTinh().equalsIgnoreCase(queQuan);

            if (dungMa && dungQue) {
                ketQua.add(ts);
            }
        }

        return ketQua;
    }

}
