public class Jupiter implements Planet {
    public void accept(Explorer astronaut){
        astronaut.visit(this);
 }
}