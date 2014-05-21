/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spaceinvaders.game;

import com.spaceinvaders.game.ConsoleGraphics;
import java.util.Scanner;
/**
 *
 * @author Miro
 */
public class Screens {
    
    public static void printMenu(){
        ConsoleGraphics.clearCons();
        System.out.println("##############################################################################");
        System.out.println("#   *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *    *#");
        System.out.println("# *   *     _, ___,  ,  ,_   _,,  , ___,_,    *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *  (_,' | |  |  | \\,/_,|\\ |' | (_,  *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   * _)  |'\\__| _|_/'\\_ |'\\|  |  _)    *   *   *   *   *   *   *   *  #"); 
        System.out.println("#   *   *  '    '_,,_`' _,  _,`_, ___,,' ,  _,  *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   * /  |_) / \\,(_,(_,' |  |\\ | / _    *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *  '\\_'| \\'\\_/  _) _) _|_,|'\\|'\\_|` *   *   *   *   *   *   *   *#");            
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *  1. NEW GAME - help the dunken studen to get to the campus*   *  #");
        System.out.println("#   *   *   *2. ABOUT   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *  3. EXIT GAME *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *    *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  *#");
        System.out.println("##############################################################################");
    }
    
        public static void winScreen(){
        ConsoleGraphics.clearCons();
        System.out.println("##############################################################################");
        System.out.println("#   *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *    *#");
        System.out.println("# *   *  _  _  __  _  _    __  __   __   ___  ___    __  ____  _  *   *   *  #");
        System.out.println("#   *   ( \\/ )/  \\( )( )  (  \\/  ) (  ) (   \\(  _)  (  )(_  _)/ \\  *   *#");
        System.out.println("# *   *  \\  /( () ))()(    )    (  /__\\  ) ) )) _)   )(   )(  \\_/      *  #"); 
        System.out.println("#   *   (__/  \\__/ \\__/   (_/\\/\\_)(_)(_)(___/(___)  (__) (__) (_)   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");            
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   * Press 1 to continue and 0 to exit *   *   *   *   *   *#");
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *    *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  *#");
        System.out.println("##############################################################################");
    }
    public static void about() {
        ConsoleGraphics.clearCons();
        System.out.println("##############################################################################");
        System.out.println("#   *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *    *#");
        System.out.println("# *   *     _, ___,  ,  ,_   _,,  , ___,_,    *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *  (_,' | |  |  | \\,/_,|\\ |' | (_,  *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   * _)  |'\\__| _|_/'\\_ |'\\|  |  _)    *   *   *   *   *   *   *   *  #"); 
        System.out.println("#   *   *  '    '_,,_`' _,  _,`_, ___,,' ,  _,  *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   * /  |_) / \\,(_,(_,' |  |\\ | / _    *   *   *   *   *   *   *  #");
        System.out.println("#   *	*   *  '\\_'| \\'\\_/  _) _) _|_,|'\\|'\\_|` *   *   *   *   *   *   *   *#");            
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   HOW TO PLAY:   	*   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *  1. Find the goal \' [ ] \' Avoid bstacles \'@\'  *   *   *   *  #");
        System.out.println("#   *   *   *    2. Write a Sequense of moves to get the student there  *   *#");
        System.out.println("# *   *   *   *  3. Press Enter to execute *  *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *4. Win! or Lose! - never mind. Just have a pint!   *   *   *#");
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *	*   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *	*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   Input 1 to go back or 0 to Exit *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *    *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  *#");
        System.out.println("##############################################################################");        
    }

    public static void exitGame() {
            System.out.println("Exiting...");            
    }
}
