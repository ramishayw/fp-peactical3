object Practical3 extends App {
    def sumOfTheList(list:List[Int]): Int = {
        def isEven(num: Int): Boolean = num % 2 == 0

        list.filter(isEven).sum
    }

    println(sumOfTheList(List(10, 20, 30, 3, 5, 7)))
}