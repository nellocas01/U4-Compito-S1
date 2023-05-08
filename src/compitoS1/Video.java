package elementoMultimediale;

abstract class Video extends ElementoMultimediale implements Riproducibile, Regolabile {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < luminosita; j++) {
                System.out.print("*");
            }
            System.out.println(titolo);
        }
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

