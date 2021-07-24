package com.rvillarroel.jogobonito;
 
 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month; 
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JogobonitoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JogobonitoApplication.class, args); 

		
		Team oscarBenavidez = new Team("Oscar Benavidez", LocalDateTime.now());
		Team crisantoArnez = new Team("Crisanto Arnez",  LocalDateTime.now());
		
		List<Player> playersBenavidez = List.of(new Player("Ronny", "Villarroel", LocalDate.of(1984, Month.JULY, 31),oscarBenavidez),
										new Player("Oliver", "Villarroel", LocalDate.of(1986, Month.FEBRUARY, 2),oscarBenavidez),
										new Player("Pablo Alfredo", "Arce Diaz", LocalDate.of(1984, Month.FEBRUARY, 2),oscarBenavidez),
										new Player("Miguel", "Mendoza", LocalDate.of(1971, Month.JANUARY, 1),oscarBenavidez),
										new Player("Mauricio", "Bravo", LocalDate.of(1981, Month.JANUARY, 1),oscarBenavidez),
										new Player("Sossa Padilla", "Danny Omar", LocalDate.of(1982, Month.JANUARY, 1),oscarBenavidez)
										);

		List<Player> playersCrisantoArnez = List.of(new Player("Ronny", "Villarroel", LocalDate.of(1984, Month.JULY, 31), crisantoArnez ),
										new Player("Oliver", "Villarroel", LocalDate.of(1986, Month.FEBRUARY, 2),crisantoArnez),
										new Player("Pablo Alfredo", "Arce Diaz", LocalDate.of(1984, Month.FEBRUARY, 2), crisantoArnez),
										new Player("Miguel", "Mendoza", LocalDate.of(1971, Month.JANUARY, 1), crisantoArnez),
										new Player("Mauricio", "Bravo", LocalDate.of(1981, Month.JANUARY, 1), crisantoArnez),
										new Player("Sossa Padilla", "Danny Omar", LocalDate.of(1982, Month.JANUARY, 1), crisantoArnez)
										);								


		Game game = new Game("Benavidez vs CrisantoArnez 1ra fecha", LocalDate.of(1982, Month.JANUARY, 1));
		
		List<Team> teams = new ArrayList<>();
		
		teams.add(crisantoArnez);
		teams.add(oscarBenavidez);
		
		game.setTeams(teams); 

		game.setPlayers(playersBenavidez);
		game.setPlayers(playersCrisantoArnez);


		System.out.println(game.toString());	 
	}

}
