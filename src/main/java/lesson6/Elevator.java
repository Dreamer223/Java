package lesson6;

public class Elevator{
        private int maxFloor;
        private  int minFloor=-10;
        private int thisFloor = minFloor;
        private String range;


    public Elevator(int maxFloor, int minFloor) {
        if(minFloor > maxFloor){
            throw new IllegalArgumentException("Введите верный диапозон!!!");
        }
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        this.range = "["+minFloor+"-"+maxFloor+"]";
    }
    public Elevator(int maxFloor){
        this(maxFloor, 1);
    }
    public void move(int floor){
            if((floor<=maxFloor) && (floor >= minFloor)){
                if(floor == thisFloor){
                    System.out.println("Вы уже на этом этаже. Выбирете другой этаж");
                }
                 thisFloor = floor;
                System.out.println("Вы приехали на " + thisFloor + " этаж");
             }else{
                System.out.println("Введите верный этаж!\n Диапозон ["+minFloor+"-"+maxFloor+"]");
             }
    }
    public String toString(String s) {
        s=range + " Этаж "+ thisFloor;
        return s;
    }

}
