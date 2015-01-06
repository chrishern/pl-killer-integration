/**
 * 
 */
package net.blackcat.premierleague.killer.integration.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Domain class representing an individual killer game played in a league.
 * 
 * @author Chris
 *
 */
@Entity
public class Game implements Serializable {

	private static final long serialVersionUID = 6855585641517948984L;

	@OneToMany
	private List<Gameweek> gameweeks;
}
