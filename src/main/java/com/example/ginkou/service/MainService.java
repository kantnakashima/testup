package com.example.ginkou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.ginkou.model.UsresetModel;
import com.example.ginkou.repository.MainRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MainService {

	@Autowired
	private MainRepository repository;

	/**
	 * @return List<UsresetModel>
	 */
	public List<UsresetModel> getUsresetModelList() {
	    List<UsresetModel> entityList = this.repository.findAll();
	    return entityList;
	}

	/**
	 * 詳細データの取得
	 * @param @NonNull Long index
	 * @return  AddressBook
	 */
	public UsresetModel get(@NonNull Long index) {
		UsresetModel UsresetModel = this.repository.findById(index).orElse(new UsresetModel());
		return UsresetModel;
	}

	/**
	 * アドレス帳データの保存
	 * @param 
	 */
	public void save(@NonNull UsresetModel UsresetModel) {
		this.repository.save(UsresetModel);
	}

	/**
	 * アドレス帳データの削除
	 * @param @NonNull Long index
	 */
	public void delete(@NonNull Long index) {
		this.repository.deleteById(index);
	}
}
