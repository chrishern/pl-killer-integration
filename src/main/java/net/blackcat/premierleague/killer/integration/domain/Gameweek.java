/**
 * 
 */
package net.blackcat.premierleague.killer.integration.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Domain class storing a week within a particular game.
 * 
 * @author Chris
 *
 */
@Entity
public class Gameweek implements Serializable {

	private static final long serialVersionUID = -729410151016701314L;

	@OneToMany
	private List<GameweekPick> gameweekPicks;
}
