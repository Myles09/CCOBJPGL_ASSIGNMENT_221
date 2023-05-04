public class App {

    public static void main(String[] args) {

        Mars mars = new Mars();
        Saturn saturn = new Saturn();
        Venus venus = new Venus();
        Uranus uranus = new Uranus();
        Pluto pluto = new Pluto();
        Jupiter jupiter = new Jupiter();
        Neptune neptune = new Neptune();
        Mercury mercury = new Mercury();
        Earth earth = new Earth();
        

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        venus.accept(astronaut);
        uranus.accept(astronaut);
        pluto.accept(astronaut);
        jupiter.accept(astronaut);
        neptune.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
       
        
        mars.accept(rover);
        saturn.accept(rover);
        venus.accept(rover);
        uranus.accept(rover);
        pluto.accept(rover);
        jupiter.accept(rover);
        neptune.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        
    }
}