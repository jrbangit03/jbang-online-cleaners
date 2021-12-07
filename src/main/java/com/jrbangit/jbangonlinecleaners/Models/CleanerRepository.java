package com.jrbangit.jbangonlinecleaners.Models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CleanerRepository extends CrudRepository<Cleaner, Integer> {

    List<Cleaner> findByCleaner_Fn(String cleaner_fn);

    @Query("from Cleaner where q=?1 b=?2")
    List<Cleaner> findByQuery(String q);
}
