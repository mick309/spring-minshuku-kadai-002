package com.example.samuraitravel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;

public interface HouseRepository extends JpaRepository<House, Long> {
	Page<House> findByNameLikeOrAddressLike(String name, String address, Pageable pageable);

	Page<House> findByAddressLike(String address, Pageable pageable);

	Page<House> findByPriceLessThanEqual(Integer price, Pageable pageable);
}
