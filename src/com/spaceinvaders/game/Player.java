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
        
        boolean checkWithObstacle = Collisions.checkWithObstacle(Matrix.obstacles, x, y-1 );
        if((y-1 >= 1) && !checkWithObstacle){            
            clearPlayer();
            this.y-=1;
            
            boolean checkWithTarget = Collisions.checkWithTarget(Target.getX(),Target.getY(), x, y-1);                
            if(checkWithTarget){
                win();
            }
            render();
        }else{
            failed();
        }        
    } 
    
    public void moveDown() {
        
        boolean checkWithObstacle = Collisions.checkWithObstacle(Matrix.obstacles, x, y+1 );
        if((y+1 <= ConsoleGraphics.getRows()-1)&& !checkWithObstacle){
            clearPlayer();
            this.y+=1;    
            
            boolean checkWithTarget = Collisions.checkWithTarget(Target.getX(),Target.getY(), x, y+1);        
            if(checkWithTarget){
                win();
            }
            render();
        }else{
            failed();
        }        
    } 
    
    public void moveLeft() {
        
        boolean checkWithObstacle = Collisions.checkWithObstacle(Matrix.obstacles, x-1, y );
        if(x-1 >= 1 && !checkWithObstacle){            
            clearPlayer();            
            this.x--;
            
            boolean checkWithTarget = Collisions.checkWithTarget(Target.getX(),Target.getY(), x-1, y );        
            if(checkWithTarget){
                win();
            }
            render();
        } else {  
           failed();
        }        
    } 
    
    public void moveRight() {        
        boolean checkWithObstacle = Collisions.checkWithObstacle(Matrix.obstacles, x+1, y );
        if((x+1 <= ConsoleGraphics.getCols()-1) && !checkWithObstacle){
            clearPlayer();
            this.x++;
            
            boolean checkWithTarget = Collisions.checkWithTarget(Target.getX(),Target.getY(), x+1, y );
            if(checkWithTarget){
                win();
            }
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
    
    private void win(){
        ConsoleGraphics.clearCons();
        Screens.winScreen();
    }
    
    protected static void failed(){
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
