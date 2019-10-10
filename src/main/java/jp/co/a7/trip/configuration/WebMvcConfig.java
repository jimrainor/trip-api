
package jp.co.a7.trip.configuration;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jp.co.a7.trip.configuration.filter.CosrFilter;
import jp.co.a7.trip.utils.JSONUtility;

/**
 * Spring Mvc設定
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder() {
        return JSONUtility.builder;
    }

    @Bean
    public Filter cosrFilter() {
      return new CosrFilter();
    }

}
