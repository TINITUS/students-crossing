/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spaceinvaders.game;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Main {
    
    private static ConsoleGraphics g = new ConsoleGraphics();

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {      
        gameMain();
    }

    private static void gameStart() {
        boolean runing = true;
        int fps = 0;
        int lastFpsTime = 0;
        long lastLoopTime = System.currentTimeMillis();
        final int TARGET_FPS = 1;
        final long OPTIMAL_TIME = 1000 / TARGET_FPS;
        
        //init entities - player, obstacles, target
        Player p = new Player();
        Matrix obst = new Matrix();
        Target goal = new Target();
        
        
        //char input;
        while (runing) {
            long now = System.currentTimeMillis();
            long updateLength = now - lastLoopTime;
            lastLoopTime = now;
            lastFpsTime += updateLength;
            fps++;
            // update our FPS counter if a second has passed since
            // we last recorded
            if (lastFpsTime >= OPTIMAL_TIME) {                
                render(obst, p, goal);                
                lastFpsTime = 0;
                fps = 0;
            }
        }
    }
    
    private static void gameMain(){
        Screens.printMenu();        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();              
        switch (choice) {
            case 1:
               gameStart();
               break;
            case 3:
                Screens.exitGame();
                //System.exit(0);
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
    
    private static void gameAbout() {
        Screens.about();
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        switch(choise){
            case 1:
                gameMain();
                break;
            default:
                Screens.exitGame();
                //System.exit(0);
                break;
        }
                
    }
    
    private static void render(Matrix obst, Player p, Target goal) {
        //UI render        
        g.clearCons();
        g.setCols(78);
        g.setRows(24);
        g.drawFrame();
        
        
        //entity renders
        goal.render(g);
        obst.render(g);
        p.render();
        
        g.displayText(26, 2, "Input move sequence(j - left; i - up; k - right; m - down): ");
        g.moveTo(27,2);
        String moveSequence;
        Scanner scanIn = new Scanner(System.in);            
        moveSequence = scanIn.nextLine();
        for (int i = 0; i < moveSequence.length(); i++) {
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
        }
    }        
}
