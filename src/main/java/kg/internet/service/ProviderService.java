package kg.internet.service;

import kg.internet.entity.Provider;
import kg.internet.model.ProviderCreateRequest;

import java.util.List;

public interface ProviderService {
    Provider create(Provider provider);
    List<Provider> getAll();
    Provider createByModel(ProviderCreateRequest request);
}
