package br.edu.ufabc.forum.config;

import org.apache.commons.lang3.CharEncoding;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Configurations for externalizing the project.
 * @author Giulio Denardi
 *
 */
@Configuration
@EnableAutoConfiguration
public class ExternationalizationConfig extends WebMvcAutoConfigurationAdapter { // NOPMD by giulio on 5/13/16 4:19 AM
	
	/**
	 * Message Source for delegating the messages' properties files
	 * to Spring and Thymeleaf.
	 * @return ReloadableResourceBundleMessageSource
	 */
	@Bean(name="messageSource")
	public ReloadableResourceBundleMessageSource messageSource() {
		final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages/messages");
		messageSource.setDefaultEncoding(CharEncoding.UTF_8);
		messageSource.setCacheSeconds(3600);
		return messageSource;
	}
	
	/**
	 * Interceptor that will be used to change the language/locale by query parameter.
	 * @return LocaleChangeInterceptor
	 */
	@Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        final LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
	
	/**
	 * Adds this LocaleChangeInterceptor to the build's interceptors.
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

}
