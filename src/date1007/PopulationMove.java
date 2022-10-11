package date1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public boolean checkToSido(int checkedBySido) {
        return true;
    }

    public int countToSido(int checkedBySido){
        return 0;
    }
}
