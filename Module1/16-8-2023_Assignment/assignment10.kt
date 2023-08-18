fun main()
{
    val stateCityMap = hashMapOf<String , String>()

    stateCityMap["Gujarat"] = "Ahamadabad"
    stateCityMap["Rajasthan"] = "Jaipur"
    stateCityMap["Maharashtra"] = "Mumbai"
    stateCityMap["Punjab"] = "Chandigarh"

    for ((state , city) in stateCityMap)
    {
        println("State: $state, City: $city")
    }

}