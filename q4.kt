fun main()
{
    print("Enter a number : ")
    var num1 = Integer.valueOf(readLine())
    val ans: String = if (num1%5 == 0)
              {
                  if (num1 % 11 == 0)
                  {
                      "Yes"
                  }
                  else
                  {
                      "No"
                  }
              }
              else
              {
                    "No"
              }
    println ("abosulte value of number is : " + ans)
}
