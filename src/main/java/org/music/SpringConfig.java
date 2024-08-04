package org.music;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.music")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
