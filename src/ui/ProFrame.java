package ui;

import javax.swing.*;
import java.awt.*;

public class ProFrame extends JFrame {

    static int width = 800;
    static int height = 600;

    public static void main(String... args){

        ProFrame frame = new ProFrame();
        frame.init(width,height);

    }

    private void init(int width, int height){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(width, height);
        setTitle("Pro II");

        JPanel toolBar = new JPanel();
        add(toolBar, BorderLayout.NORTH);

        JButton button = new JButton();
        button.setText("Prodej poznamku");
        toolBar.add(button);

        JTable table = new JTable();
        add(new JScrollPane(table), BorderLayout.CENTER);
        pack();
    }
}
