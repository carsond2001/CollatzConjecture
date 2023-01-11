public class CollazConjeture {
    public static int collaz(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            steps++;
        }
        return steps;
    }


    //main method
    public static void main(String[] args) {
        int n = 0;
        int maxSteps = 0;
        int maxStepsNumber = 0;
        for (int i = 1; i <= 100000; i++) {
            int steps = collaz(i);
            if (steps > maxSteps) {
                maxSteps = steps;
                maxStepsNumber = i;
            }
        }
        System.out.println("The number with the most steps is " + maxStepsNumber + " with " + maxSteps + " steps.");
            //test number  77,031
             int ne = 77032;
             int steps = collaz(ne);
             System.out.println("Number of steps: " + steps);
    }
}
