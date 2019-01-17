package com.codeoftheweb.salvo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GamePlayer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
        @GenericGenerator(name = "native", strategy = "native")
        private long id;
        private Date date = new Date();

        public GamePlayer () {
        }

        public GamePlayer(Game game, Player player) {
        this.game = game;
        this.player = player;
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


        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="player_id")
        private Player player;

        public Player getPlayer() {
                return player;
        }

        public void setPlayer(Player player) {
                this.player = player;
        }


        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="game_id")
        private Game game;

        public Game getGame() {
                return this.game;
        }

        public void setGame(Game game) {
                this.game = game;
        }


        @OneToMany(mappedBy="gamePlayer", fetch=FetchType.EAGER)
        Set<Ship> ships = new HashSet<>();

        @JsonIgnore
        public Set<Ship> getShip() {
                return this.ships;
        }

        public void addShip(Ship ship) {
                ship.setGamePlayer(this);
                ships.add(ship);
        }

    }


