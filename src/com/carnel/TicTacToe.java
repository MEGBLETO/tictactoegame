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


    TicTacToe(){

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
