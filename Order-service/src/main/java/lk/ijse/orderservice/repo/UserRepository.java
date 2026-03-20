package lk.ijse.orderservice.repo;


import lk.ijse.orderservice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, Long> {

    boolean existsByEmail(String email);

    Users findByEmail(String email);


    @Query(value = "SELECT * FROM users WHERE email = :email", nativeQuery = true)
    Users findByEmailNative(@Param("email") String email);


}
