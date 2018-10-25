package com.yuan.springdataelasticsearch.service;

import org.elasticsearch.action.ActionFuture;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

	@Autowired
	private TestService testService;

	@Test
	public void saveOne() throws UnknownHostException {

//		Map<String, String> m = new HashMap<String, String>();
//
// 		Settings settings =Settings.builder().put("cluster.name", "elasticsearch").build();
//
//		InetAddress addr = InetAddress.getByName("47.107.108.245");
//		InetSocketAddress ip=new InetSocketAddress(addr, 9300);
//		TransportAddress transportAddress = new TransportAddress(ip);
//		TransportClient client=new PreBuiltTransportClient(settings).addTransportAddress(transportAddress);
//
//		ActionFuture al = client.get(new GetRequest().index("sdktest-2018.10.25"));
//		System.out.println(al);
		testService.saveOne();
	}

	@Test
	public void listAll(){
		testService.listAll();
	}
}