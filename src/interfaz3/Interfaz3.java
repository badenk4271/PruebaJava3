/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz3;
import javax.swing.*;
import java.awt.*;
import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;
/***************************************************************************
 *Alejandro yavara Vargas
 * 
 * Fecha: Noviembre 3 de 2017
 * Programa:PruebaJaba3
 * Responsabilidad: Clase ventana
 * @author LAB01
 * 
 ******************************************************************************/
public class Interfaz3 extends JFrame
{
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton;
 JButton boton2;
 
 
 ConexionBD con;
 public Interfaz3() 
 {
 panel= new JPanel();
     label = new JLabel();
     text = new JTextField(20);
     boton = new JButton();
     boton2 = new JButton();
     this.add(panel);
     panel.add(label);
     panel.add(text);
     panel.add(boton);
     panel.add(boton2);
     
     label.setText("Atributo");
     boton.setText("Conectar");
     boton2.setText("Desconectar");
     panel.setBackground(Color.orange);
     
     
     boton.addActionListener(new ActionListener()
     
 {
     public void actionPerformed(ActionEvent evt)
     {
         con = new ConexionBD();
         Connection reg = con.conectar();
     }
 });
 
 boton2.addActionListener(new ActionListener()
 
 {
     public void actionPerformed(ActionEvent evt)
     {
         con.desconectar();
         
     }
 });
     
             
             
             
             
             
 
             }
 


}