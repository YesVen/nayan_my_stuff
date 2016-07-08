package main 

import "fmt"

type myString string
type Person struct {  //A struct is a collection of fields.
	name string
	age int
}
func main() { 
	
	fmt.Println("********1st************")
    var msg myString = "welcome to google"
    fmt.Println(msg)
    
   fmt.Println("********2nd************")
    var p  Person  
//  var p= Person{} 
    p.age=22;
    p.name="Herry"
    fmt.Println(p.age,p.name) 
    
    fmt.Println("********3rd************")
    var m =Person{"Joy",12}
    fmt.Println(m.name,m.age)
    
    fmt.Println("********4th************")
    var n =Person{"Abc",1992}
    o:=&n
    fmt.Println(o.name,o.age)
    fmt.Printf("%T %T \n",n,o)
    
    fmt.Println("********5th************")
    var q =&Person{"bbc",7869} 
    fmt.Println(q.name,q.age)
    fmt.Printf("%T  \n",q)
    
//     dd:=q
//     dd.name="new NAME"
//     dd.age=234
//     fmt.Println(q.name,q.age)
   
    fmt.Println("********6th************")
     var r =&Person{}  
     //var r =new(Person)
     fmt.Printf("%T  \n",r)
  
    fmt.Println("********7th************")
    d:=Person{"city",33}
    fmt.Println("\n",d.name,d.age)
    
    fmt.Println("********8th************")
     //q:=Person(23,"Amit")  // will not work bcoz of order
    per:=Person{age:23,name:"Amit"}
    fmt.Println(per)
}

