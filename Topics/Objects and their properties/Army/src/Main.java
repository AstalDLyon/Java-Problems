import java.util.ArrayList;
import java.util.List;

class Army {

    public static void createArmy() {
        // Create all objects here
        List<Unit> unidades = new ArrayList<>();
        List<Knight> cavaleiros = new ArrayList<>();
        List<General> lideres = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            unidades.add(new Unit("Unidade " + i + 1));
        }
        for (int i = 0; i < 3; i++){
            cavaleiros.add(new Knight("Cavaleiro " + i + 1));
        }
        for (int i = 0; i < 1; i++){
            lideres.add(new General("General" + i + 1));
        }
        for (int i = 0; i < 1; i++){
            doctors.add(new Doctor("Doutor" + i + 1));
        }


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