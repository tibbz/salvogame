package com.codeoftheweb.salvo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toList;


@RestController
@RequestMapping("/api")
public class SalvoController {

        @Autowired
        private GameRepository repo;

        @Autowired
        private GamePlayerRepository repoGP;


        @RequestMapping("/games")
        public List<Object> showGames() {
                return repo.findAll().stream()
                        .map(game -> conGameDTO(game))
                        .collect(toList());
        }


        @RequestMapping("/game_view/{GPId}")
        public Map<String, Object> findGP(@PathVariable Long GPId) {
                GamePlayer GP = repoGP.findOne(GPId);
                        Game gamevar = GP.getGame();
                        Set<Ship> allships = GP.getShip();
                Map<String, Object> dto = new LinkedHashMap<>();
                dto.put("game", conGameDTO(gamevar));
                dto.put("ships", allships.stream()
                .map(ship -> conShipDTO(ship))
                        .collect(toList()));
                return dto;

        }

        //if loop, ignorejson
       // stream after map to manipulate data
        // collect to list to make data into list

        public Map<String, Object> conGameDTO(Game game) {
                Set<GamePlayer> gameplayers = game.getGamePlayer();
                Map<String, Object> dto = new LinkedHashMap<String, Object>();
                dto.put("id", game.getId());
                dto.put("created", game.getDate());
                dto.put("gamePlayers", gameplayers.stream()
                .map(gameplayer -> conGamePlayerDTO(gameplayer))
                .collect(toList()));
                return dto;
        }

        public Map<String, Object> conPlayerDTO(Player player) {
                Map<String, Object> dto = new LinkedHashMap<String, Object>();
                dto.put("id", player.getId());
                dto.put("email", player.getEmail());
                return dto;
        }

        public Map<String, Object> conGamePlayerDTO(GamePlayer gamePlayer) {
                Map<String, Object> dto = new LinkedHashMap<String, Object>();
                dto.put("id", gamePlayer.getId());
                dto.put("player", conPlayerDTO(gamePlayer.getPlayer()));
                return dto;
        }

        public Map<String, Object> conShipDTO(Ship ship) {
               Map<String, Object> dto = new LinkedHashMap<String, Object>();
               dto.put("shiptype", ship.getShiptype());
               dto.put("locations", ship.getLocations());
               return dto;
        }





}