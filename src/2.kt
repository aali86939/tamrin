fun main()
{
    var ar1= arrayOf(10,25,36,46)
    val ar2= arrayOf(1,0,6,0)
    var x:Int

    try
    {
        for (i in 0..4)
        {
            println(ar1[i]/ar2[i])

        }
    }
    catch (e:Exception)
    {
        println("error")
    }

}