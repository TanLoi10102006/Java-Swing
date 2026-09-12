package JOptionpane.view;

import JOptionpane.controller.ThucDonController;
import JOptionpane.model.ThucDonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ThucDonView extends JFrame {
    public ThucDonModel thucDonModel;
    public JPanel jPanel_monChinh, jPanel_monPhu, jPanel_LuaChon, jPanel_ThanhToan;
    public JLabel jLabel_ThongTin;
    public JButton jButton_ThanhToan;
    public JComboBox<String> comboMonAnChinh;
    public JList<String> listMonAnPhu;

    public ThucDonView() {
        this.thucDonModel = new ThucDonModel();
        this.init();
        this.setVisible(true);

    }

    public void init() {
        this.setTitle("THUC DON");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        Font f = new Font("Arial", Font.BOLD, 40);

        ThucDonController thucDonController = new ThucDonController(this);

        JLabel header = new JLabel("THUC DON NHA HANG");
        header.setForeground(Color.BLUE);
        header.setFont(f);
        JPanel jPanel_tieuDe = new JPanel();
        jPanel_tieuDe.add(header);
        this.add(jPanel_tieuDe, BorderLayout.NORTH);

        jPanel_monChinh = new JPanel();
        jPanel_monChinh.setLayout(new FlowLayout());
        String[] MonAnChinh = new String[] {"Com", "Pho", "Banh Mi"};
        comboMonAnChinh = new JComboBox<String>(MonAnChinh);
        comboMonAnChinh.setFont(f);
        jPanel_monChinh.add(comboMonAnChinh);


        jPanel_monPhu = new JPanel();
        jPanel_monPhu.setLayout(new FlowLayout());
        String[] MonPhu = new String[] {"Tra Sua", "CocaCola", "Banh Ngot", "Nem"};
        listMonAnPhu = new JList<String>(MonPhu);
        listMonAnPhu.setFont(f);
        jPanel_monPhu.add(listMonAnPhu);

        jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new BorderLayout());
        jPanel_LuaChon.add(jPanel_monChinh, BorderLayout.NORTH);
        jPanel_LuaChon.add(jPanel_monPhu, BorderLayout.CENTER);
        this.add(jPanel_LuaChon, BorderLayout.CENTER);

        jPanel_ThanhToan = new JPanel();
        jPanel_ThanhToan.setLayout(new GridLayout(1, 2));
        jLabel_ThongTin = new JLabel();
        jLabel_ThongTin.setFont(f);
        jButton_ThanhToan = new JButton("Thanh Toan");
        jButton_ThanhToan.addActionListener(thucDonController);
        jButton_ThanhToan.setFont(f);
        jPanel_ThanhToan.add(jLabel_ThongTin);
        jPanel_ThanhToan.add(jButton_ThanhToan);

        this.add(jPanel_ThanhToan, BorderLayout.SOUTH);

    }

    public void Thanhtoan() {
        jLabel_ThongTin.setText("Tong Tien" + thucDonModel.getTongTien() + " VND");
    }

    public static void main(String[] args) {
        new ThucDonView();
    }



}
