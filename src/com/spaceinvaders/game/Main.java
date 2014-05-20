/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spaceinvaders.game;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Main {

    private static Player p = new Player(37);
    private static ConsoleGraphics g = new ConsoleGraphics();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Play A Game?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            gameStart();
        } else {
            System.exit(0);
        }

    }

    private static void gameStart() {
        boolean runing = true;
        int cycles = 1000;
        int currentCycle = 0;
        int fps = 0, lastFpsTime = 0;
        long lastLoopTime = System.currentTimeMillis();
        final int TARGET_FPS = 5;
        final long OPTIMAL_TIME = 1000 / TARGET_FPS;
        //char input;
        while (runing) {
            System.out.println("Input move sequence : ");
            System.out.println("(j - left; i - up; k - right; m - down)");
            String moveSequence;
            Scanner scanIn = new Scanner(System.in);
            Player player = new Player(); // @TODO - class to be created
            moveSequence = scanIn.nextLine();
            for (int i = 0; i < moveSequence.length(); i++) {
                char c = moveSequence.charAt(i);     
                if (c != 'j' && c != 'k' && c != 'i' && c != 'm') {
                    break;
                }
                
                switch (c) {
                    case 'j' : player.moveLeft(); break;
                    case 'k' : player.moveRight(); break;
                    case 'i' : player.moveUp(); break;
                    case 'm' : player.moveDown(); break;
                }
            }
            
            long now = System.currentTimeMillis();
            long updateLength = now - lastLoopTime;
            lastLoopTime = now;
            double delta = (updateLength / ((double) OPTIMAL_TIME)) * 1000;
            //User Input 
//            Scanner c = new Scanner(System.in);
//            if(c.hasNext()){
//                input = c.next().charAt(0);
//                //System.out.print(input);
//            }                       

            // update the frame counter
            lastFpsTime += updateLength;
            fps++;
            // update our FPS counter if a second has passed since
            // we last recorded
            if (lastFpsTime >= OPTIMAL_TIME) {
                tick();
                render(delta, fps);
                System.out.println(ConsoleGraphics.ESC + "32m (FPS: " + fps + ")" + ConsoleGraphics.ESC + "37m");
                lastFpsTime = 0;
                fps = 0;
            }
        }
    }

    private static void render(double delta, int fps) {
        //UI render
        g.clearCons();
        g.setCols(78);
        g.setRows(28);
        g.drawFrame();
        //player render
        p.render();
    }

    private static void tick() {
        p.tick();
    }
}
