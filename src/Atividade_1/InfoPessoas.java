package Atividade_1;

import javax.swing.*;

public class InfoPessoas {
    public static void main(String[] args) {
        
        double infos [][] = new double [4][3];
        int Candidato = 1;
        String aux = " ";
        
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 1; j++) {
                    while (Candidato <= 4) {
                        aux = JOptionPane.showInputDialog(null, "Insira seu sexo \nHomem = 1 \nMulher = 2", "Candidato "+Candidato,JOptionPane.PLAIN_MESSAGE);
                        infos [i][j] = Double.parseDouble(aux);
                        while (infos[i][j] != 1 && infos[i][j] != 2) {
                            aux = JOptionPane.showInputDialog(null, "Deve-se inserir \n1 se homem ou \n2 se mulher", "Erro - Re-insira o sexo",JOptionPane.INFORMATION_MESSAGE);
                            infos [i][j] = Double.parseDouble(aux);
                        }
                        aux = JOptionPane.showInputDialog(null, "Insira sua altura em metros", "Candidato "+Candidato,JOptionPane.PLAIN_MESSAGE);
                        aux = aux.replace(',', '.');
                        infos [i][j] = Double.parseDouble(aux);
                        aux = JOptionPane.showInputDialog(null, "Insira sua idade", "Candidato "+Candidato, JOptionPane.PLAIN_MESSAGE);
                        aux = aux.replace(',', '.');
                        infos [i][j] = Double.parseDouble(aux);
                        Candidato++;
                        
                    }
                }
            }
        } catch (NumberFormatException ex) {
            
                JOptionPane.showMessageDialog(null, "É preciso inserir um valor numérico", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
