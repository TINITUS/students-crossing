package com.spaceinvaders.game;

/**
 *
 * @author Toshiba
 */
public class Player {
    private static int x = Matrix.randomWithRange(1, ConsoleGraphics.getCols()); 
    private static  int y = Matrix.randomWithRange(1, ConsoleGraphics.getRows()); 
    private final String tex;   
        
    /**
     *
     */
    public Player(){
        this.tex = "P";        
    }
    
    public int getX(){
        return x;
    }
        
    public void moveUp() {        
        if(this.y-1 >= 1){
            this.y-=1;
        }else{
            //fail!!
        }
        
    } 
    
    public void moveDown() {
        if(this.y+1 <= ConsoleGraphics.getRows()-2){
            this.y+=1;    
        }else{
            //fail!!!
        }
        
    } 
    
    public void moveLeft() {
        if(this.x-1 >= 1){
            this.x--;
        } else {  
            //fail!!!
        }
        this.x-=1;
    } 
    
    public void moveRight() {
        if(this.x+1 <= ConsoleGraphics.getCols()-2){
            this.x++;
        } else {  
            //fail!!!
        }
    }
        
    public void render(){        
        ConsoleGraphics.displayText(y, x, tex);
    }
    
    public int setX(int x){
        this.x = x;
        return x;
    }
    
    public int setY(int y){
        this.y = y;
        return y;
    }
        
}
