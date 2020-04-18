package kg.internet.service;

import kg.internet.entity.Client;
import kg.internet.entity.Provider;
import kg.internet.model.ProviderCreateRequest;
import kg.internet.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderRepository providerRepository;
    @Autowired
    private ClientService clientService;

    @Override
    public Provider create(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public Provider createByModel(ProviderCreateRequest request) {
       Provider provider=new Provider();
       provider.setFee(request.getFee());
       provider.setName(request.getName());
        Client client=clientService.findById(request.getClientId());
        provider.setClient(client);
        return providerRepository.save(provider);
    }

    @Override
    public List<Provider> getAll() {
        return providerRepository.findAll();
    }
}
