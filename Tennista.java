class Tennista {
    private String nome_cognome;
    private String nazione;
    private int rankingATP;
    private int titoli;

    public Tennista(String nome_cognome, String nazione, int rankingATP, int titoli) {
        this.nome_cognome = nome_cognome;
        this.nazione = nazione;
        this.rankingATP = rankingATP;
        this.titoli = titoli;
    }

    public int getTitoli() {
        return titoli;
    }

    public String toCSV() {
        return nome_cognome + ", " + nazione + ", " + rankingATP + ", " + titoli;
    }
}