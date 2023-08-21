package lesson6;

public class Elevator{
        private int thisFloor;
        private int maxFloor;
        private  int minFloor;

    public Elevator(int maxFloor, int minFloor) {
        if(minFloor > maxFloor){
            throw new IllegalArgumentException("Введите верный диапозон!!!");
        }
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }
    public Elevator(int maxFloor){
        minFloor = 1;
    }
    public void move(int floor){
            if((floor<=maxFloor) && (floor >= minFloor)){
                 thisFloor = floor;
                System.out.println("Вы приехали на " + floor + " этаж");
             }else{
                System.out.println("Введите верный этаж!\n Диапозон ["+minFloor+"-"+maxFloor+"]");
             }
    }


}
