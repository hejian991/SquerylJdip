package com.squeryl.jdip.creators

import com.squeryl.jdip.tables._

object PlayerCreator {
  private val players: Iterable[String] = (0 until 25) map ((u: Int) =>  "player%d" format u)
  private val passwords: Iterable[String] = (0 until 25) map ((u: Int) => "password%d" format u)

  def getPlayers(): Iterable[Player] = (players zip passwords) map 
    ((u: Tuple2[String, String]) => new Player(u._1, u._2))
        
  lazy val playersList: Iterable[Player] = getPlayers()
}