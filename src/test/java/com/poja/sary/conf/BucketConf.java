package com.poja.sary.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.sary.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
