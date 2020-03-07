/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.*;
import java.util.ArrayList;

/**
 *
 * @author levi.thompson
 */
public class Controller extends GameController{

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard gb, int i) {
        return new ArrayList();
    }

    @Override
    public GameBoard mkGameBoard() {
        return new GameBoard(10,10);
    }
    
}
