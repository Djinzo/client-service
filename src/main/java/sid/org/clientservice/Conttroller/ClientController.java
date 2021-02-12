package sid.org.clientservice.Conttroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sid.org.clientservice.Entity.Client;
import sid.org.clientservice.Repositorys.ClientRepostorys;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepostorys clientRepostorys;

    @GetMapping("clients")
    public List<Client> getClients(){
        return clientRepostorys.findAll();
    }

    @GetMapping("client/{id}")
    public Client getClient(@PathVariable("id") Long id){
        return clientRepostorys.getOne(id);
    }

    @PostMapping("client")
    public Client addClient(@RequestBody Client c){
        return clientRepostorys.save(c);
    }
}
