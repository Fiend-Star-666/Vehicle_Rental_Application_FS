package com.intern.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import com.intern.carRental.primary.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	Member findBydriverLicenseNumber(String licenceNumber);
}