package tb.soft;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
// import java.awt.*;

public class Main {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MyWindow frame = new MyWindow("Login Window");
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        });
    }
}

