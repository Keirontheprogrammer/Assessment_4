package Customer;

public class Customer {
    private String Name;
    private String Country;
    private String Email;
    private double Discount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Customer(String name, String country, String email, double discount) {
        this.Name = name;
        this.Country = country;
        this.Email = email;
        this.Discount = discount;
    }
    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }
    public void Discount(double percentage){
        this.Discount+=percentage;
    }
 public void CreateAccount(){
    this.Discount+=0.2;
 }
}


