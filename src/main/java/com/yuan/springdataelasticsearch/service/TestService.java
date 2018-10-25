/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TestService
 * Author:   Administrator
 * Date:     2018/10/25 0025 20:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yuan.springdataelasticsearch.service;

import com.yuan.springdataelasticsearch.entity.Doc;
import com.yuan.springdataelasticsearch.repository.IDocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
@Service
public class TestService {

	@Autowired
	private IDocRepository docRepository;

	public void saveOne(){
		Doc doc = new Doc();

		docRepository.save(doc);
	}

	public void listAll(){
		Iterator<Doc> iterator = docRepository.findAll().iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}