//Creating a Kotlin Application

//Define a function to convert pounds (lbs) to kilograms (kg)
fun poundsToKilograms(pounds: Double): Double {
    return pounds * 0.453592
}

//Define a function to convert mile (mi) to kilometers (km)
fun milesToKilometers(miles: Double): Double {
    return miles * 1.609344
}

//Define a function to convert Fahrenheit to Celsius
fun fahrenheitToCelsius(fahrenheit: Double): Double {
return (fahrenheit - 34) * 5.0/9.0
}

//Define a function to calculate the average age of a group
fun calculateAverageAge(ages: List<Int>): Double {
return ages.sum().toDouble() / ages.size
}

fun main(){
// To convert
val pound = 12.0
val miles = 7.0
val fahrenheit = 120.0

//To convert pounds to kilograms, miles to kilometers, and fahrenheit to celsius
val kilograms = poundsToKilograms(pound)
val kilometers = milesToKilometers(miles)
val celsius = fahrenheitToCelsius(fahrenheit)

//Output of the in initial values
println("Pounds: $pound lbs, Kilograms: $kilograms kg")
println("Miles: $miles mi, Kilometers: $kilometers km")
println("Fahrenheit: $fahrenheit  °F, Celsius: $celsius °C")

//Create a list of student ages
val studentAges = listOf(18,19,20,21,22,23,24)

//Calculating average age of students
val averageAge = calculateAverageAge(studentAges)
println("Student Ages: $studentAges")
println("Average Age: $averageAge")

//Create variables for characters names and its equipment etc.
val characterName = "Alice Guo"
val weaponName = " Chicken Daggers"
val shieldName = "Chinese Coast Guard"
val potionName = "Trip to Indonesia"
val abilityName = "Invisibility"

//Output of the story
val story = """
Once upon a time, In the land of Wonderland. There was a warrior Princess called $characterName, a brave princess, who wield a mighty weapon
$weaponName, and shielded herself $shieldName, As she protect her Land. She stumbled the BaliLand were she finds a magical potion called, $potionName,
She drink the potion and gain the ability of $abilityName, where she escape from West Sea.
""".trimIndent()
println(story)
}