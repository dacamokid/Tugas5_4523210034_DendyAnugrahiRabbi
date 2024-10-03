public class dog extends animal implements pet {
    private String name;

    public dog() {
        super(4); // Dog has 4 legs
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Bermain tangkap stik kayu");
    }

    @Override
    public void eat() {
        System.out.println("Makan daging");
    }

    @Override
    public void walk() {
        System.out.println("Jalan bersama tuannya");
    }
}