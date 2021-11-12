package cz.homeoffice.funtaskproject.repositories;

import cz.homeoffice.funtaskproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT u FROM User u where u.userName = ?1 and u.password = ?2")
    Optional<User> login(String username, String password);

    Optional<User> findByAccessToken(String accessToken);
}
