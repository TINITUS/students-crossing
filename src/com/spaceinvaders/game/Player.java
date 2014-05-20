package com.spaceinvaders.game;

/**
 *
 * @author Toshiba
 */
public class Player {
    private int x; 
    private static final int y = 27; 
    private final String tex  = "-||-";
    private static boolean goLeft = true;
    private static boolean goRight = false;
        
    // zakomentirah konstruktura za da ne mi dava error zasega
    // i ne sam siguren, dali nqma da ti trqbwa posle
//    public Player(int x){
//        this.x = x;                              
//    }
    
    public int getX(){
        return x;
    }
        
    public void moveUp() {
        
    } 
    
    public void moveDown() {
        
    } 
    
    public void moveLeft() {
        
    } 
    
    public void moveRight() {
        
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
