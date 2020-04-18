package kg.internet.controller;

import kg.internet.entity.Provider;
import kg.internet.model.ProviderCreateRequest;
import kg.internet.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @PostMapping
    public Provider create(@RequestBody Provider provider){
        return providerService.create(provider);
    }
    @GetMapping
    public List<Provider> getAll(){
        return providerService.getAll();}
        @PostMapping("/short")
                public  Provider createByModel(@RequestBody ProviderCreateRequest request){
        return providerService.createByModel(request);
        }
}
