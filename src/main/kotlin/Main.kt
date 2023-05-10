import java.util.Arrays

fun main() {
    numbersArray()
    val people=
        listOf(
            Person("John",30,168.8,50.2),
            Person("Faith",21,164.5,54.6),
            Person("Anjela",23,154.2, 54.2)
        )
    val sortedByAgeDescending = people.sortedByDescending { it.age }
    println(sortedByAgeDescending)

    var s=studentNames("John","James","Joy")
    println(Arrays.toString(s))

    val cars=
        listOf(
            Car("KDG",2345.50),
            Car("KCZ",2105.50),
            Car("KDU",2005.50),
        )
   val avgMileage=averageMileage(cars)
    println(avgMileage)
}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
fun numbersArray() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sumNumbers=numbers[1]+numbers[4]
    println(sumNumbers)

//(ii) prints out the index of 158 (1 point)
    println(numbers.indexOf(158))

//(iii) prints out the elements in ascending order. (1 point)
    var sortedArray = numbers.sorted()
    println(sortedArray)
}


//2. Given a list of Person objects, each with the attributes,
//name, age, height, and weight. Sort the list in order of descending age (2 points)
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)



//3. Create a function that takes in 3 names and returns a string array
//containing all 3 names. (2 points)

fun studentNames(name1:String,name2:String,name3: String):Array<String>{
    return arrayOf(name1,name2,name3)
}

//4. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of all the vehicles in the list.
data class Car(var registration:String,var mileage:Double)
fun averageMileage(cars: List<Car>): Double {
    var sum = 0.0
    for (car in cars) {
        sum += car.mileage
    }
    return sum / cars.size
}