/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ElasticsearchConfig
 * Author:   Administrator
 * Date:     2018/10/25 0025 21:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yuan.springdataelasticsearch.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.ElasticsearchClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;


/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
@Configuration
public class ElasticsearchConfig {

	@Bean(name = "elasticsearchTemplate")
	public ElasticsearchTemplate getElasticsearchTemplate(){
 		Settings settings =Settings.builder().put("cluster.name", "elasticsearch").build();
		InetAddress addr = null;
		try {
			addr = InetAddress.getByName("47.107.108.245");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		InetSocketAddress ip=new InetSocketAddress(addr, 9300);
		TransportAddress transportAddress = new TransportAddress(ip);
		TransportClient client=new PreBuiltTransportClient(settings).addTransportAddress(transportAddress);
		return new ElasticsearchTemplate(client);
	}

}