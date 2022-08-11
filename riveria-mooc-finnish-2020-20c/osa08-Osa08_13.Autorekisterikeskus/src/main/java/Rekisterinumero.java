
import java.util.Objects;

public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

}
