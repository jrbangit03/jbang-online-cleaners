package com.jrbangit.jbangonlinecleaners.Service;

import com.google.common.collect.Lists;
import com.jrbangit.jbangonlinecleaners.Models.Client;
import com.jrbangit.jbangonlinecleaners.Models.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JbangOnlineCleanersCustomerServices {

    private ClientRepository clientRepository;

    @Autowired
    public JbangOnlineCleanersCustomerServices(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
        return Lists.newArrayList(clientRepository.findAll());
    }
}
