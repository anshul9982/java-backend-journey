public class DecisionMaker {
    public static void main(String[] args) {
        int temprature = 40;
        if(temprature<30){
            System.out.println("its cold!");
        } else if (temprature>=30 && temprature<40) {
            System.out.println("its alright");
        } else if (temprature>=40) {
            System.out.println("its hot!");
        }else{
            System.out.println("you are cooked");
        }

        String command = "start";
        switch (command){
            case "start":
                System.out.println("system starts!");
                break;
            case "continue":
                System.out.println("system keeps running");
                break;
            case "stop":
                System.out.println("system stops!");
                break;
            default:
                System.out.println("idk what command that is bruh");
        }
    }
}
