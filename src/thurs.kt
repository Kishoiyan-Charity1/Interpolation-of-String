fun main() {
    //create a function that takes in a name
    //and prints out "hello name" given name is "Ada"
    greet( "Ada")
    her()
    her3()
    statement("Anane is the ceo of simba cement")
    lets()
    next()
    reverseCase( "Jane")
    reverseCase( "jane")
    place()
    sentence()
    mm()
    now()
    numbers( 2000, 22)





}
fun greet(name:String) {
    var greet="Hello $name"
    println(greet)

}
fun her(){
    var name= "Jane"
    var name2= "jane"
    println(name==name2)
}

fun her3(){
    var name= "Jane"
    var name2= "maven"
    println(name2.capitalize())
}
//Anane is the ceo of simba cement in africa
//second statement make the statement uppercase
fun statement(sentence:String){
    println(sentence.uppercase())
}
fun lets(){
    var x= ""
    var y=" "
    println(x.isEmpty())
    println(x.isBlank())
    println(y.isEmpty())
    println(y.isBlank())

}
fun next() {
    var name = " Kanini Catherine "
    println(name)
    println(name.trim())
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())
    println(name.replace(" ", ""))
}
fun reverseCase(name:String){
    if(name.equals("Jane")){
    println(name.uppercase())
}
else{
    println(name.lowercase())
    }

}
fun place(){
    var city ="Chicago"
    println(city.startsWith( "Chi"))
}
fun sentence(){
    var stmt = "Nairobi is a big city"
    println(stmt.replace( "i", "e"))
}
fun mm(){
    var stmt ="Nairobi is a big citty"
    var word= stmt.split("i")
    println(word)
    var words= stmt.split(" ")
    println(words[0])

    var n= "kishoiyan charity   wanjiru"
    var w= n.length
    println(w)


}
fun now(){
    var weight =52.5
    var stmt = "My current weight is" + weight.toString()
}
fun numbers(year:Int , age:Int){
    var pin= year.toString() + age
    println(pin)

}