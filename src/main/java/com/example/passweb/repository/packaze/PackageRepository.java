package com.example.passweb.repository.packaze;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<PackageEntity, Integer> {
    List<PackageEntity> findAllByOrderByPackageName();

}
