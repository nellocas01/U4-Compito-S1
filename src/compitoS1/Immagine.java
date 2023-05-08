package elementoMultimediale;

abstract class Immagine extends ElementoMultimediale implements Regolabile {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }

    public void mostra() {
        for (int j = 0; j < luminosita; j++) {
            System.out.print("*");
        }
        System.out.println(titolo);
    }

    public void aumenta(int quantita) {
        luminosita += quantita;
    }

    public void diminuisci(int quantita) {
        luminosita -= quantita;
        if (luminosita < 0) {
            luminosita = 0;
        }
    }
}
