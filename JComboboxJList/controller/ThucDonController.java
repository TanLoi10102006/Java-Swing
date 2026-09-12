package JComboboxJList.controller;

import JComboboxJList.view.ThucDonView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
}
