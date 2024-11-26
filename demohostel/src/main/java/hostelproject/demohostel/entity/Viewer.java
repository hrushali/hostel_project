package hostelproject.demohostel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="viewer")
@Getter
@Setter
public class Viewer{
    @Id
    @Column(name ="Viewer_ID")
    private String Viewer_ID;
    
    @Column(name ="Viewer_Name")
    private String Viewer_Name;
    @Column (name ="Password")
    private String Password;
    @Column(name ="Viewer_phone")
    private String Viewer_phone;

    @ManyToOne
    @JoinColumn(name = "Admin_ID", referencedColumnName = "Admin_ID")
    private Admin admin;

    public Viewer() {
    }

     public Viewer(String viewer_ID, String viewer_Name, String password, String viewer_phone, Admin admin) {
        Viewer_ID = viewer_ID;
        Viewer_Name = viewer_Name;
        Password = password;
        Viewer_phone = viewer_phone;
        this.admin = admin;
    }


    


    
}
