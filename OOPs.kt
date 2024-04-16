// OOPs in Kotlin

class SmartDevice(val name: String, val category: String) {

    //Properties
    var deviceStatus: String= "unknown"

    //Secondary Constructor
	constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode){
            1 -> "Online"
            0 -> "Offline"
            else -> "unknown"
        }
    }

    //Methods
    fun turnOn() {
        println("Smart device is turned on.")
    }
    fun turnOff() {
        println("Smart device is turned off.")
    }
    fun disconnect(){
        deviceStatus = "Offline"
    }
}

fun main() {
    val smartTvDevice = SmartDevice(name = "Smart TV",category = "Entertainment")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    println(smartTvDevice.category)
    
    val smartFridge = SmartDevice(name = "Panansonic Smart fridge", category = "House appliance", statusCode = 1)
    println(smartFridge.name)
    println(smartFridge.category)
    println(smartFridge.deviceStatus)
    smartFridge.turnOn()
    smartFridge.disconnect()
    println(smartFridge.deviceStatus)
}