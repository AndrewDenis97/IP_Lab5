import java.util.List;

public class Admin extends Persoana {

    int drepturi;
    List<Produs> produse;
    public void creareCont(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public void primiredrepturiAdmin(int drepturi) {
        this.drepturi = drepturi;
    }

    public void adaugareProduse(Produs produs) {
        produse.add(produs);
    }

    public void stergereProduse(Produs produs) {
        produse.remove(produs);
    }

}