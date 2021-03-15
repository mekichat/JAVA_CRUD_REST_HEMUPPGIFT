package com.example.demo;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

// http-anrop 127.0.0.1:8080/player
@RestController
public class DemoController {

    @Autowired
	private PlayerRepository playerRepository;

    @GetMapping(path="/player")
    List<Player> getAllPlayers(){
        var player = new ArrayList<Player>();
        for(Player p1 : playerRepository.findAll()){
            player.add(p1);
        }
        return player;
    }

    @GetMapping(path="/player/{id}")
    Player getSinglePlayer(@PathVariable Integer id){        
        return playerRepository.findById(id).get();
    }

    @PostMapping(path="/player", consumes = "application/json", produces = "application/json")
    ResponseEntity<Object> addPlayer(@RequestBody Player p){
        playerRepository.save(p);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(p.getId())
        .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(path="/player/{id}", consumes = "application/json", produces = "application/json")
    Player updatePlayer(@PathVariable Integer id, @RequestBody Player updatePlayer){
        Player dbPlayer = playerRepository.findById(id).get();
        dbPlayer.setNamn(updatePlayer.getNamn());
        dbPlayer.setJersey(updatePlayer.getJersey());
        dbPlayer.setAge(updatePlayer.getAge());
        dbPlayer.setBorn(updatePlayer.getBorn());

        playerRepository.save(dbPlayer);       

        return dbPlayer;

    }

    @PatchMapping(path= "/player/{id}", consumes = "application/json")
    ResponseEntity<Void> partialPlayerUpdate(@PathVariable Integer id, @RequestBody Player updatePlayer) {

        Player dbPlayer = playerRepository.findById(id).get();

        try {
            if(updatePlayer.getNamn() != null){
                dbPlayer.setNamn(updatePlayer.getNamn());
    
            }
            if(updatePlayer.getAge()!= 0){ 
                dbPlayer.setAge(updatePlayer.getAge());
    
            }
            if(updatePlayer.getJersey()!= 0){ 
                dbPlayer.setJersey(updatePlayer.getJersey());
    
            }
            if(updatePlayer.getBorn() != null){
                dbPlayer.setBorn(updatePlayer.getBorn());
    
            } 
            
            playerRepository.save(dbPlayer);
            return ResponseEntity.ok().build(); 
            
        } catch (Exception ex) {
            //TODO: handle exception
            System.out.println(ex);
            return ResponseEntity.notFound().build();
        }
      
    }

    @DeleteMapping(path="/player/{id}", consumes = "application/json")
    ResponseEntity<Void> deletePlayer(@PathVariable Integer id){
        Player deletePlayer = playerRepository.findById(id).get();
        try {
            playerRepository.delete(deletePlayer);
            return ResponseEntity.ok().build(); 
        } catch (Exception ex) {
            //TODO: handle exception
            System.out.println(ex);
            return ResponseEntity.notFound().build();
        }        

    }

    

          
    
}
