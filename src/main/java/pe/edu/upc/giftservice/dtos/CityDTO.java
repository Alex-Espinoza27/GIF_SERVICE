package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.Country;

public class CityDTO {
    private int idCity;
    private String nameCity;
    private Country counTry;
    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Country getCounTry() {
        return counTry;
    }

    public void setCounTry(Country counTry) {
        this.counTry = counTry;
    }
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

}
