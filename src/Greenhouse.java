import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.Random;

public class Greenhouse {

String name;
boolean sprinklersOn;
int numberOfFlowers;

//constructor
public static void main() {} Greenhouse(){
    name = "Planting Parameters at the CSG";
    sprinklersOn = true;
    numberOfFlowers = 71;
    System.out.println("Welcome to" + name + "It is" + sprinklersOn + "that we are watering plants right now. We have" + numberOfFlowers + "flowers");

    randomReplant();
    veggieOfTheDay();
    countFlowers();
    changeTemperature();
}
//Step 4
public void randomReplant(){
   int randomInt;
randomInt = 5;

    System.out.println("We are replanting"+ randomInt +"vegetables today!");

}

//Step 5
public void veggieOfTheDay() {

    System.out.println("Today's chosen veggie is Kale");

}
//step 6
    public void countFlowers(){
    int i;
    for(i=2;i<=6;i++){
        System.out.println(i);
    }
    for(i=20;i<=110;i+=30) {
        System.out.println(i);
    }
    for (i=8;i>=0;i--) {
        System.out.println(i);
    }
}

    public void changeTemperature(){
        double randomNum = (int)
        Math.random();
        if(randomNum < 0.25){
            System.out.println("The temperature has decreased by 2 degrees");
        }
        else if (randomNum < 0.5) {
            System.out.println("The temperature has decreased by 1 degree");
        }
        else if (randomNum< 0.75) {
            System.out.println("The temperature has increased by 1 degree");
        }
        else if(randomNum < 1){
                System.out.println("The temperature has increased by 2 degrees");

        }

        }



    public static void main(String[] args) {
       Greenhouse greenhouse = new Greenhouse();
        System.out.println("Hello World! Goodluck on your exams");
    }
}

