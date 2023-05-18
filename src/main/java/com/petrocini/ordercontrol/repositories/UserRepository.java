package com.petrocini.ordercontrol.repositories;

import com.petrocini.ordercontrol.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
