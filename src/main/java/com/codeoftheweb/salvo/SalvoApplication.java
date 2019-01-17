package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SalvoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepository repository, GameRepository repository2, GamePlayerRepository repository3, ShipRepository repository4) {
		return (args) -> {

		Player p1 = new Player ("Jack","j.bauer@ctu.gov");
		repository.save(p1);
		Player p2 = new Player("Chloe","c.obrian@ctu.gov");
		repository.save(p2);
		Player p3 = new Player("Kim","kim_bauer@gmail.com");
		repository.save(p3);
		Player p4 = new Player("Tony", "t.almeida@ctu.gov");
		repository.save(p4);


		Game g1 = new Game ();
		repository2.save(g1);
		Game g2 = new Game ();
		repository2.save(g2);
		Game g3 = new Game ();
		repository2.save(g3);
		Game g4 = new Game ();
		repository2.save(g4);
		Game g5 = new Game ();
		repository2.save(g5);
		Game g6 = new Game ();
		repository2.save(g6);
		Game g7 = new Game ();
		repository2.save(g7);
		Game g8 = new Game ();
		repository2.save(g8);

		GamePlayer gm1 = new GamePlayer (g1, p1);
		repository3.save(gm1);
		GamePlayer gm2 = new GamePlayer (g1, p2);
		repository3.save(gm2);
		GamePlayer gm3 = new GamePlayer (g2, p1);
		repository3.save(gm3);
		GamePlayer gm4 = new GamePlayer (g2, p2);
		repository3.save(gm4);
		GamePlayer gm5 = new GamePlayer (g3, p2);
		repository3.save(gm5);
		GamePlayer gm6 = new GamePlayer (g3, p4);
		repository3.save(gm6);
		GamePlayer gm7 = new GamePlayer (g4, p2);
		repository3.save(gm7);
		GamePlayer gm8 = new GamePlayer (g4, p1);
		repository3.save(gm8);
		GamePlayer gm9 = new GamePlayer (g5, p4);
		repository3.save(gm9);
		GamePlayer gm10 = new GamePlayer (g5, p1);
		repository3.save(gm10);
		GamePlayer gm11 = new GamePlayer (g6, p3);
		repository3.save(gm11);
		GamePlayer gm13 = new GamePlayer (g7, p4);
		repository3.save(gm13);
		GamePlayer gm15 = new GamePlayer (g8, p3);
		repository3.save(gm15);
		GamePlayer gm16 = new GamePlayer (g8, p4);
		repository3.save(gm16);

		List<String> locations1 = Arrays.asList("H2", "H3", "H4");
		List<String> locations2 = Arrays.asList("E1", "F1", "G1");
		List<String> locations3 = Arrays.asList("B4", "B5");
		List<String> locations4 = Arrays.asList("B5", "C5", "D5");
		List<String> locations5 = Arrays.asList("F1", "F2");
		List<String> locations6 = Arrays.asList("B5", "C5", "D5");
		List<String> locations7 = Arrays.asList("C6", "C7");
		List<String> locations8 = Arrays.asList("A2", "A3", "A4");
		List<String> locations9 = Arrays.asList("G6", "H6");
		List<String> locations10 = Arrays.asList("B5", "C5", "D5");
		List<String> locations11 = Arrays.asList("C6", "C7");
		List<String> locations12 = Arrays.asList("A2", "A3", "A4");
		List<String> locations13 = Arrays.asList("G6", "H6");
		List<String> locations14 = Arrays.asList("B5", "C5", "D5");
		List<String> locations15 = Arrays.asList("C6", "C7");
		List<String> locations16 = Arrays.asList("A2", "A3","A4");
		List<String> locations17 = Arrays.asList("G6", "H6");
		List<String> locations18 = Arrays.asList("B5", "C5", "D5");
		List<String> locations19 = Arrays.asList("C6", "C7");
		List<String> locations20 = Arrays.asList("A2", "A3", "A4");
		List<String> locations21 = Arrays.asList("G6", "H6");
		List<String> locations22 = Arrays.asList("B5", "C5", "D5");
		List<String> locations23 = Arrays.asList("C6", "C7");
		List<String> locations24 = Arrays.asList("B5", "C5", "D5");
		List<String> locations25 = Arrays.asList("C6", "C7");
		List<String> locations26 = Arrays.asList("A2", "A3", "A4");
		List<String> locations27 = Arrays.asList("G6", "H6");

		Ship s1 = new Ship ("Destroyer", gm1, locations1);
		repository4.save(s1);
		Ship s2 = new Ship ("Submarine", gm1, locations2);
		repository4.save(s2);
		Ship s3 = new Ship ("Patrol Boat", gm1, locations3);
		repository4.save(s3);
		Ship s4 = new Ship ("Destroyer", gm2, locations4);
		repository4.save(s4);
		Ship s5 = new Ship ("Patrol Boat", gm2, locations5);
		repository4.save(s5);
		Ship s6 = new Ship ("Destroyer", gm3, locations6);
		repository4.save(s6);
		Ship s7 = new Ship ("Patrol Boat", gm3, locations7);
		repository4.save(s7);
		Ship s8 = new Ship ("Submarine", gm4, locations8);
		repository4.save(s8);
		Ship s9 = new Ship ("Patrol Boat", gm4, locations9);
		repository4.save(s9);
		Ship s10 = new Ship ("Destroyer", gm5, locations10);
		repository4.save(s10);
		Ship s11 = new Ship ("Patrol Boat", gm5, locations11);
		repository4.save(s11);
		Ship s12 = new Ship ("Submarine", gm6, locations12);
		repository4.save(s12);
		Ship s13 = new Ship ("Patrol Boat", gm6, locations13);
		repository4.save(s13);
		Ship s14 = new Ship ("Destroyer", gm7, locations14);
		repository4.save(s14);
		Ship s15 = new Ship ("Patrol Boat", gm7, locations15);
		repository4.save(s15);
		Ship s16 = new Ship ("Submarine", gm8, locations16);
		repository4.save(s16);
		Ship s17 = new Ship ("Patrol Boat", gm8, locations17);
		repository4.save(s17);
		Ship s18 = new Ship ("Destroyer", gm9, locations18);
		repository4.save(s18);
		Ship s19 = new Ship ("Patrol Boat", gm9, locations19);
		repository4.save(s19);
		Ship s20 = new Ship ("Submarine", gm10, locations20);
		repository4.save(s20);
		Ship s21 = new Ship ("Patrol Boat", gm10, locations21);
		repository4.save(s21);
		Ship s22 = new Ship ("Destroyer", gm11, locations22);
		repository4.save(s22);
		Ship s23 = new Ship ("Patrol Boat", gm11, locations23);
		repository4.save(s23);
		Ship s24 = new Ship ("Destroyer", gm15, locations24);
		repository4.save(s24);
		Ship s25 = new Ship ("Patrol Boat", gm15, locations25);
		repository4.save(s25);
		Ship s26 = new Ship ("Submarine", gm16, locations26);
		repository4.save(s26);
		Ship s27 = new Ship ("Patrol Boat", gm16, locations27);
		repository4.save(s27);

		};
	}

}

