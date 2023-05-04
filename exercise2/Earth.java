public class Earth implements Planet {
    public void accept(Explorer astronaut){
        astronaut.visit(this);
 }
}