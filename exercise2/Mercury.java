public class Mercury implements Planet {
    public void accept(Explorer astronaut){
        astronaut.visit(this);
 }
}