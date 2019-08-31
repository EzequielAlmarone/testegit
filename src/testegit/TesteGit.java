/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testegit;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ezequiel
 */
public class TesteGit extends JFrame {

    /**
     * @param args the command line arguments
     */
    private String nome;
    private String sobrenome;
    private String endereco;
    private String contato;
    private JPanel painel;

    public TesteGit() {
        super("Teste GitHub");

        JTextField tfNome = new JTextField();
        JTextField tfSobrenome = new JTextField();
        JTextField tfEndereco = new JTextField();
        JTextField tfContato = new JTextField();


        painel = new JPanel();
        painel.setLayout(new GridLayout(4, 1, 5, 10));
        nome = tfNome.getText();
        sobrenome = tfSobrenome.getText();
        endereco = tfEndereco.getText();
        contato = tfContato.getText();

                painel.add(tfNome);
                painel.add(tfSobrenome);
                painel.add(tfEndereco);
                painel.add(tfContato);
                         
            
        
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(painel);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new TesteGit().setVisible(true);
        System.out.println("ola Brasil");
        System.out.println("Teste");
        System.out.println("Teste2");

    }

}
