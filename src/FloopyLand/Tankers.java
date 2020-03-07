/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author levi.thompson
 */
public class Tankers extends MyBaseHero{
    
    public Tankers(String name, int hp, GameBoard gameboard, Point location) {
        super(gameboard,location);
    }
}
