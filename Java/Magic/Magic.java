public class Magic {
    public static void main(String[] args) {
       
        
        //This problem always come out to have the same solution.

        int myNumber = 90;

        int stepOne = myNumber * myNumber;

        int stepTwo = stepOne + myNumber;

        int stepThree = stepTwo / myNumber;

        int stepFour = stepThree + 17;

        int stepFive = stepFour - myNumber;

        int stepSix = stepFive / 6;

        System.out.println(stepSix);


    }
}