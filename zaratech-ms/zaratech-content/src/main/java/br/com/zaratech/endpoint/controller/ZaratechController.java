package br.com.zaratech.endpoint.controller;

import br.com.zaratech.core.model.Zaratech;
import br.com.zaratech.endpoint.service.ZaratechService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/admin/zaratech")
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ZaratechController {
	
	private final ZaratechService zaratechService;
	
	@SuppressWarnings("deprecation")
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<Zaratech>> list(Pageable pageable) {
		log.info("ReponseEntity!");
		return new ResponseEntity<>(zaratechService.list(pageable), HttpStatus.OK);
	}
}
