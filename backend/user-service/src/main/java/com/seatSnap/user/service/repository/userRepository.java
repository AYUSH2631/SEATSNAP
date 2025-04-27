package com.seatSnap.user.service.repository;

import com.seatSnap.user.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository  extends JpaRepository<User,Long> {
}
