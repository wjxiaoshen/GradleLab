package info.garagesalesapp.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
*.Learn gradle since 2/9/2018
 */
public class SaleEvent {
    private String id;
    private String streetAddress;
    private String city;

    public String getId() {return id;}
    private void setId(String id) {this.id = id;}
    public String getStreetAddress() {return streetAddress;}
    private void setStreetAddress(String streetAddress) {this.streetAddress = streetAddress;}
    public String getCity() {return city;}
    private void setCity(String city){this.city = city;}

    @Override
    public String toString(){
        return "SaleEvent: " +
                id +
                ", " + streetAddress +
                ", " + city;
    }

    public static void main(String[] args) {
        SaleEvent saleEvent = new SaleEvent();
        saleEvent.setId("100");
        saleEvent.setStreetAddress("123 Main St.");
        saleEvent.setCity("Naperville");

        System.out.println(saleEvent.toString());

        Gson gson = new GsonBuilder().create(); //Gson 3rd party library, need bring it in from internet
        String json =gson.toJson(saleEvent);
        System.out.println(json);
    }

}
