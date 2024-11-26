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
@Table(name ="clark")
@Getter
@Setter
public class Clark{
   @Id
    @Column(name = "Clark_ID")
    private String Clark_ID;

    @Column(name ="Clark_Name")
    private String Clark_Name;
    @Column(name ="password")
    private String Password;
    @Column(name="Phone")
   private String Phone;

    @ManyToOne
    @JoinColumn(name = "Wing_ID", referencedColumnName = "Wing_ID")
    private Wings wing;

    public Clark() {
    }
    public Clark(String clark_ID, String clark_Name, String password, String phone, Wings wing, String phone2) {
        Clark_ID = clark_ID;
        Clark_Name = clark_Name;
        Password = password;
        Phone = phone;
        this.wing = wing;
        phone = phone2;
    }
    
    
    
}
