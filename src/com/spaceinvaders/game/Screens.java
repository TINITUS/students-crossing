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
        System.out.println("#   *   *   *   *4. Win! or Loose! - never mind. Just have a pint!  *   *   *#");
        System.out.println("# *    *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *	*   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *	*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *#");
        System.out.println("# *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  #");
        System.out.println("#   *    *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  *#");
        System.out.println("##############################################################################");
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();       
    }

    public static void exitGame() {
            System.out.println("Exiting...");
            return;
    }
}