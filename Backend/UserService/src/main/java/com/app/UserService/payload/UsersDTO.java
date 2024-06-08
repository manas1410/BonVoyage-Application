package com.app.UserService.payload;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userPassword;
    private String userAddress;
    private UserRole userRole;

}
