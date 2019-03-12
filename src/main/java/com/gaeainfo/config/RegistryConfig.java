package com.gaeainfo.config;

import com.gaeainfo.service.ServiceRegistry;
import com.gaeainfo.service.ServiceRegistryImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "registry")
public class RegistryConfig {
    private String servers;

    @Bean
    public ServiceRegistry serviceRegistry(){
        return new ServiceRegistryImpl(servers);
    }

    public void setServers(String servers){
        this.servers = servers;
    }

}
