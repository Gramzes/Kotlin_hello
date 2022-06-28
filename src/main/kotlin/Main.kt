fun main() {
    println("Hello World!")
    var age: Int = 23; //определение переменной val|var имя_переменной: тип переменной
    val name: String = "Alex" // val - неизменяемая переменная, значение можно присвоить только 1 раз
    println("Hi! My name is $name and i'm $age years old.") //форматированная строка (шаблон строки)
    val city = "Moscow"; //вывод переменной без указания типа данных
    /*Все целочисленные значения воспринимаются как Int,
       все значения с плавающей точкой, как Double.
       Чтобы получить нужный тип, приписываем к значению нужную букву L-Long, F-Float и т.д.
    */
    var example: Any = "Аааа"; //Any - тип данных, который позволяет хранить в переменной любое значение
    example = 12345;

    println("Input your name:");
    println("Your name is " + readln());

    println(8 and 15); //конъюнкция
    println(8 or 15); //дизъюнкция
    println(15 xor -8); //xor
    println(15.inv()); //отрицание

    println(((2 in 1..6) and !(true or false)) xor true) //логические операции

    var a = if (city == "Moscow") { //задание переменной с помощью if
    "Best city";
    } else if (city == "Dubna") {
    "Not best city";
    } else {
    "Not best city";
    }
    // или
    if (city=="Moscow") "best city" else "Not best city"

    when (city){                    //замена switch
        "Moscow" -> {
            println("Best city");
            println("Best city");
        }
        "Dubna", "Dmitrov" -> println("Not best");
        else -> "ok";
    }

    when (val age1 = age+1){
        in 1..100 -> println("child");
        10+10 -> println("child");
    }

    when{
        age+1>age -> age+=1;
    }
    age = when{
        age+1>age -> age;
        else -> age-1;
    }

    //циклы
    for(i in 1..9){ //for эквивалентен foreach
        println(i*i)
    }

    var range = 'a'..'d'; //диапазон a,b,c,d
    var range2 = 5 downTo 1;  //5,4,3,2,1
    var range3 = 1..10 step 2; //1,3,5,7,9
    var range4 = 1 until 5 //1,2,3,4
}