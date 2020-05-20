package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int addToner) {
        if (addToner > 0 && addToner <= 100) {
            if (this.tonerLevel + addToner > 100) {
                return -1;
            }
            this.tonerLevel += addToner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = ((pages/2) + (pages % 2));
            System.out.println("Printing in duplex");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
