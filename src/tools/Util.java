/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author u08853739100
 */
public class Util {

    //metodo static: serve para não deixar instanciar o objeto, pois chama direto
    //instanciar: criar, pra isso usa o mew
    public static void habilitar(boolean valor, JComponent ... comp) {//varargs: pode passar varios componentes
        for (int i = 0; i < comp.length; i++){//percorrer vetor
        comp[i].setEnabled(valor);
        }
    }
   
   public static void limpar(JComponent ... comp){
       for (int i = 0; i < comp.length; i++) {
         if (comp[i] instanceof JTextField) {
            ((JTextField) comp[i]).setText("");
        }
        else if (comp[i] instanceof JFormattedTextField) {
            ((JFormattedTextField) comp[i]).setText("");
        }
        else if (comp[i] instanceof JPasswordField) {
            ((JPasswordField) comp[i]).setText("");
        }
        else if (comp[i] instanceof JComboBox) {
            ((JComboBox) comp[i]).setSelectedIndex(-1);
        }
        else if (comp[i] instanceof JCheckBox) {
            ((JCheckBox) comp[i]).setSelected(false);
        }
        else {
            System.out.println("Não foi possível limpar o componente: " + comp[i]);
        }
   

           // instanceof
       }
   }
}

