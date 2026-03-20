package lk.ijse.orderservice.dto;

import jakarta.persistence.*;
import lk.ijse.orderservice.entity.Customers;
import lk.ijse.orderservice.entity.Users;
import lk.ijse.orderservice.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;

    private String username;
    private String email;
    private String password;

    private String role;
    private Status status ;

    private List<Customers> customers;
}