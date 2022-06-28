fun main() {
    println("Hello World!")
    var age: Int = 23; //определение переменной val|var имя_переменной: тип переменной
    val name: String = "Alex" // val - неизменяемая переменная, значение можно присвоить только 1 раз
    println("Hi! My name is $name and i'm $age years old.") //форматированная строка (шаблон строки)
    val city = "Moscow"; //вывод переменной без указания типа данных
    """Все целочисленные значения воспринимаются как Int,
       все значения с плавающей точкой, как Double.
       Чтобы получить нужный тип, приписываем к значению нужную букву L-Long, F-Float и т.д.
    """.trimMargin()
    var example:Any ="Аааа"; //Any - тип данных, который позволяет хранить в переменной любое значение
    example = 12345;

    println("Input your name:");
    println("Your name is "+ readln());

    println(8 and 15); //конъюнкция
    println(8 or 15); //дизъюнкция
    println(15 xor -8); //xor
    println(15.inv()); //отрицание
}