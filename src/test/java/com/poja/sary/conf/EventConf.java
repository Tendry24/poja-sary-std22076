package com.poja.sary.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.sary.PojaGenerated;

@PojaGenerated
public class EventConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.region", () -> "dummy-region");
    registry.add("aws.sqs.queue.url", () -> "dummy-queue-url");
    registry.add("aws.eventBridge.bus", () -> "dummy-bus-url");
  }
}
