/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Doc
 * Author:   Administrator
 * Date:     2018/10/25 0025 20:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yuan.springdataelasticsearch.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


/**
 * 〈〉
 **
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
@Data
@ToString
@Document(indexName = "sdktest-2018.10.25", type = "doc")
public class Doc {

	@Id
	private String id;

	private String source;

	private String imageType;

	private String personName;

	private String fileName;

	private String age;

	private String faceRect;


}