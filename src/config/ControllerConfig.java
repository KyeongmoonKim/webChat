package config;
import org.springframework.context.annotation.*;
import controller.*;

@Configuration
public class ControllerConfig {
	
	@Bean
	public TestController testController() {
		return new TestController();
	}
	
	@Bean
	public WebSocketController webSocketController() {
		System.out.println("hi");
		return new WebSocketController();
	}
	
}
