/**
 * 
 */
package net.blackcat.premierleague.killer.integration.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Domain class representing a league within killer.
 * 
 * @author Chris
 *
 */
@Entity
public class League implements Serializable {

	private static final long serialVersionUID = -7403313013730303698L;

	@OneToMany
	private List<Game> games;
}
