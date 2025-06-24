public class LoopingMastery {
    public static void main(String[] args) {
        //for loop:
        for (int i = 1; i <=10; i++) {
            if(i==7){
                break;
            }
            else {
                System.out.println("i :" + i);
            }
        }
        // while loop:
        int num = 20;
        while (num>=10 ){
            if(num%2==0){
            System.out.println(num);}
            --num;
        }
        //do-while loop:
        int random;
        do {
            random = (int) (Math.random() * 6) + 1;
            System.out.println("you rolled: " + random);
        }
        while (random!=6);
        //continue keyword:
        for (int i = 1; i <=5; i++) {
            if(i==3){
                continue;
            }
            else {
                System.out.println("i : " + i);
            }
        }
    }
}
