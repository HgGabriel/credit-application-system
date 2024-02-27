package me.dgk.creditapplicationsystem.repository

import me.dgk.creditapplicationsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CreditRepository:JpaRepository<Credit, Long> {

}