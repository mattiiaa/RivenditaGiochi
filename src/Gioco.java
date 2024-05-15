public class Gioco {
    private String titolo;
    private String tipo;

    public Gioco() {

    }
    
    public Gioco(String titolo, String tipo) {
        this.titolo = titolo;
        this.tipo = tipo;
    }

    public Gioco(Gioco a) {
        this.titolo = a.titolo;
        this.tipo = a.tipo;
    }
    

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean equals(Gioco gioco) {
        
        if (this.titolo.equals(gioco.titolo) && this.tipo.equals(gioco.tipo)) {
            return true;
        } else {
            return false;
        }  
    }
}
