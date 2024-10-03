public class main {
    public static void main(String[] args) {
    
        spider spider = new spider();
        spider.eat();

    
        dog dapa = new dog();
        dapa.setName("dapa");
        System.out.println("Name dog: " + dapa.getName());
        dapa.play();
        dapa.eat();
        dapa.walk();

        // Buat objek garfill dan set namanya
        cat garfil = new cat("garfil");
        System.out.println("Name cat: " + garfil.getName());
        garfil.play();
        garfil.eat();
        garfil.walk();
    }
}