/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spaceinvaders.game;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class Main {
    
    private static ConsoleGraphics g = new ConsoleGraphics();
    private static boolean runing = true;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {      
        gameMain();
    }

    protected static void gameStart() {
        g.setCols(20);
        g.setRows(20);
        g.clearCons();        
        g.drawFrame();
        
        
        
        //init entities - player, obstacles, target
        Player p = new Player();
        Matrix obst = new Matrix();
        Target goal = new Target();
        //render initially        
        obst.render(g);
        goal.render(g);
        p.render();

        g.displayText(26, 2, "Input move sequence(j - left; i - up; k - right; m - down): ");
        g.moveTo(27,2);
        String moveSequence;
        Scanner scanIn = new Scanner(System.in);            
        moveSequence = scanIn.nextLine();
        
        for (int i = 0; i <= moveSequence.length(); i++) {            
            if(i == moveSequence.length()){
                Player.failed();
            }
            char c = moveSequence.charAt(i);     
            if (c != 'j' && c != 'k' && c != 'i' && c != 'm') {
                break;              
            }
            switch (c) {
                case 'j' : p.moveLeft(); break;
                case 'k' : p.moveRight(); break;
                case 'i' : p.moveUp(); break;
                case 'm' : p.moveDown(); break;                
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            gameMain();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    protected static void gameMain() throws InterruptedException{
        Screens.printMenu();        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();              
        switch (choice) {
            case 1:
               gameStart();
               break;
            case 3:
                Screens.exitGame();
                ConsoleGraphics.clearCons();
                System.exit(0);
                break;
            case 2:
                gameAbout();
                break;
            default:
                System.out.println("Invalid choice");
                Screens.printMenu();
                break;
        }
    }
    
    private static void gameAbout() throws InterruptedException {
        Screens.about();
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        switch(choise){
            case 1:
                gameMain();
                break;
            default:
                Screens.exitGame();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                ConsoleGraphics.clearCons();
                System.exit(0);
                break;
        }
                
    }
    
            
}
