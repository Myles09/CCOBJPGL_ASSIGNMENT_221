public class Pluto implements Planet {
    public void accept(Explorer astronaut){
        astronaut.visit(this);
 }
}
    