class Mouse(_name : String = "The mouse") : Animal(_name) {
    override fun makeASound() {
        println("$animalName squeak!squeak!")
    }
    private var CheeseAmount = 0

    fun stealCheese(x: Int) {
        CheeseAmount += x
    }

    fun eatCheese() {
        if (CheeseAmount > 0) {
            CheeseAmount--
            println("$animalName ate a piece of cheese! now has $CheeseAmount pieces of Cheese")
        } else {
            println("$animalName  no cheese")
        }
    }

}