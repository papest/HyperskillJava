class Army {
    static int unitCount = 5;
    static int knightCount = 3;
    static int generalCount = 1;
    static int doctorCount = 1;

    private static void createUnit() {
        new Unit(String.join("_", "Unit", String.valueOf(Unit.countUnit + 1)));
    }

    private static void createKnight() {
        new Knight(String.join("_", "Knight", String.valueOf(Knight.countKnight + 1)));
    }

    private static void createDoctor() {
        new Doctor(String.join("_", "Doctor", String.valueOf(Doctor.countDoctor + 1)));
    }

    private static void createGeneral() {
        new General(String.join("_", "Doctor", String.valueOf(General.countGeneral + 1)));
    }

    public static void createArmy() {
        while (unitCount-- > 0) createUnit();
        while (knightCount-- > 0) createKnight();
        while (doctorCount-- > 0) createDoctor();
        while (generalCount-- > 0) createGeneral();
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}