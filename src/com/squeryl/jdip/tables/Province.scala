package com.squeryl.jdip.tables

import org.squeryl.KeyedEntity

class Province(val id: String, val hasSupplyCenter: Boolean) extends KeyedEntity[String] {
	def this() = this("", false)
}