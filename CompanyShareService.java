package com.gl.springAssessment1.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springAssessment1.bean.CompanyShare;
import com.gl.springAssessment1.repository.CompanyShareRepository;

@Service
public class CompanyShareService {
	@Autowired
	private CompanyShareRepository repository;
	
	public void save(CompanyShare companyshare) {
		repository.save(companyshare);
	}
	public List<CompanyShare> findAll(){
		return repository.findAll();
	}
	public CompanyShare findById(Long id){
		return repository.getById(id);
	}
	public Long generateCompanyId() {
		Long val=repository.findMaxCompanyId();
		if(val==null)
			val=101L;
		else
			val=val+1;
		return val;
	}
	public void delete(long id) {
		repository.deleteById(id);
	}

}
	