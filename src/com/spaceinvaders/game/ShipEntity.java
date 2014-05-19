/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spaceinvaders.game;

/**
 *
 * @author Toshiba
 */
public class ShipEntity {
    private int x; 
    private static final int y = 27; 
    private final String tex  = "-||-";
    private static boolean goLeft = true;
    private static boolean goRight = false;
        
    public ShipEntity(int x){
        this.x = x;                              
    }
    
    public int getX(){
        return x;
    }
        
    public void tick(){
        System.out.print(x);
        if( x >= 73 && !goRight){
            goLeft = false;
            goRight = true;
        }else if(x <= 1 && !goLeft){
            goRight = false;
            goLeft = true;
        }
        if(goLeft){
            x+=2;
        }else if(goRight){
            x-=2;
        }
    }
    
    public void render(){
        ConsoleGraphics.displayText(y, x, tex);
    }
    
    public int setX(int x){
        this.x = x;
        return x;
    }
        
}
