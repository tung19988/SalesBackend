package com.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entyti.Decentraliza;

@Service
public interface DecentralizaDao {
	public List<Decentraliza> find();
}
