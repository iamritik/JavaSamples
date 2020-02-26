public class Person {

    private int id;

    private String name;

    private String city;

    private String pinCode;

    private boolean isVip;

    public Person(int id, String name, String city, String pinCode, boolean isVip) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.pinCode = pinCode;
        this.isVip = isVip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }


}

