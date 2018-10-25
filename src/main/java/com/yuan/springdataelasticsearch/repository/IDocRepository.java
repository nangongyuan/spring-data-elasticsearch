/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IDocRepository
 * Author:   Administrator
 * Date:     2018/10/25 0025 20:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yuan.springdataelasticsearch.repository;

import com.yuan.springdataelasticsearch.entity.Doc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
public interface IDocRepository extends ElasticsearchRepository<Doc,Integer> {

}
