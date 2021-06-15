package com.kosta.springbootproject.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.springbootproject.model.ClassHistory;
import com.kosta.springbootproject.model.Classes;
import com.kosta.springbootproject.model.Course;
import com.kosta.springbootproject.persistence.ClassHistoryRepository;
import com.kosta.springbootproject.persistence.ClassesRepository;

@Service
public class AdminManageClassService {
	
	@Autowired
	ClassesRepository classrepo;
	@Autowired
	ClassHistoryRepository classhistoryrepo;
	
	public List<Classes> selectAll(){
		return (List<Classes>) classrepo.findAll();
	}
	
	public List<ClassHistory> findClassHistoryByClasses(Long classNo){
		Classes classes = Classes.builder()
				.classNo(classNo)
				.build();
		List<ClassHistory> HistoryList = classhistoryrepo.findByClasses(classes);
		return HistoryList;
	}
}