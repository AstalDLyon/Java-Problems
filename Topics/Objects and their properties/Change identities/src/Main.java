class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempString;
        int tempAge;

        tempString = p1.name;
        tempAge = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = tempString;
        p2.age = tempAge;
    }
}