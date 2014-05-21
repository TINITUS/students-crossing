/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spaceinvaders.game;
import com.spaceinvaders.game.ConsoleGraphics;
import com.spaceinvaders.game.Matrix;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Toshiba
 */
public class Target {
    private static int x;
    private static int y;
    private static String tex;
    
    /**
     *  Constructor
     */
    public Target(){
        x = Matrix.randomWithRange(1, ConsoleGraphics.getCols()-2);
        y = Matrix.randomWithRange(1, ConsoleGraphics.getRows()-1);
            
        this.tex = ConsoleGraphics.ESC+"31m"+"0"+ConsoleGraphics.ESC+"37m";
    } 
    
    /**
     *
     * @param g - ConsoleGraphics object
     */
    public void render(ConsoleGraphics g){         
        g.displayText(this.y, this.x, tex);
    }  
    public static int getX(){
        return x;
    }
    
    public static int getY(){
        return y;
    }
}
