package com.lick.agenttest;

import com.lick.agenttest.example.ByteBuddyExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgentTestApplication {

	public static void main(String[] args) {
		System.out.printf("this is main\n");
		AgentTestApplication agent = new AgentTestApplication();
		agent.fun1();
		ByteBuddyExample example = new ByteBuddyExample();
		example.load();
//		SpringApplication.run(AgentTestApplication.class, args);
	}
	public void fun1() {
		System.out.printf("this is func1\n");
	}
}
