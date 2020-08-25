public class Printer {
    private int paper;
    private int toner;


    public Printer() {
        this.paper = 100;
        this.toner = 100;
    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return toner;
    }

    public String print(int copies, int pages) {
        if (this.paper >= copies * pages) {
            this.paper -= copies * pages;
            this.toner -= pages;
        }
        return "Not enough paper!";
    }
}
