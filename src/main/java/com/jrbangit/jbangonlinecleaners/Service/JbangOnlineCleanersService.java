package com.jrbangit.jbangonlinecleaners.Service;


import com.jrbangit.jbangonlinecleaners.Models.Cleaner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JbangOnlineCleanersService {

    public List<Cleaner> getCleaners(){
        List<Cleaner> list_of_cleaners = new ArrayList<>();
        Cleaner test_cleaner = new Cleaner();
        test_cleaner.setCleaner_fn("marites");
        test_cleaner.setCleaner_age(50);
        test_cleaner.setCleaner_ln("tekya");
        test_cleaner.setCleaner_address("vigan");

        Cleaner test_cleaner2 = new Cleaner();
        test_cleaner2.setCleaner_fn("aling lorna");
        test_cleaner2.setCleaner_age(60);
        test_cleaner2.setCleaner_ln("carpio");
        test_cleaner2.setCleaner_address("vigan");

        list_of_cleaners.add(test_cleaner);
        list_of_cleaners.add(test_cleaner2);
        return list_of_cleaners;
    }

    public void addCleaners(){

    }
}
