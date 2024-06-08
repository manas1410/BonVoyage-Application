package com.app.UserService.service.impl;
import com.app.UserService.entity.Users;
import com.app.UserService.exception.ResourceNotFoundException;
import com.app.UserService.payload.UsersDTO;
import com.app.UserService.repository.UserRepository;
import com.app.UserService.service.UserService;
import com.app.UserService.util.MapperLibrary;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final MapperLibrary mapperLibrary;

    @Override
    public UsersDTO createUser(UsersDTO usersDto) {
        Users users = userRepository.save(mapperLibrary.mapToUsers(usersDto));
         return mapperLibrary.mapToUsersDto(users);
    }

    @Override
    public UsersDTO getById(Long userId) {
        Users users = userRepository.findById(userId).orElseThrow(
                ()-> new ResourceNotFoundException("Users","id",userId)
        );
        return mapperLibrary.mapToUsersDto(users);
    }
    @Override
    public List<UsersDTO> getAllUsers() {
        List<Users> usersList = userRepository.findAll();
        return usersList.stream().map(user -> mapperLibrary.mapToUsersDto(user)).toList();
    }
    @Override
    public UsersDTO updateUser(Long userId, UsersDTO usersDTO) {
        UsersDTO usersDTO1 = getById(userId);
        usersDTO1.setUserAddress(usersDTO.getUserAddress());
        usersDTO1.setUserEmail(usersDTO.getUserEmail());
        usersDTO1.setUserName(usersDTO.getUserName());
        usersDTO1.setUserPassword(usersDTO.getUserPassword());
        usersDTO1.setUserPhone(usersDTO.getUserPhone());
        return mapperLibrary.mapToUsersDto(
                userRepository.save(mapperLibrary.mapToUsers(usersDTO1))
        );
    }
    @Override
    public String deleteUser(Long userId) {
        getById(userId);
        userRepository.deleteById(userId);
        return "User deleted successfully";
    }
}


