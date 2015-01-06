/**
 * 
 */
package net.blackcat.premierleague.killer.integration.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Domain class representing a player within the game.
 * 
 * @author Chris
 *
 */
@Entity
public class Player implements Serializable {

	private static final long serialVersionUID = -6524946946890372346L;

	@OneToMany
	private List<League> leagues;
}
