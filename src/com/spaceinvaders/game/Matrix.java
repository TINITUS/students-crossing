package com.spaceinvaders.game;

import com.spaceinvaders.game.ConsoleGraphics;
/**
 *
 * @author Toshiba
 * Creates Obstacles Matrix and provides render metho for it
 */
public class Matrix {
    
    static char[][] obstacles = new char[24][78];    
    /*
    * Constructor for Matrix class
    */
    public Matrix(){
        for(int o = 0; o <= 100; o++){
            int randomRow = randomWithRange(1, 24);
            int randomCol = randomWithRange(1, 78);
            for(int j = 0; j < obstacles.length;j++){
                if(j == randomRow){
                    for(int i = 0; i < obstacles[j].length; i++){
                        if(i== randomCol){
                            obstacles[j][i] = '@';
                        }
                    }
                }            
            }
        }
    }
    
    /*
    *renders the obstacle matrix in viewport;
    */    
    public void render(ConsoleGraphics g){
        for(int i = 0; i < obstacles.length; i++){
            for (int j=0; j < obstacles[i].length; j++) {
                char c = obstacles[i][j];
                if(c == '@'){
                    g.drawAtPosition(i, j, c);
                }
            }            
        }
    }
    
    /*
    * Public method for random Range generator
    */
    public static int randomWithRange(int min, int max){
        int range = Math.abs(max - min) + 1;     
        return (int)(Math.random() * range) + (min <= max ? min : max);
    }
}
