/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package body;

import java.util.List;

/**
 *
 * @author adesuk
 */
public class SnakeBody {
    private List<Body> bodies;
    
    public void addBody(Body body) {
        bodies.add(body);
    }
    
    public void subBody() {
        bodies.remove(bodies.size()-1);
    }
}
