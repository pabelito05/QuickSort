public class Sortowanie {

    void sortuj(int[] tab, int poczatek, int koniec) {
        if (poczatek < koniec) {
            int pivot = tab[koniec];
            int i = poczatek-1;
            for (int j = poczatek; j <= koniec-1; j++) {
                if (tab[j] < pivot) {
                    i++;
                    int t = tab[i];
                    tab[i] = tab[j];
                    tab[j] = t;
                }
            }
            int t = tab[i + 1];
            tab[i + 1] = tab[koniec];
            tab[koniec] = t;
            sortuj(tab, poczatek, i);
            sortuj(tab, i+2, koniec);
        }
    }

}
