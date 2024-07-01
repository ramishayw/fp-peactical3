object Practical3 extends App {
    def filterLongStrings(list: List[String]): List[String] = {
        def longerThanFive(str: String): Boolean = str.length > 5 

        list.filter(longerThanFive)
    }

    println(filterLongStrings(List("Ramisha", "Yohani", "Emil", "Navod")))

}