package com.kosta.springbootproject.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.springbootproject.model.Certificate;
import com.kosta.springbootproject.persistence.CertificateRepository;

@Service
public class CertificateService {
	
	@Autowired
	CertificateRepository repo;
	
	public List<Certificate> selectAll(){
		return (List<Certificate>) repo.findAll();
	}
	
	public Certificate updateOrInsert(Certificate certi) {
		return repo.save(certi);
	}
}