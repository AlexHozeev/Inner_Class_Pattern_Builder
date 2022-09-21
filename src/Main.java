import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cup cup = Cup.builder()
                .price(100)
                .brand("YWY")
                .color("YELLOW")
                .size(12)
                .madeIn("China")
                .build();

        System.out.println(cup);
    }
}


//        TalkingClock talkingClock = new TalkingClock(4000,true);
//        TalkingClock.TimePrinter timePrinter = talkingClock.new TimePrinter(); // create example inner class
//        talkingClock.start();
//
//        JOptionPane.showMessageDialog(null,"stop program");
//        System.out.println("end");