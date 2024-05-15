public class Negozio {
    private Gioco giochi[];
    private int numeroGiochi;

    public Negozio(int numeroGiochi) {
        this.giochi = new Gioco[100];
        this.numeroGiochi = 0;
    }

    public Negozio(Gioco[] giochi, int max) {
        this.giochi = new Gioco[max];
        if (giochi.length > max)
            return;
        for (int i = 0; i < giochi.length; i++) {
            this.giochi[i] = new Gioco(giochi[i].getTitolo(), giochi[i].getTipo());
        }
        this.numeroGiochi = giochi.length;
    }

    public Negozio(Negozio a) {
        for (int i = 0; i < giochi.length; i++) {
            this.giochi[i] = new Gioco(giochi[i].getTitolo(), giochi[i].getTipo());
        }
        this.numeroGiochi = a.numeroGiochi;
    }

    public void aggiungiGioco(String titolo, String tipo) {
        if (numeroGiochi != this.giochi.length - 1) {
            giochi[numeroGiochi] = new Gioco(titolo, tipo);
            numeroGiochi++;
        }
    }

    public void eliminaGioco(String titolo, String tipo) {
        int n = getIndice(titolo);
        if (n != -1) {
            for (int i = n; i < giochi.length; i++) {
                if (i == giochi.length - 1) {
                    giochi[i] = null;
                } else {
                    giochi[i] = giochi[i + 1];
                }
            }
            numeroGiochi--;
        }
    }

    private int getIndice(String titolo) {
        int n = 0;
        boolean r = false;
        int i = 0;
        while (r == false && i <= numeroGiochi) {
            if (i == numeroGiochi) {
                return -1;
            } else {
                if (titolo.equals(giochi[i].getTitolo())) {
                    n = i;
                    r = true;
                }
            }
            i++;
        }
        return n;
    }

    public String contaTipo() {
        String tipi[] = new String[numeroGiochi];
        int numeroTipi = 0;
        for (int i = 0; i < numeroGiochi; i++) {
            boolean trovato = false;
            for (int j = 0; j < numeroGiochi; j++) {
                if (giochi[i].getTipo().equals(tipi[j])) {
                    trovato = true;
                }
            }
            if (!trovato) {
                tipi[numeroTipi] = giochi[i].getTipo();
                numeroTipi++;
            }
        }
        int contaTipi[] = new int[numeroTipi];
        for (int i = 0; i < numeroGiochi; i++) {
            int indice = 0;
            for (int j = 0; j < numeroTipi; j++) {
                if (giochi[i].getTipo().equals(tipi[j])) {
                    indice = j;
                    contaTipi[indice]++;
                }
            }
        }
        int max = 0;
        int indicemax = -1;
        for (int i = 0; i < contaTipi.length; i++) {
            if (contaTipi[i] > max) {
                max = contaTipi[i];
                indicemax = i;
            }
        }
        return "Il tipo di gioco più frequente è: " + tipi[indicemax];
    }

    

    public String toString() {
        String s = "";
        for (int i = 0; i < numeroGiochi; i++) {
            s += giochi[i].getTitolo() + "\n";

        }
        return s;
    }
}
