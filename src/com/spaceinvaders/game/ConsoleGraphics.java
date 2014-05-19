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
class ConsoleGraphics {
    public final static String ESC = "\033[";
    public final static String BUILDING_BLOCK = "█";
    private static int cols = 0;
    private static int rows = 0;

//    public ConsoleGraphics(int initCols, int initRows){
//        cols = initCols;
//        rows = initRows;
//        drawFrame();   
//        restoreCursor();
//    }
    public static void drawFrame(){
        char hLine = '\u2500';
        char vLine = '\u2502';
        char topLeftCorner = '\u250C';
        char topRightCorner = '\u2510';
        char botLeftCorner = '\u2514';
        char botRightCorner = '\u2518';
        
        for(int i = 0; i <= rows;i++){
            for(int j=0; j<= cols; j++){
                if(i == 0 || i == rows){
                    if(i == 0){
                        if(j == 0)                        
                            System.out.print(topLeftCorner);
                        else if (j == cols)
                            System.out.print(topRightCorner+"\n");
                        else
                            System.out.print(hLine);                                                    
                    }
                    else if(i == rows){
                        if(j == 0)                        
                            System.out.print(botLeftCorner);
                        else if (j == cols)
                            System.out.print(botRightCorner+"\n");
                        else
                            System.out.print(hLine);
                    }                    
                    else{
                        System.out.print(hLine);
                    }
                }else if(j == 0 || j== cols){
                    if(j == cols)
                        System.out.printf("%s%n",vLine);
                    else
                        System.out.printf("%s",vLine);
                }else{
                    System.out.print(" ");
                }                
            }
        }
        restoreCursor();
    }    
    
    public static void setCols(int newCols){
        cols = newCols;
    }
    
    public static void setRows(int newRows){
        rows = newRows;
    }
    
    public static int getCols(){
        return cols;
    }
    
    public static int getRows(){
        return rows;
    }
    
    public static void darwRectangle(int row, int col, int width, int height){
        if(row < 0) row = 0;
        if(col < 0) col = 0;
        if(height < 1) height = 0;
        if(width < 1) width = 0;
        for( int i = row; i < (row + height); i++){
            for(int j = col; j < (col + width); j++){
                drawAtPosition(i, j, BUILDING_BLOCK.charAt(0));
            }
        }
    }
    
    public static void drawLine(int startRow, int startCol, int endRow, int endCol){
        if(startRow < 0) startRow = 0;
        if(startCol < 0) startCol = 0;
        if(endRow < 0) endRow = 1;
        if(endCol < 0) endCol = 1;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                drawAtPosition(i, j, BUILDING_BLOCK.charAt(0));
            }
        }
    }
    
    public static void drawAtPosition(int row, int col, char whatToDraw) {                
        moveTo(row, col);
        System.out.print(whatToDraw);
        restoreCursor();
    }
    
    public static void displayText(int row, int col, String text){
        moveTo(row, col);
        System.out.print(text);
        restoreCursor();
    }

    public static void clearCons(){
        System.out.print(ESC + "2J");
    }

    private static void restoreCursor() {
        System.out.print(ESC + "H");        
    }
    
    private static void moveTo(int row, int col){
        for(int i =0; i < row; i++){
            System.out.print(ESC+"B");
        }
        for(int j = 0; j < col;j++){
            System.out.print(ESC + "C");
        }
    }
}
