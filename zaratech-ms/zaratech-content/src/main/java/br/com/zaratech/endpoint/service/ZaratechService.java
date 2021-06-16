package br.com.zaratech.endpoint.service;

import br.com.zaratech.core.model.Zaratech;
import br.com.zaratech.core.repository.ZaratechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ZaratechService {
	
	private final ZaratechRepository zaratechRepository;
	
	public Iterable<Zaratech> list (Pageable pageable){
		log.info("Exibir todos dados!");
		return zaratechRepository.findAll(pageable); 
	}
}