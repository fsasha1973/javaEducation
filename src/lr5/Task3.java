package lr5;

public class Task3 {
    private int num1;
    private int num2;

    Task3(){
        System.out.println("Task3(1)\n");
    }
    Task3(int num1){
        System.out.println("Task3(2)");
        this.num1 = num1;
        System.out.println("num1;num1 = " + exhibitor (num1) +"\n");
    }
    public int exhibitor (int num1){
        this.num1 = num1;
        int result = 1;
        for (int i = 1; i <= num1; i++){
            result = num1 * result;
        }
        return result;
    }
    Task3(int num1, int num2){
        System.out.println("Task3(3)");
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1;num2 = " + exhibitorOn (num1, num2) + "\n");
    }
    public int exhibitorOn (int a1, int a2){
        a1 = num1;
        a2 = num2;
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = num1 * result;
        }
        return result;
    }




}
