object dataS{
  def main(args:Array[String]): Unit = {
    //Collection datatypes in scala
    //List-immutable and homogenius
    val fruiys:List[String]=List("Allemn","orange","kwnduc")
    print(fruiys)
    val intu:List[Int]=List(1,2,3,4)
    println(intu)
    val in:List[Any]=List(1,4.33,4.22,5)
    println(in)
    println(fruiys.head)
    //head will give first and tail will give output without first  element
    println(fruiys.last)//lastelement will get
    val string=List("ttt",1,2,3,4,5,true)// other way of declaring
    println(string)

    println(string.head.getClass)
    val Empty:List[Nothing]=List()
    println(Empty)
    //Array -->Mutable ,Fixed collection odf datastructure
    //Array is homogenious collection
    val array=Array("array","ddd")
    array(1)="Allen"
    println(array)
    array.foreach(println)//print an element in newline each elements
    println(array.mkString(","))
    //Declare Empty array
    var arr_1 =new Array[String](10)
    val arr_2=Array.ofDim[Int](2,2)
    arr_2(0)(0)=234
    arr_2(0)(1)=135
    arr_2(1)(0)=911
    arr_2(1)(1)=102
    //print Array
    val flattenArray:Array[Int]=arr_2.flatten
    println(flattenArray.mkString(","))
    val list2=10::20::30::40::Nil
    // Create LIST BUFFER of type mutable
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities+="Trivandrum"
    cities+="Kasaragod"
    cities+="Kozhikode"
    cities+="Malapuram"
    cities+=("Kannur","Wayanadu","Kollam")
    cities-="Kozhikode"
    print(cities)
    cities.toList//typecastong in scaa is done by to and datatype function


    //SET COllection : immuttable collection
    //HashSet - Mutable Collection of  Sets
    val set_1 :Set[Int]=Set(1,2,3,4,5,4)
    print(set_1)
    import scala.collection.mutable.Set
    val mutableset=Set(3,4,5,6,7)
    mutableset+=33
    mutableset-=4
    print(mutableset)

    //Tuple Declaration-store multiple datatypes together-immutable
    val Tuple_1=(10,20,30,40,506,0,70,80)
    println(Tuple_1)
    println(Tuple_1._1)//Accessing Indvidual value(first element)


    //Map in Scala is a collection of key value airs
    //each key is unique
    //similar to Dictionary in python

    //import scala.collection.immutable.Map
    //Empty variable declaration
    var mapvar:Map[Int,String]=Map()
    var Mapvar_1=Map("UST1"->"Sandeep","UST2"->"Mithun","UST3"->"Vinesh","UST4"->"Adinan")
    println(Mapvar_1.contains("UST3"))//boolean
    //Access value using Key
    println(Mapvar_1.get("UST1"))
    //print(all keys)
    println(Mapvar_1.keys)
    //print(all values)
    println(Mapvar_1.values)
    import scala.collection.mutable.Map
    val mutable_var=Map("UST1"->"Sandeep","UST2"->"Mithun","UST3"->"Vinesh","UST4"->"Adinan")
    println(mutable_var)
    //Update using key
    mutable_var("UST2")="Rohit"
    //insert new key value pair
    mutable_var +=("UST5"->"Shiva")



    println(mutable_var)
    //ITERATORS IN SCALA PROGRAMMING
    //AN ITERATOR IN SCALA REPRESENT A SEQUENC EOF ELEMENT THAT ALLOWS YOU TO
    //TRAVERSE THROUGH A COLLECTION SEQUNTIALLY
    val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 6, 54, 4, 3, 3)
    val iter=myList.iterator
    //Method iterator will check if there is more element (.hasNext()) in loop
    //  next()->to retriev the next element
    //(.remove())->remove the elements from mutable iterators
    println(iter.next())
    println(iter.next())
    //Lazy Initialisation in Scala
    lazy val donuts:Int=100
    println(donuts *5) //lazy cannot be used with var
    

  }
}