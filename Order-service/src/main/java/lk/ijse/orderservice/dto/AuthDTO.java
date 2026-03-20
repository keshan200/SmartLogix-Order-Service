package lk.ijse.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class AuthDTO {
    private Long id;
    private String email;
    private String role;
    private String token;
    private String refreshToken;
    private String name;



}
