package lk.ijse.orderservice.services;



import lk.ijse.orderservice.dto.UserDTO;

import java.util.List;


public interface UserService {
    int saveUser(UserDTO userDTO);
    int updateUser(UserDTO userDTO);
    int deleteUser(int id);
    List<UserDTO> getAll();

}
