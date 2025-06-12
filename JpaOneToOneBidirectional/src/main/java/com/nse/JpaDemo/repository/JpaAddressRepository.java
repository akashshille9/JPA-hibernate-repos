package com.nse.JpaDemo.repository;

import com.nse.JpaDemo.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAddressRepository extends JpaRepository<UserAddress, Long> {
}
