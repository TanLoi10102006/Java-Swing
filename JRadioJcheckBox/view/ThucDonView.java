package JRadioJcheckBox.view;

import JRadioJcheckBox.controller.ThucDonController;
import JRadioJcheckBox.model.ThucDonModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ThucDonView extends JFrame {
    public ThucDonModel thucDonModel;
    public JPanel jPanel_monChinh, jPanel_monPhu, jPanel_LuaChon, jPanel_ThanhToan;
    public JRadioButton jRadioButton_Com, jRadioButton_Pho, jRadioButton_BanhMi;
    public JCheckBox jCheckBox_TraSua, jCheckBox_BanhNgot, jCheckBox_CocaCola, jCheckBox_Nem;
    public ButtonGroup buttonGroup;
    public JLabel jLabel_ThongTin;
    public JButton jButton_ThanhToan;

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

        ThucDonController thucDonController = new ThucDonController(this);

        Font f = new Font("Arial", Font.BOLD, 40);

        JLabel header = new JLabel("THUC DON NHA HANG");
        header.setForeground(Color.BLUE);
        header.setFont(f);
        JPanel jPanel_tieuDe = new JPanel();
        jPanel_tieuDe.add(header);
        this.add(jPanel_tieuDe, BorderLayout.NORTH);

        jPanel_monChinh = new JPanel();
        jPanel_monChinh.setLayout(new GridLayout(1, 3));
        jRadioButton_Com = new JRadioButton("Com");
        jRadioButton_Pho = new JRadioButton("Pho");
        jRadioButton_BanhMi = new JRadioButton("Banh Mi");

        jRadioButton_Com.setFont(f);
        jRadioButton_Pho.setFont(f);
        jRadioButton_BanhMi.setFont(f);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton_Com);
        buttonGroup.add(jRadioButton_Pho);
        buttonGroup.add(jRadioButton_BanhMi);

        jPanel_monChinh.add(jRadioButton_Com);
        jPanel_monChinh.add(jRadioButton_Pho);
        jPanel_monChinh.add(jRadioButton_BanhMi);

        // jRadioButton_Com.addActionListener(thucDonController);
        // jRadioButton_Pho.addActionListener(thucDonController);
        // jRadioButton_BanhMi.addActionListener(thucDonController);

        jPanel_monPhu = new JPanel();
        jPanel_monPhu.setLayout(new GridLayout(2, 2));
        jCheckBox_TraSua = new JCheckBox("TRA SUA");
        jCheckBox_CocaCola = new JCheckBox("COCACOLA");
        jCheckBox_BanhNgot = new JCheckBox("BANH NGOT");
        jCheckBox_Nem = new JCheckBox("NEM");

        jCheckBox_TraSua.setFont(f);
        jCheckBox_CocaCola.setFont(f);
        jCheckBox_BanhNgot.setFont(f);
        jCheckBox_Nem.setFont(f);

        jPanel_monPhu.add(jCheckBox_TraSua);
        jPanel_monPhu.add(jCheckBox_CocaCola);
        jPanel_monPhu.add(jCheckBox_BanhNgot);
        jPanel_monPhu.add(jCheckBox_Nem);

        // jCheckBox_TraSua.addActionListener(thucDonController);
        // jCheckBox_BanhNgot.addActionListener(thucDonController);
        // jCheckBox_CocaCola.addActionListener(thucDonController);
        // jCheckBox_Nem.addActionListener(thucDonController);


        jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new GridLayout(2, 1));
        jPanel_LuaChon.add(jPanel_monChinh);
        jPanel_LuaChon.add(jPanel_monPhu);
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
