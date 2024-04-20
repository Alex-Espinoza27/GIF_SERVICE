package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.User;

public class RoleDTO {
    private int idRole;
    private String nameRole;
    private User usEr;

    public User getUsEr() {
        return usEr;
    }

    public void setUsEr(User usEr) {
        this.usEr = usEr;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
}
