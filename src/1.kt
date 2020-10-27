var x=0
var nums= arrayOfNulls<Long>(10)
var sname= arrayOfNulls<String>(10)
var lname= arrayOfNulls<String>(10)
fun main() {

    menu()
}
fun menu()
{
    println("""
        |1.creat contact
        |2.edit
        |3.print
        |4.search
        |5.exit
    """.trimMargin())
    var b= readLine()!!.toInt()
    when(b)
    {
        1->creat()
        2->edit()
        3->printc()
        4 ->search()
        5 -> -1
        else -> println(" please enter right number ")
    }
}
fun creat()
{
    println("please Enter your Name please:")
    sname[x]= readLine()
    println("please Enter your Kast Name please:")
    lname[x]= readLine()
    println("please Enter your Number please:")
    nums[x]= readLine()!!.toLong()
    x++
    menu()
}
fun edit()
{
    println("please enter name to change:")
    val y= readLine()
    var n:Int=0
    for (i in 0..x)
    {
        if (sname[i]==y)
            n=i
    }
    println("please Enter your Name please:")
    sname[n]= readLine()
    println("please Enter your Kast Name please:")
    lname[n]= readLine()
    println("please Enter your Number please:")
    nums[n]= readLine()!!.toLong()
    menu()

}
fun search()
{
    println("please enter name to show data:")
    val y= readLine()
    var n:Int=0
    for (i in 0..x)
    {
        if (sname[i]==y)
            n=i
    }
    print(".name "+sname[n] +"       ")
    print("last name "+lname[n]+"        ")
    print("number "+nums[n]+"         ")
    println("")
    menu()
}
fun printc()
{
    for (i in 0 until x)
    {
        print(".name "+sname[i] +"       ")
        print("last name "+lname[i]+"        ")
        print("number "+nums[i]+"         ")
        println("")
    }

    menu()
}



