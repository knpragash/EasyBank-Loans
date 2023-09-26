package com.learn.loans.loans.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.loans.loans.entity.loans;

@Repository
public interface LoansRepository extends JpaRepository<loans, Long> {

    Optional<loans> findByMobileNumber(String mobileNumber);

    Optional<loans> findByLoanNumber(String loanNumber);

}
