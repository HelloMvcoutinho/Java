/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import sistema.telas.CargosConsultar;


/**
 *
 * @author marcioc
 */
public class Sistema {

    public static JPanel tela;
    public static JFrame frame;
    
    public static void main(String[] args) {
        criarComponentes();
    }
    private static void criarComponentes(){
        frame = new JFrame("Sistema");
        frame.setSize(750,580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        /*tela = new CargosConsultar();
        tela.setVisible(true);
        //tela.setVisible(false);
        frame.add(tela);
        
        frame.setVisible(true);
        //frame.setVisible(false);
        */
        Navegador.login();
        //teste
    }
    
}
