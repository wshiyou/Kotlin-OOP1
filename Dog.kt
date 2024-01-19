class Dog(_name : String = "The dog") : Animal(_name) {
    override fun makeASound() {
        println("$animalName made a general sound")
    }

}