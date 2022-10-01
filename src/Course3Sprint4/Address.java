package Course3Sprint4;

public class Address {

    private int houseNumber;
    private int zipcode;
    private String streetName;
    private String city;
    private String country;

    public Address(int houseNumber, String streetName, String city, String country) {
        this.houseNumber = houseNumber;
        this.zipcode = zipcode;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }

    public Address() {
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
