package com.example.passweb.repository.pass;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BulkPassRepository extends JpaRepository<BulkPassEntity, Integer> {

    @Query(value = "select b from BulkPassEntity b " +
            "order by b.startedAt desc")
    List<BulkPassEntity> findAllOrderByStartedAtDesc();
}
