package main 
import "fmt"
 type Account struct{
	name string
	acBal int
	acNum int64
}
func (ac *Account) OpenAccont(name string,acbal int,acnum int64){  
      ac.name=name
      ac.acBal=acbal
      ac.acNum=acnum  
} 
 
func main() { 
	var acc Account;  
	acc.OpenAccont("Citiustech", 12000, 10000000234) 
	fmt.Println("Name = ",acc.name) 
	fmt.Println("Ac_Num = ",acc.acNum)
	fmt.Println("Ac_Bal = ",acc.acBal) 
 
}




//func (ac Account) ShowDetails(){ 
//	fmt.Println("Name = ",ac.name) 
//	fmt.Println("Ac_Num = ",ac.acNum)
//	fmt.Println("Ac_Bal = ",ac.acBal)
//}