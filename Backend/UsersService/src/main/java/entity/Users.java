package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import payload.UserRole;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class Users {
    @Id
    @Column(name = "userId")
    private String userId;

    @Column(name="userName")
    private String userName;

    @Column(name="userEmail")
    private String userEmail;

    @Column(name="userPhone")
    private String userPhone;

    @Column(name="userPassword")
    private  String userPassword;

    @Column(name = "userAddress")
    private String userAddress;

    @Enumerated(EnumType.STRING)
    @Column(name="userRole")
    private UserRole userRole;
}