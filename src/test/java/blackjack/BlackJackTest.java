package blackjack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackJackTest {
	static BlackJack bj;

	@BeforeClass
	public static void setUp() {
		System.out.println("Testing Started!");
		bj = new BlackJack();
	}
	
	
	//Valid legal numbers
	@Test
	public void test1() {
		int player = 21;
		int dealer = 10;
		assertEquals("Expected 21p: ",bj.play(player,dealer),"21p");
	}
	
	@Test
	public void test2() {
		int player = 10;
		int dealer = 21;
		assertEquals("Expected 21d: ",bj.play(player,dealer),"21d");
	}
	
	@Test
	public void test3() {
		int player = 21;
		int dealer = 21;
		assertEquals("Expected 21d: ",bj.play(player,dealer),"21d");
	}
	
	@Test
	public void test4() {
		int player = 11;
		int dealer = 10;
		assertEquals("Expected 11p: ",bj.play(player,dealer),"11p");
	}
	
	@Test
	public void test5() {
		int player = 10;
		int dealer = 11;
		assertEquals("Expected 11d: ",bj.play(player,dealer),"11d");
	}
	
	@Test
	public void test6() {
		int player = 11;
		int dealer = 11;
		assertEquals("Expected 11d: ",bj.play(player,dealer),"11d");
	}
	
	///////////////////////////////////
	//illegal numbers
	
	@Test
	public void test7() {
		int player = 30;
		int dealer = 22;
		assertEquals("Expected 0: ",bj.play(player,dealer),"0");
	}
	
	@Test
	public void test8() {
		int player = 22;
		int dealer = 30;
		assertEquals("Expected 0: ",bj.play(player,dealer),"0");
	}
	
	@Test
	public void test9() {
		int player = 30;
		int dealer = 30;
		assertEquals("Expected 0: ",bj.play(player,dealer),"0");
	}
	
	@Test
	public void test10() {
		int player = 22;
		int dealer = 22;
		assertEquals("Expected 0: ",bj.play(player,dealer),"0");
	}
	///////////////////////////////////
	//invalid numbers
	
	@Test
	public void test11() {
		int player = 3;
		int dealer = 3;
		assertEquals("Expected -1: ",bj.play(player,dealer),"-1");
	}
	
	@Test
	public void test12() {
		int player = 31;
		int dealer = 31;
		assertEquals("Expected -1: ",bj.play(player,dealer),"-1");
	}
	
	@Test
	public void test13() {
		int player = 21;
		int dealer = 3;
		assertEquals("Expected 21p: ",bj.play(player,dealer),"21p");
	}
	
	@Test
	public void test14() {
		int player = 3;
		int dealer = 21;
		assertEquals("Expected 21d: ",bj.play(player,dealer),"21d");
	}

}
