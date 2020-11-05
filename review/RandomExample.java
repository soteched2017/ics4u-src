/* 
 * pseudorandom numbers
 * 
 * grade 11 cs review 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201105
 * date         20201105
 * @filename	RandomExample.java
 * @author      vmso
 * @version     1.0
 * @see         units 1 through 4 content
 */

class RandomExample {

    public static void main (String[] args) {

        int min = -10;
        int max = 10;

        double d = Math.random() * (max - min + 1) + min;
        int i = (int) Math.random() * (max - min + 1) + min;

        System.out.println("d = " + d);
        System.out.println("i = " + i);

        long seed = 0; // same seed generates the same pseudorandom numbers
        java.util.Random generator = new java.util.Random(seed);
        double num = generator.nextDouble() * (max - min + 1) + min;
        System.out.println("num = " + num);

        for (int x=0; x<10; ++x)
        {
            seed = 0;
            generator = new java.util.Random(seed);
            num = generator.nextDouble() * (max - min + 1) + min;
            System.out.println("num = " + num);
        }

        // https://stackoverflow.com/questions/3535574/getting-current-date-time-for-a-random-number-generators-seed
        // https://stackoverflow.com/questions/11871120/java-time-since-the-epoch

        long epoch = System.currentTimeMillis();
        for (int y=0; y<10; ++y)
        {
            seed = System.currentTimeMillis();
            generator = new java.util.Random(seed);
            num = generator.nextDouble() * (max - min + 1) + min;
            System.out.println("num = " + num);
        }
    }
}