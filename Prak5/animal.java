abstract class animal {
    protected int legs;

    public animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Sedang berjalan");
    }

    public abstract void eat();
}