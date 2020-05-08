package strategia;

public class Strategia {

    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        sorter.testOnRandomArrays();
        System.out.println("");
        sorter.testOnSameArray();
        
        // dla wiekszych ilosci test trwal zbyt dlugo, ale sredni czas jest zapisany w komentarzu w metodzie
    }

}
