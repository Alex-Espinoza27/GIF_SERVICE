package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(name = "nameRole", nullable = false, length = 20)
    private String nameRole;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User usEr;

    public Role(){
    }

    public Role(int idRole, String nameRole, User usEr) {
        this.idRole = idRole;
        this.nameRole = nameRole;
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

    public User getUsEr() {
        return usEr;
    }

    public void setUsEr(User usEr) {
        this.usEr = usEr;
    }
}
