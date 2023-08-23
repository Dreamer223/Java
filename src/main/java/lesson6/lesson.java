package lesson6;

public class lesson {
    public static void main(String[] args) {
        String s="Floor";
        Elevator residentialBuilding = new Elevator(17, -3);
        residentialBuilding.move(17);
        System.out.println(residentialBuilding.toString(s));



    }
}
