class Cat(_name : String = "The cat") : Animal(_name) {
    override fun makeASound() {
        println("$animalName said miao~")
    }

}