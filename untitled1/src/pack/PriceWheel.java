package pack;
import java.util.random.RandomGenerator;

public class PriceWheel {

    private int playNumber;
    private String price;
    private String userName;
    private int age;

    public String setUserName(String userName) {
        this.userName = userName;
        return userName;
    }

    public String getUserName() {
        return userName;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    public int getAge(){
        return age;
    }

    public void generatePlayNumber(){
        int number = (int) Math.floor(Math.random()*10);
        this.playNumber = number;
    }
    public int getPlayNumber(){
        return playNumber;
    }

}