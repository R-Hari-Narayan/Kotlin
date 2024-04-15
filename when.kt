fun main() {
    val number: Any = 2.4F
    
    val message= when (number){
        2,3,5,7 -> "number is a prime number between 1 to 10"
        in 1..10 -> "number is not a prime number but is between 1 to 10"
        is Int -> "number in not in between 1 to 10, but is a integer"
        else -> "number is not a integer"
    }
    
    println(message)
}