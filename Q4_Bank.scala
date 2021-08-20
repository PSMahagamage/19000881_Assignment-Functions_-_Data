object Bank extends App{
  val a1 = new Account("983358246V",1111,50000.00)
  val a2 = new Account("615828436V",1112,60000.00)
  val a3 = new Account("980825467V",1113,30000.00)
  val a4 = new Account("964628751V",1114,-16000.00)
  val a5 = new Account("994659413V",1115,-20000.00)

  var bank:List[Account]=List(a1,a2,a3,a4,a5)
  val od = (b:List[Account]) => b.filter(x=>x.Bal.<(0.0))
  val sum = (b:List[Account]) => b.reduce((a,b) => new Account("Total",0,a.Bal+b.Bal))
  val interest = (b:List[Account]) => b.map(x=> if (x.Bal<0) new Account(x.NIC,x.aNum,x.Bal*0.1+x.Bal) else new Account(x.NIC,x.aNum,x.Bal*0.05+x.Bal))

  println("\n# List of Accounts with NEGATIVE balances : ")
  od(bank).foreach{
    x => print("\t" + x.aNum)
    print("\n")
  }

  println("\n# Total of all account balances (Rs.) : "+sum(bank).Bal)

  println("\n# Final balances of all accounts (Rs.) : ")
  interest(bank).foreach{
    x => print("\t" + x.aNum)
    print(" = ")
    print(x.Bal + "\n")
  }
}

class Account(id:String, num:Int, bal:Double){
  val NIC:String = id
  val aNum: Int = num
  var Bal: Double = bal

  override  def toString = s"[$NIC:$aNum:$Bal]"
}
