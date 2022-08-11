public class Varasto {
    
    private String nimi;
    private String tunnus;

    public Varasto(String tunnus, String nimi) {
        this.nimi = nimi;
        this.tunnus = tunnus;
    }

    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }

    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }

        if(verrattava instanceof Varasto){
            Varasto VarastoVerrattava = (Varasto) verrattava;
            if (this.tunnus.equals(VarastoVerrattava.tunnus) ) {
                return true;
            }
        }
        
        return false;
    }
}
