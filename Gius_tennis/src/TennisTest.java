import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dius.tennis.Match;

/**
 * 
 */

/**
 * @author pengwang
 *
 */
class TennisTest {



	@Test
	void test() {
		Match match = new Match("player 1", "player 2");
		  match.pointWonBy("player 1");
		  match.pointWonBy("player 2");
		  // this will return "0-0, 15-15"
		  match.score();

		  match.pointWonBy("player 1");
		  match.pointWonBy("player 1");
		  // this will return "0-0, 40-15"
		  match.score();
		  
		  match.pointWonBy("player 2");
		  match.pointWonBy("player 2");
		  // this will return "0-0, Deuce"
		  match.score();
		  
		  match.pointWonBy("player 1");
		  // this will return "0-0, Advantage player 1"
		  match.score();
		  
		  match.pointWonBy("player 1");
		  // this will return "1-0"
		  match.score();
		 
	}
	@Test
	public void SevenToFive() {
		Match match = new Match("player 1", "player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();

		assertEquals("0- 0,Deuce ",match.getScore());
		
		
	}
	@Test
	public void TieGamesTest() {
		Match match = new Match("player 1", "player 2");
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		
		//tie-breaker 
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 1");
		match.score();
		match.pointWonBy("player 2");
		match.score();
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.score();
	}

}
