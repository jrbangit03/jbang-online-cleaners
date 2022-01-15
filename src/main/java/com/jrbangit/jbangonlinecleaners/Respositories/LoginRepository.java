//package com.jrbangit.jbangonlinecleaners.Respositories;
//
//import com.jrbangit.jbangonlinecleaners.Models.User;
//import com.jrbangit.jbangonlinecleaners.Models.Login;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.Optional;
//
//public interface LoginRepository extends CrudRepository<Login, String> {
//
//    @Query("from Accounts where username=?1 and password=?1")
//    Optional<User> findUserByAccntAndPassword(String acctName, String password);
//
//}
