abstract class Animal(_name : String = "The animal") : IAnimal {
    val animalName = _name
   override fun move (direction : String){
       println("The animal moves $direction")
   }

    override fun makeASound() {
        println("The animal made a generic sound")
    }
}