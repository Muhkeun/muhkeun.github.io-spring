package DiEx08;


import java.util.ArrayList;

public class Player {
    private String name;
    private int age;
    private ArrayList<String> position;
    private double height;
    private double weight;
    
    //기본 생성자
    public Player(){
        System.out.println("Player 생성");
    }
    //인자 생성자
    public Player(String name, int age, ArrayList<String> position){

        this.name = name;
        this.age = age;
        this.position = position;
    }
    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getPosition() {
        return position;
    }

    public void setPosition(ArrayList<String> position) {
        this.position = position;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
