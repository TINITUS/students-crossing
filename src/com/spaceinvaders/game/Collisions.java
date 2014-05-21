package com.spaceinvaders.game;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Collisions checks class
 * @author Miro
 */
public class Collisions {
    // Get player current position and match it against the obstacles and target coordinates     
    /**
     * @param obst
     * @param pX
     * @param pY
     * @return 
     */
    public static boolean checkWithObstacle(char[][] obst, int pX, int pY){        
        int playerX = pX;
        int playerY = pY;
        return (obst[playerY][playerX] == '@');                
    }
    /**
     * 
     * @param tX integer target column
     * @param tY integer target row
     * @param pX integer player column
     * @param pY integer player row
     * @return 
     */
    public static boolean checkWithTarget(int tX, int tY, int pX, int pY){
        System.out.print((pX == tX) && (pX == tY));
        boolean checkWithTarget = false;
        if((pX == tX) && (pX == tY)){
            checkWithTarget = true;
        }
        return checkWithTarget;        
    }
    
}
