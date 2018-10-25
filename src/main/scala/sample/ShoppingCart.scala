package sample

import Constants._

object ShoppingCart {

  val fruitPrice = Map(Apple -> 0.60, Orange -> 0.25)

  private def getAppleCount(fruits: List[String], includeOffer: Boolean):Int = {
    val totalAppleCount = fruits.count(_ == Apple)
    if(includeOffer){
      totalAppleCount/2
    } else {
      totalAppleCount
    }
  }

  def checkout(fruits: List[String], includeOffer:Boolean = false):BigDecimal = {

    val aTotalPrice = getAppleCount(fruits, includeOffer) * fruitPrice(Apple)
    val oTotalPrice = fruits.count(_ == Orange) * fruitPrice(Orange)

    aTotalPrice + oTotalPrice

  }

}
