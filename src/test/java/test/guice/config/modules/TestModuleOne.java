package test.guice.config.modules;

import java.util.concurrent.atomic.AtomicInteger;

public class TestModuleOne extends TestAbstractModule {
  public static AtomicInteger counter = new AtomicInteger(0);

  public TestModuleOne() {
    super(counter);
  }
}
