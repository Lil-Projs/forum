package br.edu.ufabc.forum.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Collaborator implements UserDetails {

	private static final long serialVersionUID = 1375218632615945458L;
	
	@Id
	@Column(length = 255, nullable = false, unique = true)
	private String username;
	@Column(length = 511, nullable = false)
	private String password;
	@Column(length = 255, nullable = false)
	private String name;
	private Boolean accountExpired;
	private Boolean accountLocked;
	private Boolean credentialsExpired;
	private Boolean enabled;

	@ManyToOne(targetEntity = GameficationLevel.class)
	private GameficationLevel gameficationLevel;
	@OneToMany
	private Set<Content> contents;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameficationLevel getGameficationLevel() {
		return gameficationLevel;
	}

	public void setGameficationLevel(GameficationLevel gameficationLevel) {
		this.gameficationLevel = gameficationLevel;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("collaborator"));
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
