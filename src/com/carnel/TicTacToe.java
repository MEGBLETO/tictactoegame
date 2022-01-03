package com.carnel;

import java.awt.*;
import java.awt.event.*;
import java.time.chrono.JapaneseChronology;
import java.util.*;
import javax.swing.*;



public class TicTacToe implements ActionListener {

    //Pour pouvoir determiner de facon arbitraire qui jouen premier entre x et o;
    Random random = new Random();

    //Ce Jframe est un peut comme la div en javas qui contiendra tout les composantes du jeux
    JFrame frame = new JFrame();


    //un peux comme un span ou une div qui est incrustrer dans la div parent qui est frame
    JPanel title_panel = new JPanel();

    //ce jpanel contiendra tout les bouttons contenue dans mon application
    JPanel button = new JPanel();

    //you know what is up
    JLabel textfield = new JLabel();

    //definire une array de taille 9 pour les bouttons dont j'aurai besoin  dans mon application

  JButton [] buttons = new JButton[9];

  //varai si cest le tour du player 1 faux sinon
  boolean player1_turn;

    TicTacToe(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25, 25,25));
        textfield.setForeground(new Color(25, 255, 0));
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public void firstTurn(){

    }

    public void check(){

    }

    public void xwins(int a , int b, int c){

    }

    public void owins(int a , int b, int c){

    }


}
