package fst;
class Human {
    static int humanCount = 0;

    Human() {
        humanCount++;
    }

    void walking() {
        System.out.println("Human walking");
    }

    void talking() {
        System.out.println("Human talking");
    }
}


class Boy extends Human {
    Boy() {
        super();
    }

    void walking() {
        System.out.println("Boy walking");
    }

    void talking() {
        System.out.println("Boy talking");
    }
}


class Girl extends Human {
    Girl() {
        super();
    }

    void walking() {
        System.out.println("Girl walking");
    }

    void talking() {
        System.out.println("Girl talking");
    }
}


class Robot {
    static int robotCount = 0;

    Robot() {
        robotCount++;
    }

    void walking() {
        System.out.println("Robot walking");
    }

    void talking() {
        System.out.println("Robot talking");
    }
}


public class activity_extra {
    public static void main(String[] args) {

        
        Boy b1 = new Boy();
        Boy b2 = new Boy();
        Boy b3 = new Boy();
        b2.walking();

      
        Girl g1 = new Girl();
        Girl g2 = new Girl();
        Girl g3 = new Girl();


        Robot r1 = new Robot();
        Robot r2 = new Robot();
        Robot r3 = new Robot();

        
        System.out.println("Total Humans: " + Human.humanCount);
        System.out.println("Total Robots: " + Robot.robotCount);
    }
}