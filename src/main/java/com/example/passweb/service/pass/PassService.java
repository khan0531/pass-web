package com.example.passweb.service.pass;

import com.example.passweb.repository.pass.PassEntity;
import com.example.passweb.repository.pass.PassRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PassService {
    private final PassRepository passRepository;

    public PassService(PassRepository passRepository) {
        this.passRepository = passRepository;
    }

    public List<Pass> getPasses(final String userId) {
        final List<PassEntity> passEntities = passRepository.findByUserId(userId);
        return PassModelMapper.INSTANCE.map(passEntities);

    }

}
