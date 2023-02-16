import java.util.ArrayList;

public class Search {
    ArrayList<Integer> numbers;
    public void Search(){
        this.numbers = new ArrayList<Integer>();
    }



    public boolean linearSearch(ArrayList<Integer> myNumbers, int i) {
        for (int number : myNumbers)
            if (number == i){
                return true;
            }
        return false;
    }

    public boolean binarySearch(ArrayList<Integer> myNumbersToTest, int findThisNumber) {
        if (myNumbersToTest.size() == 0){
            return false;
        }

        int midIndex = 0;
        if (myNumbersToTest.size() >1) {
            midIndex = (int) Math.ceil((double) myNumbersToTest.size() / 2);
        }

        int midPoint = myNumbersToTest.get(midIndex);

        if (findThisNumber == midPoint){
            return true;
        }

        ArrayList<Integer> newSearchArea;

        if (findThisNumber < midPoint){
            newSearchArea = new ArrayList<Integer>(myNumbersToTest.subList(0, midIndex));
        } else {
            newSearchArea = new ArrayList<Integer>(myNumbersToTest.subList(midIndex + 1, myNumbersToTest.size()));
        }
        return binarySearch(newSearchArea, findThisNumber);
    }
}
