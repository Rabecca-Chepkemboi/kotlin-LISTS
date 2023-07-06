fun main() {
    val fruits = listOf("banana", "apple", "mango", "avocado")
    println(fruits)


    val Zamunda = mutableListOf(12500000, "Alfayo", true, 20.6, 34.5f)

    Zamunda.add("Constitutional Monarchy")
    Zamunda.remove(34.55f)
    println(Zamunda)


    val numbers = listOf(23, 43, 45, 12, 32, 30, 55)
    println(numbers.count())
    println(numbers.max())
    println(numbers.min())
    println(numbers.average())
    println(numbers.sum())
    println(numbers.indexOf(12))
    println(numbers.get(6))
    println(numbers.lastIndexOf(55))


    sumElement(listOf(22, 12, 32, 56))


    val number1 = listOf(23, 43, 67, 12, 32, 70, 55)
    number1.sorted()
    println(number1)
    //or
    val sortedNums = number1.sorted()


    println( createProductList())

//    println(sorted)



    val nums = listOf(12, 17, 31, 54, 67, 89, 21, 34, 56)
    var y = mutableListOf<Int>()
    for (x in nums){
        if (x % 2 == 0) {
            y+=x
        }

        }
       println(y)

    //or

    val eveNum = nums.filter { num -> num % 2 == 0 }
    println(eveNum)
}

fun fruits(name: String){
    println(name)
}


//list iteration

//wtite a function that sums up all the elements
//in a list of integers do not use the inbuilt.sum

fun sumElement(elements: List<Int>){
    var sum = 0
    for(x in elements){
        sum++
    }
    println(sum)
}

data class Product(var name: String, var price: Double)

fun createProductList(){
    val prod1 = Product("iphone", 120000.0)
    val switch = Product("switch", 500.0)
    val prod2 = Product("Mango", 50.0)
    val shoe = Product("Addidas", 3500.0)

    val products = listOf(prod1, switch, prod2, shoe )
    println( products)

    val sorted = products.sortedBy { product -> product.name.lowercase() }
    println(sorted)

    val itemsCanAfford= products.filter {product -> product.price<=5000  }
    println(itemsCanAfford)
}





