object DataType{
  def main(args:Array[String]):Unit={
    val intNum:Int=20
    val longNum:Long=123456789L
    val shortNum:Short=23347
    val byteNum:Byte=127
    //floating Datatypes
    val FloatingNum:Float=3.14f
    val doubleNum:Double=3.124724674827994277942
    //String Datatypes
    val string:String="Hello Scala"
    //Character datatype
    val Charvar:Char='A'
    //Unit dataType
    val unitValue:Unit=()
    //printing values
    println(s"Integer:$intNum")
    println(s"value:$unitValue")
    println(s"Num:$byteNum")
    println(s"double:$doubleNum")
    print("type a number : ")
    val sca=scala.io.StdIn.readInt()
    println(s"enterd value:$sca")
    println(string)
    //Mutabledatatypes
    //Boolean datatype-true,false
    var bool:Boolean=true
    println("Boolean " +bool)
    var int:Int=40
    println(int)
    //update item assaingment in mutable variable
    int+=30
    println(int)

      


  }

}