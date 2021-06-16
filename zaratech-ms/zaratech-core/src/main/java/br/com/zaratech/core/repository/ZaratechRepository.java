package br.com.zaratech.core.repository;

import br.com.zaratech.core.model.Zaratech;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ZaratechRepository extends PagingAndSortingRepository<Zaratech, Long> {

}
