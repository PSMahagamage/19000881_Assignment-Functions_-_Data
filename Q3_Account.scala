object Acc extends App{
  val a1 = new Account("983358246V",1111,50000.00)
  val a2 = new Account("615828436V",1112,60000.00)

  a2.transfer(a1,10000.00)

  println("# Account 01 ->")
  println(a1)
  print("\n")
  println("# Account 02 ->")
  println(a2)
}

class Account(id:String, num:Int, bal:Double){
  val nic:String = id
  val ANum: Int = num
  var Bal: Double = bal

  def transfer(a:Account,vl:Double) = {
    this.Bal -= vl
    a.Bal += vl
  }
  override  def toString = s"\tNIC : $nic \n\tAccount NO.: $ANum \n\tBalance: $Bal"
}
