package JOptionpane.controller;

import JOptionpane.view.ThucDonView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ThucDonController implements ActionListener {
    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        double tongtien = 0;
        String monchinh = thucDonView.comboMonAnChinh.getSelectedItem().toString();
        if (monchinh.equals("Com")) {
            tongtien += 30000;

        } else if (monchinh.equals("Pho")) {
            tongtien += 70000;
        } else if (monchinh.equals("Banh Mi")) {
            tongtien += 20000;
        }

        for (String itemMonPhu : thucDonView.listMonAnPhu.getSelectedValuesList()) {
            switch (itemMonPhu) {
                case "Tra Sua":
                    tongtien += 3000;
                    break;
                case "CocaCola":
                    tongtien += 10000;
                    break;
                case "Banh Ngot":
                    tongtien += 20000;
                    break;
                case "Nem":
                    tongtien += 20000;
                    break;
            }
        }

        thucDonView.thucDonModel.setTongTien(tongtien);
        thucDonView.Thanhtoan();

        String soTien_Chuoi = JOptionPane.showInputDialog(thucDonView, "Nhap vao so tien");

        try {
            double soTien = Double.valueOf(soTien_Chuoi);
            double tienThoiLai = soTien - tongtien;
            JOptionPane.showMessageDialog(thucDonView, "Tiền thối lại cho khách là " + tienThoiLai,
                    "Tiền thối lại", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(thucDonView, "Nhap du lieu sai ", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
}
