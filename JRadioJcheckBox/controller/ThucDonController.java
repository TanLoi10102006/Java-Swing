package JRadioJcheckBox.controller;

import JRadioJcheckBox.view.ThucDonView;
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
        if (thucDonView.jRadioButton_Com.isSelected()) {
            tongtien += 30000;
        } else if (thucDonView.jRadioButton_Pho.isSelected()) {
            tongtien += 70000;
        } else if (thucDonView.jRadioButton_BanhMi.isSelected()) {
            tongtien += 10000;
        }

        if (thucDonView.jCheckBox_TraSua.isSelected()) {
            tongtien += 30000;
        }
        if (thucDonView.jCheckBox_CocaCola.isSelected()) {
            tongtien += 10000;
        }
        if (thucDonView.jCheckBox_BanhNgot.isSelected()) {
            tongtien += 20000;
        }
        if (thucDonView.jCheckBox_Nem.isSelected()) {
            tongtien += 10000;
        }
        thucDonView.thucDonModel.setTongTien(tongtien);
        thucDonView.Thanhtoan();

    }
}
