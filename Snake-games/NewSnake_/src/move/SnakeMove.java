    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package move;

/**
 *
 * @author adesuk
 */
public class SnakeMove {
    private Move rightMove;
    private Move leftMove;
    private Move upMove;
    private Move downMove;

    public SnakeMove() {
        rightMove = new RightMove();
        leftMove = new LeftMove();
        upMove = new UpMove();
        downMove = new DownMove();
    }
    
    public void movingRight() {
        rightMove.execute();
    }
    
    public void movingLeft() {
        leftMove.execute();
    }
    
    public void movingUp() {
        upMove.execute();
    }
    
    public void movingDown() {
        downMove.execute();
    }
}
