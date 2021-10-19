/*import java.util.*;
public class DotComBust {
    private GameHelper helper = new GameHelper;
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGueses = 0;

    private void setUpGame(){
        //first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new Dotcom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationsCells(newLocation);
        }//close for loop
    }//Close setUpGame Method

    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            CheckUserGuess(userGuess);
        }//close while
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGueses++
        String result = "miss";

        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) break;
            if(result.equals("kill")){
                dotComsList.remove(dotComToTest);
                break;
            }    
        }
        System.out.println(result);
        //close method
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if(numOfGueses <=18){
            System.out.println("It only took you "+ numOfGueses+" guesses");
            System.out.println("You got ouf before your options sank");

        }
        else{
            System.out.println("Took you long enough "+numOfGueses+" guesses");
            System.out.println("Fish are dancing with your options.");

        }
    }//close method



}
*/
