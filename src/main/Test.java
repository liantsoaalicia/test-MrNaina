package classes;

import annotation.HandleURL;

public class Test {
    
    @HandleURL("/hello")
    public void hello() {}

    @HandleURL("/bye")
    public void bye() {}
}
