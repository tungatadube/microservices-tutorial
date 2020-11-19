package co.zw.movie.moviecatalogue.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class Configuration {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    @Qualifier("projectBuilder")
    public WebClient.Builder getWebClient(){
        return WebClient.builder();
    }
}
