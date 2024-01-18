package com.sriram006.kafka_producer.kafka_producer_example.kafka_configaration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	@Bean
	  public NewTopic topic1() {
	    return TopicBuilder.name("reflectoring-1").build();
	  }

	  @Bean
	  public NewTopic topic2() {
	    return TopicBuilder.name("reflectoring-2").build();
	  }
}
