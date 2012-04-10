import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Test;

public class PrintBalanceTest {

	@Test
	public void testGermanGreeting() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Hallo", PB.getTranslation("greetings"));
	}

	@Test
	public void testGermanInquiry() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Wie geht's?", PB.getTranslation("inquiry"));
	}

	@Test
	public void testGermanName() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Bitte geben Sie Ihren Namen",
				PB.getTranslation("enterName"));
	}

	@Test
	public void testGermanPleased() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Ich freue mich, Sie kennen zu lernen",
				PB.getTranslation("pleased"));
	}

	@Test
	public void testGermanAsOf() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Stand:", PB.getTranslation("asOf"));
	}

	@Test
	public void testGermanOwe() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Sie Ehrfurcht die Schule", PB.getTranslation("owe"));
	}
	
	@Test
	public void testGermanFarewell() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("Auf wiedersehen", PB.getTranslation("farewell"));
	}

	@Test
	public void testGermanDate() {
		Date date = new Date();
		PrintBalance PB = new PrintBalance("de", "DE", date);
		assertEquals(DateFormat.getDateTimeInstance().format(date),
				PB.getDate(date));
	}

	public void testGermanMoney() {
		PrintBalance PB = new PrintBalance("de", "DE", new Date());
		assertEquals("876.543,21 €", PB.getMoney(876543.21));
	}

	@Test
	public void testUSGreeting() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("Hello", PB.getTranslation("greetings"));
	}

	@Test
	public void testUSInquiry() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("How are you?", PB.getTranslation("inquiry"));
	}

	@Test
	public void testUSName() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("Please enter your name", PB.getTranslation("enterName"));
	}

	@Test
	public void testUSPleased() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("I am pleased to meet you", PB.getTranslation("pleased"));
	}

	@Test
	public void testUSAsOf() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("As of : ", PB.getTranslation("asOf"));
	}

	@Test
	public void testUSOwe() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("You awe the school", PB.getTranslation("owe"));
	}
	
	@Test
	public void testUSFarewell() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("Goodbye", PB.getTranslation("farewell"));
	}

	@Test
	public void testUSDate() {
		Date date = new Date();
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals(DateFormat.getDateTimeInstance().format(date),
				PB.getDate(date));
	}

	public void testUSMoney() {
		PrintBalance PB = new PrintBalance("en", "US", new Date());
		assertEquals("$9876543.21", PB.getMoney(876543.21));
	}

	@Test
	public void testFrenchGreeting() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("Bonjour", PB.getTranslation("greetings"));
	}

	@Test
	public void testFrenchInquiry() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("Comment allez-vous", PB.getTranslation("inquiry"));
	}

	@Test
	public void testFrenchName() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("S'il vous plaît entrer votre nom",
				PB.getTranslation("enterName"));
	}

	@Test
	public void testFrenchPleased() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("Je suis heureux de vous rencontrer",
				PB.getTranslation("pleased"));
	}

	@Test
	public void testFrenchAsOf() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("En date du: ", PB.getTranslation("asOf"));
	}

	@Test
	public void testFrenchOwe() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("Vous crainte de l'école ", PB.getTranslation("owe"));
	}
	
	@Test
	public void testFrenchFarewell() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("au revoir", PB.getTranslation("farewell"));
	}

	@Test
	public void testFrenchDate() {
		Date date = new Date();
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals(DateFormat.getDateTimeInstance().format(date),
				PB.getDate(date));
	}

	@Test
	public void testFrenchMoney() {
		PrintBalance PB = new PrintBalance("fr", "FR", new Date());
		assertEquals("876 543,21 €", PB.getMoney(876543.21));
	}
	


}
