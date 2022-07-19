package test;

import javax.swing.*;

public class Test {
    private   JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTable table1;

    {

    }

    public static void main(String[] args) {
        Test test = new Test();
        JFrame jFrame = new JFrame();
        jFrame.add(test.panel1);
        jFrame.setSize(200,200);
        jFrame.setVisible(true);

    }

    public void setData(Button1 data) {
    }

    public void getData(Button1 data) {
    }

    public boolean isModified(Button1 data) {
        return false;
    }
}
