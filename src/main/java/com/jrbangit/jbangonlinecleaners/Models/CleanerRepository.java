package com.jrbangit.jbangonlinecleaners.Models;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CleanerRepository extends CrudRepository<Cleaner, Integer> {

//    List<Cleaner> findBycleaner_fn(String cleaner_fn);

    @Query("from Cleaner where cleaner_id=?1")
    List<Cleaner> findByQuery(Integer cleaner_id);

    @Query("from Cleaner where cleaner_id=?1")
    Optional<Cleaner> findCleanerByCleaner_Id(Integer cleaner_id);

    @Modifying
    @Query("delete from Cleaner where cleaner_id=?1")
    void deleteCleanerById(Integer cleaner_id);

}
