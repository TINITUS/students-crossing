/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spaceinvaders.game;
import com.spaceinvaders.game.ConsoleGraphics;
/**
 *
 * @author Toshiba
 */
public class Target {
    private int x;
    private int y;
    private final String tex;
    
    /**
     *  Constructor
     * @param g - ConsoleGraphics object
     */
    public Target(ConsoleGraphics g){
        this.tex = "[ ]";
        this.x = Matrix.randomWithRange(1, g.getCols()-1);
        this.y = Matrix.randomWithRange(1, g.getRows()-1);
    } 
    
    /**
     *
     * @param g - ConsoleGraphics object
     */
    public void render(ConsoleGraphics g){
        g.displayText(this.y, this.x, tex);
    }  
}
