package gameActivity;

import java.util.Random;

class Computer {
     String choice;
     int score = 0;   // ✅ NOT static
     Random random = new Random();

    public void generateChoice() {
        int value = random.nextInt(3) + 1;

        switch (value) {
            case 1:
                choice = "Rock";
                break;
            case 2:
                choice = "Paper";
                break;
            case 3:
                choice = "Scissors";
                break;
        }
    }

    public String getChoice() {
        return choice;
    }

    // ✅ Needed for testing
    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}