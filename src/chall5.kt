fun main(args:Array<String>){

    val add = Add(5,7)
    println("the sum of numbers is : ${add.j}");

}
class Add constructor(d:Int,c:Int){
    var j=d+c;
}