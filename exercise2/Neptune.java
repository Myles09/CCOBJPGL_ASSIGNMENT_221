public class Neptune implements Planet {
    public void accept(Explorer astronaut){
        astronaut.visit(this);
 }
}