import java.util.Scanner;

class ArmyCategory {
    static boolean isArmy(int num) {
        return num > 0;
    }

    static boolean isNotLegion(int num) {
        return num < 1000;
    }

    static boolean isLesserThanThrong(int num) {
        return num < 20;
    }

    static boolean isMoreThanThrong(int num) {
        return num > 249;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        String result = isLesserThanThrong(num) ?
                isArmy(num) ? "pack"
                        : "no army" :
                isMoreThanThrong(num) ? isNotLegion(num) ? "zounds"
                        : "legion"
                        : "throng";

        System.out.println(result);
    }

}