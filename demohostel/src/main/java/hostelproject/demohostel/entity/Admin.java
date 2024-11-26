package hostelproject.demohostel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="admin")
@Getter
@Setter
public class Admin {
    
   

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Viewer_ID", referencedColumnName = "Viewer_ID")
    @JsonBackReference
    private Viewer viewer;


@Id
   @Column(name = "Admin_ID")
   private String Admin_ID;
   @Column(name ="Admin_Name")
   private String Admin_Name;
   @Column(name = "Password")
   private String Password;
   @Column(name ="Email")
   private String Admin_Email;
   @Column(name = "Phone")
   private String Phone;


   public Admin() {
}

public Admin( Viewer viewer, String admin_ID, String admin_Name, String password, String admin_Email,
        String phone) {
    
    this.viewer = viewer;
    Admin_ID = admin_ID;
    Admin_Name = admin_Name;
    Password = password;
    Admin_Email = admin_Email;
    Phone = phone;
}

   


    
    
}
