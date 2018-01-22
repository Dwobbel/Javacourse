package exercises.chapter10;

abstract public class Animal {
    private String name;


    public Animal(){
        this("default");
    }

    public Animal(String name){
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public int move();
    abstract public boolean makeNoise();


}
