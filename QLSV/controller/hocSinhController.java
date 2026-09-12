package QLSV.controller;

import QLSV.view.hocSinhView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class hocSinhController implements ActionListener {
    private hocSinhView hocsinhView;

    public hocSinhController(hocSinhView hocsinhView) {
        this.hocsinhView = hocsinhView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // handle action event
        String ten = e.getActionCommand();
        if (ten.equals("Thêm")) {
            hocsinhView.themSinhVien();

        } else if (ten.equals("Xóa")) {
            int chon = JOptionPane.showConfirmDialog(hocsinhView, "Bạn có chắc muốn xóa không",
                    "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION) {
                hocsinhView.xoaSinhVien();
            }


        } else if (ten.equals("Cập nhật")) {
            hocsinhView.CapNhapSinhVien();

        } else if (ten.equals("Cancel")) {
            hocsinhView.cancel();

        } else if (ten.equals("Lọc")) {
            hocsinhView.locSinhVien();

        }

        if (ten.equals("Save")) {
            hocsinhView.luuFile();
        } else if (ten.equals("Open")) {
            hocsinhView.openFile();

        }


    }
}
