package elementoMultimediale;

abstract class Audio extends ElementoMultimediale implements Riproducibile, Regolabile {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(titolo);
        }
    }

    public void abbassa(int quantita) {
        volume -= quantita;
        if (volume < 0) {
            volume = 0;
        }
    }

    public void alza(int quantita) {
        volume += quantita;
    }
}
