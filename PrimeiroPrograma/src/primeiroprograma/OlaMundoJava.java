package primeiroprograma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava {
    private JButton cliqueEmMimButton;
    private JLabel Mensagem;
    private JPanel btnClick;

    public OlaMundoJava() {
        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensagem.setText("Olá Mundo!");
            }
        });
    }
}
