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
    private final int x;
    private final int y;
    private final String tex;
    
    /**
     *  Constructor
     * @param g - ConsoleGraphics object
     */
    public Target(){
        x = Matrix.randomWithRange(1, ConsoleGraphics.getCols());
        y = Matrix.randomWithRange(1, ConsoleGraphics.getRows());
        this.tex = "[ ]";
    } 
    
    /**
     *
     * @param g - ConsoleGraphics object
     */
    public void render(ConsoleGraphics g){         
        g.displayText(this.y, this.x, tex);
    }  
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
