package br.edu.ufabc.forum.util;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageResource {

	private Locale locale;

	private final String defaultMessage = ">> Message Not Found For Key %s <<";

	@Autowired
	private MessageSource messageSource;

	public String get(String key, Locale locale) {
		return messageSource.getMessage(key, null, String.format(defaultMessage, key), locale);
	}

	public String get(String key, Object[] params, Locale locale) {
		return messageSource.getMessage(key, params, String.format(defaultMessage, key), locale);
	}

	public String get(String key) {
		return messageSource.getMessage(key, null, String.format(defaultMessage, key), locale);
	}

	public String get(String key, Object[] params) {
		return messageSource.getMessage(key, params, String.format(defaultMessage, key), locale);
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
