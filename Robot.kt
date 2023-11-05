import java.util.*
class Robot(val name: String){
    fun ringAlarm(time: String) = println("Good Morning! Its $name, the time is already $time, please wake up!")
    fun makeCoffee(coffee: Coffee) = if(coffee.black){
        println("Your black coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
    } else{
        println("Your coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
    }
    fun heatWater(temperature: Int) = println("Bath water with $temperature is ready, take a bath now!")
    fun packBag(day: Int){
        val messageTemplate = "Books kept for today are: "
        val subjects = arrayOf("Maths", "Physics", "Chemistry", "Electronics", "Computers", "Materials Sciences", "Human Values")
        when(day){
            Calendar.MONDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subjects[5]}, ${subjects[6]}")
            else -> println("Invalid day or maybe its holiday today!")
        }
    }
    fun cook() {
        val breakfast = mutableListOf("Cereals", "Cornflakes", "Oats", "Sandwiches", "Eggs")
        val lunch =
            mutableListOf("Corn Spinach", "Salad", "Chicken", "Shahi Paneer", "Mashed Potatoes", "Eat out today!")
        println("Today's breakfast is ${breakfast.random()} and lunch is ${lunch.random()}")
    }
    fun ironClothes(shirtColour: String, trouserColour: String){
        val shirtColours = mutableListOf("Blue", "Green", "Orange", "Red", "Yellow", "Black")
        val trouserColours = mutableListOf("Blue", "Black", "Gray")
        if(shirtColours.contains(shirtColour)){
            if(trouserColour.contains(trouserColour)){
                println("Your clothes are ready!")
            } else{
                println("You do not have trouser of this colour. May be its time to go for a trouser shopping.")
            }
        } else{
            println("You do not have shirt of this colour. May be its time to go for a shirt shopping.")
        }
    }
}