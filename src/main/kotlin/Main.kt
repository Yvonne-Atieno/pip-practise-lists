fun main(){
    arrayNumber()
    person()
    println( names("cynthia angel", "Nickson Wangari", "Mike Awido"))
    var cars = listOf(
        Car("ABCD1MN23",1230.0),
        Car("SHKD70006",269.0),
        Car("KJDHHNM",261.9),
        Car("ASJXHNH ",1892.70)
    )
    var avgmileage = registration(cars)
    println("The average mileage is :$avgmileage")
}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun arrayNumber(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1].plus(numbers[5]))
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers.contentToString())
}
//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
// sort the list in order of descending age (2 points)
data class personobjects(var name:String, var age:Int,var height:Double, var weight:Int)
fun person(){
    var person1 =personobjects("Yvonne Adhiambo", 20, 1.8,67 )
    var person2 =personobjects("Mirriam wairinga", 44, 1.9,57 )
    var person3 =personobjects("cynthia Warukira", 29, 1.8,27 )
    var Person = listOf(person1, person2, person3)
    var person = Person.sortedByDescending { Person -> Person.age }
    println(Person)
}
//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
fun names(name:String, name1:String, name2: String):String{
    var y = (arrayOf(name,name1, name2,))
    return y.contentToString()
}
//4. Write a function that takes in a list of Car objects each with a registration and
// mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)
data class Car(var registration:String,var mileage:Double)
fun registration(cars:List<Car>):Double{
    var carMileage = 0.0
    for(car in cars){
        carMileage+=car.mileage
    }
    return carMileage/cars.size
}









