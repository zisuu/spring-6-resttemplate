package ch.finecloud.spring6resttemplate.client;

import ch.finecloud.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {
    Page<BeerDTO> listBeers();
}
