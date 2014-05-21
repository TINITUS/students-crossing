package com.spaceinvaders.game;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
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
    
}
