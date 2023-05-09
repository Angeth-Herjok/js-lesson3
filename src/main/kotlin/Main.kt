fun main() {
    val people=
        listOf(
            Person("John",30,168.8,50.2),
            Person("Faith",21,164.5,54.6),
            Person("Anjela",23,154.2, 54.2)
        )
    val sortedByAgeDescending = people.sortedByDescending { it.age }
    println(studentNames("John","James","Joy"))

}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)

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