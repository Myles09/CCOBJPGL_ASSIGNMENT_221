
public interface Explorer  {

    void visit(Venus venus);

    void visit(Mars mars);

    void visit(Uranus uranus);

    void visit(Pluto pluto);

    void visit(Jupiter jupiter);

    void visit(Neptune neptune);

    void visit(Mercury mercury);

    void visit(Saturn saturn);

    void visit(Earth earth);


    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}