package com.blogger.user.configuration.others;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.blogger.user.util.AppProperties;

/**
 * Configures .properties files to be used by {@link AppProperties} class.
 *
 * @author Rohit
 */
@Configuration
@PropertySource("classpath:system.properties")
public class PropertyFileConfig {

    /**
     * @return
     */
    @Bean
    public PropertyPlaceholderConfigurer placeholderConfigurer() {
        final PropertyPlaceholderConfigurer configurer =
                new PropertyPlaceholderConfigurer();
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }

}
