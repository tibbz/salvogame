package com.codeoftheweb.salvo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@Entity
public class Game {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
        @GenericGenerator(name = "native", strategy = "native")
        private long id;
        private Date date = new Date();



        @OneToMany(mappedBy="game", fetch=FetchType.EAGER)
        Set<GamePlayer> gamePlayers = new HashSet<>();

        @JsonIgnore
        public Set<GamePlayer> getGamePlayer() {
        return this.gamePlayers;
        }

        public void addGamePlayer(GamePlayer gamePlayer) {
        gamePlayer.setGame(this);
        gamePlayers.add(gamePlayer);
        }





        public List<Player> getPlayers() {
        return gamePlayers.stream().map(sub -> sub.getPlayer()).collect(toList());
        }

        public Game () {

        }

        public Date getDate() {
            return this.date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public long getId() {
            return this.id;
        }

        public void setId(long id) {
        this.id = id;
        }


    }
