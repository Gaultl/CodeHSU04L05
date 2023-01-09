public class LoopCount {
    public static void main(String[] args) {
        //write a loop that runs 12 times
        //int count = 0;
        int i;
        for (i = 0; i < 12; i++) {
            //count++;
            //System.out.println("Count: " + count);
        }
        System.out.println("The loop ran " + i + " times");

        //Write a nested loop that runs 20 times
        int count = 0;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 5; k++) {
                count++;
            }
        }
        System.out.println("The loop ran " + count + " times");

        //Write a while loop that runs 8 times
        int l = 0;
        while (l < 8){
            l++;
        }
        System.out.println("The loop ran " + l + " times");
    }
}