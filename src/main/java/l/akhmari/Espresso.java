package l.akhmari;

public class Espresso extends Boisson{
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cout() {
        return 10;
    }
}
