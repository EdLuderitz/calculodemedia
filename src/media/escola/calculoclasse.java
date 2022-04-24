package media.escola;

import javax.swing.*;

public class calculoclasse {

    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Qual a nota do primeiro bimestre?");
        String nota2 = JOptionPane.showInputDialog("Qual a nota do segundo bimestre?");
        String nota3 = JOptionPane.showInputDialog("Qual a nota do terceiro bimestre?");

        double notabimestre1 = Double.parseDouble(nota1);
        double notabimestre2 = Double.parseDouble(nota2);
        double notabimestre3 = Double.parseDouble(nota3);

        int resposta = 0;
        /* Força o usuário a clicar para calcular a media */
        do {
            resposta = JOptionPane.showConfirmDialog(null, "Você gostaria de calcular a média?");
            if (resposta == 1 || resposta == 2){
                JOptionPane.showMessageDialog(null, "Clica em 'Yes' por favor!");
            }
            if (resposta == 0) {
                double media = (notabimestre1 + notabimestre2 + notabimestre3) / 3;
                JOptionPane.showMessageDialog(null, "A média das notas foi: " + media);
            }
        } while (resposta != 0);
    }
}
