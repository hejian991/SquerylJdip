/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.squeryl.jdip.tables

class Messages(val senderId: Int, 
               val receiverId: Int, 
               val timestamp: Timestamp,
               val message: String) extends KeyedEntity[CompositeKey3[Int, Int, java.sql.Timestamp]] {
  def this() = this(0, 0, new Timestamp(0L), "")
  
  def id = compositeKey(senderId, receiverId, timestamp)
}
