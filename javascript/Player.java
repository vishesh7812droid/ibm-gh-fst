package gameActivity;

class Player {
    private String name;
    private String choice;
    private int score = 0;   // ✅ NOT static

    public Player(String name) {
        this.name = name;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }

    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
