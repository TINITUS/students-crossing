package com.spaceinvaders.game;

import com.spaceinvaders.game.Matrix;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Toshiba
 */
public class Player {
    private static int x; 
    private static int y; 
    private final String tex;   
        
    /**
     *
     */
    public Player(){
        x = Matrix.randomWithRange(1, ConsoleGraphics.getCols()-1);
        y = Matrix.randomWithRange(1, ConsoleGraphics.getRows()-1);        
        this.tex = ConsoleGraphics.ESC+"32m"+"P"+ConsoleGraphics.ESC+"37m";      
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
        
    public void moveUp(){        
        if(y-1 >= 1){
            //if no collisions or win cond or 
            clearPlayer();
            this.y-=1;
            render();
        }else{
            failed();
        }        
    } 
    
    public void moveDown() {
        if(y+1 <= ConsoleGraphics.getRows()-1){
            clearPlayer();
            this.y+=1;    
            render();
        }else{
            failed();
        }
        
    } 
    
    public void moveLeft() {
        if(x-1 >= 1){
            clearPlayer();
            this.x--;
            render();
        } else {  
           failed();
        }        
    } 
    
    public void moveRight() {
        if(x+1 <= ConsoleGraphics.getCols()-1){
            clearPlayer();
            this.x++;
            render();
        } else {  
           failed();
        }
    }
        
    public void render(){        
        ConsoleGraphics.displayText(this.y, this.x, tex);
    }
    
    public int setX(int x){
        this.x = x;
        return x;
    }
    
    public int setY(int y){
        this.y = y;
        return y;
    }
    
    private void clearPlayer(){
        ConsoleGraphics.drawAtPosition(this.y, this.x, ' ');
    }
    
    private void failed(){
        ConsoleGraphics.displayText(29, 2, "Failed. Try again?(Y/N)");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("Y")){
            Main.gameStart();
        }else{
            try {
                Main.gameMain();
            } catch (InterruptedException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
