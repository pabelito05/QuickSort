public class Main {
    public static void main(String[] args) {
        int[] tab = { 1,1,5,4,9,11,2,-3 };
        for (int i : tab) System.out.print(i + " ");
        Sortowanie sortowanie = new Sortowanie();
        sortowanie.sortuj(tab, 0, tab.length - 1);
        System.out.println("\nPosortowane: ");
        for (int i : tab) System.out.print(i + " ");
    }
}

