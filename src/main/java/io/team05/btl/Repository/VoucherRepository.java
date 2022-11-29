package io.team05.btl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.team05.btl.model.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher, Integer> {
}
