package com.rvillarroel.jogobonito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {


    Team oscarBenavidez;  
    //List<Player> playersBenavidez = new ArrayList<>();
    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;

        oscarBenavidez = new Team("Oscar Benavidez", LocalDateTime.now());

        playerRepository.saveAll(List.of(new Player("Ronny", "Villarroel", LocalDate.of(1984, Month.JULY, 31) ),
                new Player("Oliver", "Villarroel", LocalDate.of(1986, Month.FEBRUARY, 2) ),
                new Player("Pablo Alfredo", "Arce Diaz", LocalDate.of(1984, Month.FEBRUARY, 2) ),
                new Player("Miguel", "Mendoza", LocalDate.of(1971, Month.JANUARY, 1) ),
                new Player("Mauricio", "Bravo", LocalDate.of(1981, Month.JANUARY, 1) ),
                new Player("Sossa Padilla", "Danny Omar", LocalDate.of(1982, Month.JANUARY, 1) )
        ));

        /*playersBenavidez.addAll(List.of(new Player("Ronny", "Villarroel", LocalDate.of(1984, Month.JULY, 31),oscarBenavidez),
        new Player("Oliver", "Villarroel", LocalDate.of(1986, Month.FEBRUARY, 2),oscarBenavidez),
        new Player("Pablo Alfredo", "Arce Diaz", LocalDate.of(1984, Month.FEBRUARY, 2),oscarBenavidez),
        new Player("Miguel", "Mendoza", LocalDate.of(1971, Month.JANUARY, 1),oscarBenavidez),
        new Player("Mauricio", "Bravo", LocalDate.of(1981, Month.JANUARY, 1),oscarBenavidez),
        new Player("Sossa Padilla", "Danny Omar", LocalDate.of(1982, Month.JANUARY, 1),oscarBenavidez)
        ));*/
    }

    @GetMapping
    public Iterable<Player> getPlayers(){

        return playerRepository.findAll();//playersBenavidez;
    }

    @GetMapping("/{id}")
    public Optional<Player> getPlayerByName(@PathVariable String id){

//        for (Player p: playersBenavidez){
//            if(p.getId().equals(id)){
//                return Optional.of(p);
//            }
//        }
        return playerRepository.findById(id);//Optional.empty();
    }

    @PostMapping
    public Player postPlayer(@RequestBody Player player){
//        playersBenavidez.add(player);
        playerRepository.save(player);
        return player;
    }

    @PutMapping("/{id}")
    ResponseEntity<Player> putPlayer(@PathVariable String id, @RequestBody Player player) {
//    int PlayerIndex = -1;
//
//    for (Player c: playersBenavidez) {
//        if (c.getId().equals(id)) {
//            PlayerIndex = playersBenavidez.indexOf(c);
//            playersBenavidez.set(PlayerIndex, player);
//        }
//    }
//
//    return (PlayerIndex == -1)? new ResponseEntity<>(postPlayer(player), HttpStatus.CREATED)
//            : new ResponseEntity<>(player, HttpStatus.OK);

    return (!playerRepository.existsById(id))? new ResponseEntity<>(playerRepository.save(player), HttpStatus.CREATED):
            new ResponseEntity<>(playerRepository.save(player), HttpStatus.OK);
    
    }

    @DeleteMapping("/{id}")
    void deletePlayer(@PathVariable String id){
        //playersBenavidez.removeIf(p -> p.getId().equals(id));
        playerRepository.deleteById(id);
    }
    
}
