package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.entity.user.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.annotation.Transient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


// Annotation
//@RepositoryDefinition(domainClass = UserEntity.class,idClass = Long.class)
//public interface userRepository {
//}
public interface UserRepository extends JpaRepository<UserEntity,Long> , JpaSpecificationExecutor<UserEntity> {
    // find user and email
    /*
    ->findByUserNameAndUserEmail->UserNameAndUserEmail->userNameAndUserEmail->userNameAnduserEmail
    -> userNameAnduserEmail =  where userName = ?1 and userEmail = ?2;
     */
    UserEntity findByUserNameAndUserEmail(String userName,String userEmail);

    UserEntity findByUserName(String userName);

    /**
     * Where userName like %?
     */
    List<UserEntity> findByUserNameStartingWith(String email);

    /**
     * Where userName like ?%
     */
    List<UserEntity> findByUserNameEndingWith(String email);

    /**
     * Where id < 1
     */
    List<UserEntity> findByIdLessThan(Long id);

    // RAW JPQL
    @Query("SELECT u FROM UserEntity u where u.id = (select max(p.id) from UserEntity p)")
    UserEntity findMaxIdUser();

    @Query("SELECT u FROM UserEntity u where u.userName = ?1 and  u.userEmail = ?2")
    List<UserEntity> getUserEntityBy(String userName, String userEmail);

    @Query("SELECT u FROM UserEntity u where u.userName = :userName and  u.userEmail = :userEmail")
    List<UserEntity> getUserEntityByTow(@Param("userName") String userName,@Param("userEmail") String userEmail);


    /**
     * Update Delete
     */

    @Modifying
    @Query("UPDATE UserEntity u set u.userEmail = :userName")
    @Transactional
    int updateUserName(@Param("userName") String userName);


    // native query

    /**
     * get count User use native query
     */

    @Query(value = "SELECT count(id) from java_user_001",nativeQuery = true)
    Long getTotalUser();
}
