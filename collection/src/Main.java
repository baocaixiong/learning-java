public class Main
{
    public static void main(String... args)
    {
//        Test1.test1();

//        SetTest.setTest();

//        PriorityQueueTest.testPriorityQueue();

//        System.out.println(0xff);
//        System.out.println((byte) 0xff);
//        System.out.println((int) ((byte) 0xff));
        printI(0xff >> 7); // 1
        printI((byte) 0xff); // -1
        printI((byte) 0x101); // 1
        printI(((byte) 0xff) >>> 7); // 33554431
        printI((byte) (((byte) 0xff) >>> 7)); // -1
        printI((((byte) 0xff) >> 7)); // -1
        System.out.println("=====");
        printI((-0xff) >> 7);
        printB(0xff);
        printB(-0xff);
        printB(-0xff >> 7);
        printB((byte) 0xff);
        printB(0x101);

        printB((byte)255);
    }

    private static void printB(int num)
    {
        System.out.print(num + "=(bin)");
        System.out.println(Integer.toBinaryString(num));
    }

    private static void printI(int num)
    {
        System.out.println("(int)" + num);
    }
}
