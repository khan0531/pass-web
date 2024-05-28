package com.example.passweb.repository.user;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserGroupMappingRepository extends JpaRepository<UserGroupMappingEntity, Integer> {

    @Query("select distinct u.userGroupId " +
            "from UserGroupMappingEntity u " +
            "order by u.userGroupId")
    List<String> findDistinctUserGroupId();
}
