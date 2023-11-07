public class Apartment {

    private String nameOfApartmen;
    private String adressOfApartmen;
    private int priceOfApartmen;

    public Apartment() {
    }

    public Apartment(String nameOfApartmen, String adressOfApartmen, int priceOfApartmen) {
        this.nameOfApartmen = nameOfApartmen;
        this.adressOfApartmen = adressOfApartmen;
        this.priceOfApartmen = priceOfApartmen;
    }

    public String getNameOfApartmen() {
        return nameOfApartmen;
    }

    public void setNameOfApartmen(String nameOfApartmen) {
        this.nameOfApartmen = nameOfApartmen;
    }

    public String getAdressOfApartmen() {
        return adressOfApartmen;
    }

    public void setAdressOfApartmen(String adressOfApartmen) {
        this.adressOfApartmen = adressOfApartmen;
    }

    public int getPriceOfApartmen() {
        return priceOfApartmen;
    }

    public void setPriceOfApartmen(int priceOfApartmen) {
        this.priceOfApartmen = priceOfApartmen;
    }
    public void oplataMonth(Student [] student){
        int res = getPriceOfApartmen() / student.length;
        res -= student.length;
        for (Student ggsd1 : student) {
            System.out.println(ggsd1.getFullName() + " | Ayiga : " + res + " toloit ");
        }
    }

}
