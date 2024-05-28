package com.example.passweb.service.packaze;

import com.example.passweb.repository.packaze.PackageEntity;
import com.example.passweb.repository.packaze.PackageRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PackageService {
    private final PackageRepository packageRepository;

    public PackageService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    public List<java.lang.Package> getAllPackages() {
        List<PackageEntity> bulkPassEntities = packageRepository.findAllByOrderByPackageName();
        return PackageModelMapper.INSTANCE.map(bulkPassEntities);
    }
}
