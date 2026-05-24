package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, String> {
}

