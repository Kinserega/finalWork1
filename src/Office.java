public class Office {
    private String nameOficce;

    public Office(String nameOficce) {
        this.nameOficce = nameOficce;
    }

    public String getNameOficce() {
        return nameOficce;
    }

    public void setNameOficce(String nameOficce) {
        this.nameOficce = nameOficce;
    }

    @Override
    public String toString() {
        return nameOficce;
    }
}
