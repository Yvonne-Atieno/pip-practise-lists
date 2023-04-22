fun main (){
    var num=nums(arrayOf(2,4,5,6,7,9,12,15,3))
    println(num)

greetings()

    var numbers= list(arrayOf(23,45,12,22,26,62))
    println(numbers)

    digits()
    sumNum(12,23.2)


}
//No 1
//Write a function that takes an array of integers as input and returns the sum of all even numbers.
fun nums(num:Array<Int>):Int{
    var sum=0
   for (n in num){
       if (n%2==0){
           sum+=n
       }
   }
    return sum
}



//No 2
//Write a Kotlin program that prints "Hello, world!" to the console.
fun greetings(){
    println("Hello,world")
}

//No 3
//Write a function that takes a list of numbers as a parameter and returns
// the average of all the numbers in the list
fun list(numbers:Array<Int>):Double{
   var avg=numbers.average()
    return avg

}

//No 4
//Write a Kotlin program that uses a loop to print out the numbers 1 through 10.
fun digits(){
    for (x in 1..10){
        println(x)
    }
}
//No 5
//Write a Kotlin program that calculates and prints the sum of two numbers.
fun sumNum(num1:Int,num2:Double){
    var add=num1+num2
    println(add)
}

