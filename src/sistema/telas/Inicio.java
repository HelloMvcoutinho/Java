/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.telas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import sistema.Navegador;

/**
 *
 * @author marcioc
 */
public class Inicio extends JPanel{
    JLabel labelTitulo;
    
    public Inicio(){
        criarComponentes();
        criarEventos();
        Navegador.habilitaMenu();
    }
    
    public void criarComponentes(){
        setLayout(null);
        
        labelTitulo = new JLabel("Escolha uma opção no menu superior",JLabel.CENTER);
        labelTitulo.setBounds(20,100,660,40);
        add(labelTitulo);
        setVisible(true);
    }
    
    private void criarEventos(){
        
    }
}
