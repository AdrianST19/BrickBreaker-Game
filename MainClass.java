/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fanutaadrian.proiect;
import javax.swing.JFrame;
/**
 *
 * @author Adrian Stefan
 */
public class MainClass {
    public static void main(String[] args) {
        JFrame obiect1 = new JFrame();
        TheGame joc = new TheGame();
        obiect1.setBounds(10,10,700,600);
        obiect1.setTitle("Fanuta Adrian Stefan- Brick Breaker Game");
        obiect1.setResizable(false);
        obiect1.setVisible(true);
        obiect1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obiect1.add(joc);
    } 
}

