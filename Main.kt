import java.util.*
fun main (){
    val robot = Robot("Amogh")
    println("Hey, there. My name is ${robot.name} and I will be your personal assistant!!")
    println()
    robot.ringAlarm("7:00 AM")
    println()
    robot.makeCoffee(Coffee(true, 1))
    println()
    robot.heatWater(37)
    println()
    robot.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()
    robot.cook()
    println()
    robot.ironClothes("Blue", "Black")
    println()
}