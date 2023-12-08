// Superclass
class HillStations {
    public void location() {
        System.out.println("Location: Various hill stations");
    }

    public void famousFor() {
        System.out.println("Famous for scenic beauty and tourism");
    }
}

// Subclass 1
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh, India");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for snow-capped mountains and adventure sports");
    }
}

// Subclass 2
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand, India");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for its picturesque landscapes and British-era architecture");
    }
}

// Subclass 3
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Gulmarg, Jammu and Kashmir, India");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for skiing and the Gulmarg Gondola");
    }
}

public class Stations {
public static void main(String[] args){
    
        HillStations hillStation1 = new Manali();
        HillStations hillStation2 = new Mussoorie();
        HillStations hillStation3 = new Gulmarg();

        
        hillStation1.location(); 
        hillStation1.famousFor(); 

        
        ((Manali) hillStation1).location(); 
        ((Manali) hillStation1).famousFor(); 

        ((Mussoorie) hillStation2).location(); 
        ((Mussoorie) hillStation2).famousFor(); 

        ((Gulmarg) hillStation3).location(); 
        ((Gulmarg) hillStation3).famousFor(); 
    }
}
