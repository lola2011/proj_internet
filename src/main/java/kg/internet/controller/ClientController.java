package kg.internet.controller;

import kg.internet.entity.Client;
import kg.internet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }
    @GetMapping
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id){
        return clientService.findById(id);

    }
}
