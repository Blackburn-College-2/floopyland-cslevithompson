/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.*;
import java.awt.Point;

/**
 *
 * @author levi.thompson
 */
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        GameBoard myGB = new GameBoard(10,10);
        Point p = new Point(0,0);
        Tankers t = new Tankers("tanker", 100, myGB, p);
        
        Floopy floop = new Floopy(new Controller());
        floop.gameController.getGameBoard().getGameSquare(p).addHero(t);
    }
    
}
