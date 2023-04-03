package ba.etf.rma22.rma23_18957

import java.util.Collections.emptyList




class GameData {
    companion object{
        fun getAll(): List<Game>{
            return listOf(Game("Grand Theft Auto V","Nitendo Switch","3.3.2017",7.5,"gta.jpg","E10+","Nitendo","Nitendo","Action","Grand Theft Auto V is a 2013 action-adventure game developed by Rockstar North and published by Rockstar Games.",
                listOf(UserRating("derek123", 1656829319000,8.3),
                    UserRating("leo", 1656829319001,5.1),
                    UserRating("xoxoitsjenny", 1656829319002,6.7),
                    UserRating("hypocrite", 1656829319003,9.5),
                    UserRating("lizzy04", 1656829319004,8.4),
                UserReview("Sammy",1656829319005,"Best game ever."),
                    UserReview("obsessed",1656829319006,"Not the best version of GTA, but ok."),
                    UserReview("lelezel",1656829319007,"One of the best games I've ever played."),
                    UserReview("hailey",1656829319008,"Too expensive for a game that is so boring"),
                    UserReview("gamer444",1656829319009,"Best storyline and missions.")
                    )),
            Game("World of Warships","PC","7.8.2015",7.0,"world_of_warships.jpg",
            "E10+","Wargaming.dev","Wargaming Inc.","Action-drama","Immerse yourself in thrilling naval battles and assemble an armada of over 600 ships from the first half of the 20th century — from stealthy destroyers to gigantic battleships. Change the look of your ship, choose upgrades to suit your play style, and go into battle with other players!",
                listOf(UserRating("loveanime",1656829319009,6.2),
                    UserRating("playFair",1656829319008,8.3),
                    UserRating("gamer231",1656829319007,7.6),
                    UserRating("gamer512",1656829319006,8.0),
                    UserRating("john2121",1656829319005,6.0),
                    UserReview("pal124",1656829319004,"Mediocre game"),
                    UserReview("mountainDew",1656829319003,"Interesting plot with great ships."),
                    UserReview("firemaker121",1656829319002,"A bit boring after playing long times, but okay plot"),
                    UserReview("gamer434",1656829319001,"Amazing game with incredible graphics and storyline."),
                    UserReview("eagarTiger",1656829319000,"One of the best games I've ever played! Highly recommended."))
                ),
            Game("Fortnite","PC","2.3.2017",8.0,"fortnite.jpg","mature","Fortnite","Fortnite","Action role-playing","Grab all of your friends and drop into Epic Games' Fortnite, a massive 100-player face-off that combines looting, crafting, shootouts and chaos.",
                listOf()),
                Game("The Sims 4","PlayStation","14.9.2014",9.0,"sims4.jpg","E10+","EA games devs","EA Games","Lifestyle","The Sims 4 is the ultimate life simulation game—create unique characters, build dream homes, and let chaos unfold.",
                    listOf()),
                Game("Nitro Nation","PC","7.7.2012",5.0,"nitro_nation.jpg","ER10+","nitroGames","Nitro Inc.","Racing","Nitro Nation takes drag and drift racing to the next level with a 3D world full of stunning new customizable cars, amazing racing physics, and unlimited in-depth gameplay that guarantees racers an unforgettable experience, all on your mobile device!",
                    listOf()),
                Game("Angry Birds 2","Mobile","13.4.2015",6.0,"angry_birds_2.jpg","ER","AngryBirds","AngryBirds","Puzzle, Action","Master the slingshot to take on the pigs and competitors around the world. Rule the leaderboards! Build the ultimate flock!",
                    listOf()),
                Game("Minecraft","Nitendo","6.6.2013",7.0,"minecraft.jpg","ER10+","Java","Mojang Games","Sandbox survival","Minecraft is a game about placing blocks and going on adventures. Explore randomly generated worlds and build amazing things from the simplest of homes to portals and worlds",
                    listOf()),
                Game("League of Legends","PC","12.4.2018",8.0,"league_of_legends.jpg","18+","Riot Games","Gamers","Action","League of Legends is one of the world's most popular video games that features a team-based competitive game mode based on strategy and outplaying opponents. Players work with their team to break the enemy Nexus before the enemy team breaks theirs.",
                    listOf()),
                Game("Super Mario Odyssey","Nintendo Switch",
                  "27.10.2017",
                  8.0,
                    "super_mario.jpg",
                    "Everyone",
                   "Nintendo",
                     "Nintendo",
                     "Platformer",
                     "Join Mario on a massive, globe-trotting 3D adventure and use his incredible abilities to collect Moons so you can power up your airship, the Odyssey, and rescue Princess Peach from Bowser's wedding plans! This sandbox-style 3D Mario adventure—the first since 1996's beloved Super Mario 64 and 2002's Nintendo GameCube classic Super Mario Sunshine—is packed with secrets and surprises, and with Mario's new moves like cap throw, cap jump, and capture, you'll have fun and exciting gameplay experiences unlike anything you've enjoyed in a Mario game before.",
                     emptyList()
                )
                ,
                Game(
                    "The Legend of Zelda",
                  "Nintendo Switch",
                "3.3.2017",
            9.0,
            "league_of_legends.jpg",
            "Everyone 10+",
            "Nintendo EPD",
            "Nintendo",
           "Action-adventure",
                "Step into a world of discovery, exploration, and adventure in The Legend of Zelda: Breath of the Wild, a boundary-breaking new game in the acclaimed series. Travel across vast fields, through forests, and to mountain peaks as you discover what has become of the kingdom of Hyrule in this stunning open-air adventure. Now on the Nintendo Switch console, your journey is freer and more open than ever. Take your system anywhere, and adventure as Link any way you like.",
           emptyList())
            )
        }
       fun getDetails(title:String): Game? {
          var games= getAll();
          return games.filter { x->x.title==title }?.get(0)
       }
    }
}