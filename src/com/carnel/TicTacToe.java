package com.carnel;

import java.awt.*;
import java.awt.event.*;
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
    JPanel button_panel = new JPanel();

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
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        //ttile panel
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);

        //adding my button to the panel with a for loop

        for(int i =0; i < buttons.length; i++){
            buttons[i]= new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

            firstTurn();
        }



        //button panel
        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150, 150, 150));

        frame.add(button_panel);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("X turn");
                        check();
                    }

                }
            }
        }
    }


    public void firstTurn(){
//ic je display le titre tic tac toe pendant quelque milliseconde avant le choix
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //chosie un nombre entier entre 1 et 2 pour dire joueur 1 et 2
   if(random.nextInt(2) == 0){
       player1_turn = true;
       textfield.setText("X turn");
   }
   else{
       player1_turn = false;
       textfield.setText("O turn");
   }
    }

    public void check(){

    }

    public void xwins(int a , int b, int c){

    }

    public void owins(int a , int b, int c){

    }


}
