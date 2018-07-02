package org.ipph.demo.service;

import java.util.List;

import org.ipph.demo.entity.Dept;

public interface DeptService {
	public boolean add(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
}
