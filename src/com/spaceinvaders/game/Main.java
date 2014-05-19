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

    private static ShipEntity p = new ShipEntity(37);
    private static ConsoleGraphics g = new ConsoleGraphics();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Play A Game?");
        Scanner input = new Scanner(System.in);
        String answer =  input.nextLine();
        if(answer.equalsIgnoreCase("Y")){
            gameStart();
        }else{
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
        while(runing){          
            
            long now = System.currentTimeMillis();
            long updateLength = now - lastLoopTime;
            lastLoopTime = now;
            double delta = (updateLength / ((double)OPTIMAL_TIME))*1000;
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
            if (lastFpsTime >= OPTIMAL_TIME)
            {               
               tick();
               render(delta, fps);
               System.out.println(ConsoleGraphics.ESC + "32m (FPS: "+fps+")" + ConsoleGraphics.ESC + "37m");
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
