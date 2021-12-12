package com.jrbangit.jbangonlinecleaners.Controller;

import com.google.common.collect.Lists;
import com.jrbangit.jbangonlinecleaners.Exceptions.JbangOnlineCleanersExceptions;
import com.jrbangit.jbangonlinecleaners.Models.Cleaner;
import com.jrbangit.jbangonlinecleaners.Models.CleanerRepository;
import com.jrbangit.jbangonlinecleaners.Models.Client;
import com.jrbangit.jbangonlinecleaners.Models.ClientRepository;
import com.jrbangit.jbangonlinecleaners.Service.JbangOnlineCleanersCustomerServices;
import com.jrbangit.jbangonlinecleaners.Service.JbangOnlineCleanersService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class JbangOnlineCleanersController {

    private JbangOnlineCleanersService jbangOnlineCleanersService;
    private JbangOnlineCleanersCustomerServices jbangOnlineCleanersCustomerServices;


    @Autowired
    public JbangOnlineCleanersController(JbangOnlineCleanersService jbangOnlineCleanersService, JbangOnlineCleanersCustomerServices jbangOnlineCleanersCustomerServices){
        this.jbangOnlineCleanersService = jbangOnlineCleanersService;
        this.jbangOnlineCleanersCustomerServices = jbangOnlineCleanersCustomerServices;
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
    @GetMapping("/get-cleaners")
    public List<Cleaner> getCleaners(){
        return Lists.newArrayList(jbangOnlineCleanersService.getCleaners());
    }

    @PostMapping("/add-cleaners")
    public ResponseEntity<Cleaner> addCleaner(@RequestBody Cleaner cleaner){
        return new ResponseEntity<>(jbangOnlineCleanersService.addCleaner(cleaner), HttpStatus.ACCEPTED);
    }


    @PutMapping("/update-cleaners")
    public ResponseEntity<Cleaner> updateCleaner(@RequestBody Cleaner cleaner){
        return new ResponseEntity<>(jbangOnlineCleanersService.updateCleaner(cleaner), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-cleaners/{cleaner_id}")
    public ResponseEntity<Cleaner> getCleanerByCleaner_Id(@PathVariable("cleaner_id") Integer cleaner_id) throws JbangOnlineCleanersExceptions {
        return new ResponseEntity<>(jbangOnlineCleanersService.findCleanerByCleaner_Id(cleaner_id), HttpStatus.OK);
    }

    @DeleteMapping("/delete-cleaner/{cleaner_id}")
    public ResponseEntity<?> deleteCleanerByCleaner_Id(@PathVariable("cleaner_id") Integer cleaner_id){
        jbangOnlineCleanersService.deleteCleanerById(cleaner_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/client")
    public List<Client> getClients(){
        return this.jbangOnlineCleanersCustomerServices.getClients();
    }

//
//    @RequestMapping("add-cleaners")
//    public ModelAndView addCleaner(Cleaner cleaner) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("cleaner", cleaner);
//        mv.setViewName("home");
//        cleanerRepository.save(cleaner);
//        return mv;
//    }
//
//    @RequestMapping("get-cleaners")
//    public ModelAndView getCleaners() {
//        List<Cleaner> cleaners = new ArrayList<>();
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("cleaners");
//        cleanerRepository.findAll().forEach(cleaners::add);
////        Iterable<Cleaner> cleaners = cleanerRepository.findAll();
////        for (Cleaner cleaner : cleaners){
////            mv.addObject("cleaner", cleaner);
////        }
//        mv.addObject("cleaners", cleaners);
//        System.out.println(cleaners);
//       return mv;
//    }

//
//    @RequestMapping("/addCleaners")
//    public void addCleaners(Cleaner cleaner){
//       cleanerRepository.save(cleaner);
//    }

}
