public class cat extends animal implements pet {
    private String name;

    public cat(String name) {
        super(4);
        this.name = name;
    }

    public cat() {
        super(4);
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
        System.out.println("Bermain bola kecil");
    }

    @Override
    public void eat() {
        System.out.println("Makan ikan");
    }

    @Override
    public void walk() {
        System.out.println("Jalan bersama tuannya");
    }
}