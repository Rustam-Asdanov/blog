package com.travel.blog.repsitory;

import com.travel.blog.model.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewUserRepository extends JpaRepository<NewUser,Long> {
}
