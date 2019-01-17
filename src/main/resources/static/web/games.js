var data;

var mails = [];

        fetch("/api/games", {
            method: "GET",


        }).then(function (response) {
            if (response.ok) {
                return response.json();
            }

        }).then(function (json) {
            data = json;

           createlist();

        }).catch(function (error) {
            console.log("Request failed:" + error.message);
        });

function createlist() {

        var allplay = data;

        console.log(allplay);

        var lista = document.getElementById("listaid");

        for (var l=0; l < allplay.length; l++) {

            var created = allplay[l].created;

            var allemail = allplay[l].gamePlayers;

            var full = document.createElement("li");


            for (var e=0; e < allemail.length; e++) {

               var emails = allemail[e].player.email;

               mails.push(emails);

               console.log(mails);

               console.log(emails);

            }

             full.innerHTML = created + ":" + mails.splice(0,2);

             lista.appendChild(full);

        }



    }