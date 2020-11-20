public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(miles);

        SpeedConverter.printConversion((10.5));
//        loop();
    }

//    infinite loop example
    public static void loop() {
        for (int number = 100; number > 0; number +=10) {
            System.out.println("number " + number);
        }
    }
}
