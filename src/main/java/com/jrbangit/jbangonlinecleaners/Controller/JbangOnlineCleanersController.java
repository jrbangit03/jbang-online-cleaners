package com.jrbangit.jbangonlinecleaners.Controller;

import com.jrbangit.jbangonlinecleaners.Models.Cleaner;
import com.jrbangit.jbangonlinecleaners.Models.CleanerRepository;
import com.jrbangit.jbangonlinecleaners.Models.Client;
import com.jrbangit.jbangonlinecleaners.Models.ClientRepository;
import com.jrbangit.jbangonlinecleaners.Service.JbangOnlineCleanersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JbangOnlineCleanersController {


    private JbangOnlineCleanersService jbangOnlineCleanersService;

    @Autowired
    CleanerRepository cleanerRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    public JbangOnlineCleanersController(JbangOnlineCleanersService jbangOnlineCleanersService){
        this.jbangOnlineCleanersService = jbangOnlineCleanersService;
    }

//    @GetMapping("home")
//    public List<Cleaner> getCleaners(Cleaner cleaner){
//        return this.jbangOnlineCleanersService.getCleaners();
//    }

//    @RequestMapping("add-cleaners")
//    public ModelAndView index() {
//        return new ModelAndView("home");
//    }
//
    @RequestMapping("add-cleaners")
    public ModelAndView addCleaner(Cleaner cleaner) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("cleaner", cleaner);
        mv.setViewName("home");
        cleanerRepository.save(cleaner);
        return mv;
    }

    @RequestMapping("get-cleaners")
    public ModelAndView getCleaners() {
        List<Cleaner> cleaners = new ArrayList<>();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cleaners");
        cleanerRepository.findAll().forEach(cleaners::add);
        mv.addObject(cleaners);
       return mv;
    }

//
//    @RequestMapping("/addCleaners")
//    public void addCleaners(Cleaner cleaner){
//       cleanerRepository.save(cleaner);
//    }

}
