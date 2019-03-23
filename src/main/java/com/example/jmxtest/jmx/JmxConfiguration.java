package com.example.jmxtest.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "jmx-test-app:name=JmxConfiguration", description = "Switches for hsps, inspection framework, ras")
public class JmxConfiguration {

  private boolean prodMode = false;

  @ManagedAttribute
  public boolean isProd() {
    return prodMode;
  }

  @ManagedAttribute
  public void reverseMode() {
    prodMode = !prodMode;
  }
}
