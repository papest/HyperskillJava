public class StaticNestedClassCreation {
    public static void main(String[] args) {
        IPhone154.PrototypeIPhone154 a = new IPhone154.PrototypeIPhone154();
        IPhone154.PrototypeIPhone154 b = new IPhone154.PrototypeIPhone154();
        System.out.println(a);
        System.out.println(b);
        a.printMinCost();
        b.printMinCost();
        new IPhone154.PrototypeIPhone154().printMinCost();
    }
}

class IPhone154 {
    static double minCost;

    static class PrototypeIPhone154 {
        {
            minCost = initCost();
        }

        void printMinCost() {
            System.out.println("The min cost of IPhone154 should be: $" + minCost);
        }
    }

    private static double initCost() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextDouble();
    }
}