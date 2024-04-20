package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.User;

public class EntrepreneurshipDTO {
    private Long id;
    private String nameEntrepreneurship;
    private String rucEntrepreneurship;
    private String locationEntrepreneurship;
    private String phoneEntrepreneurship;
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEntrepreneurship() {
        return nameEntrepreneurship;
    }

    public void setNameEntrepreneurship(String nameEntrepreneurship) {
        this.nameEntrepreneurship = nameEntrepreneurship;
    }

    public String getRucEntrepreneurship() {
        return rucEntrepreneurship;
    }

    public void setRucEntrepreneurship(String rucEntrepreneurship) {
        this.rucEntrepreneurship = rucEntrepreneurship;
    }

    public String getLocationEntrepreneurship() {
        return locationEntrepreneurship;
    }

    public void setLocationEntrepreneurship(String locationEntrepreneurship) {
        this.locationEntrepreneurship = locationEntrepreneurship;
    }

    public String getPhoneEntrepreneurship() {
        return phoneEntrepreneurship;
    }

    public void setPhoneEntrepreneurship(String phoneEntrepreneurship) {
        this.phoneEntrepreneurship = phoneEntrepreneurship;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
