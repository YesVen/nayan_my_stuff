package main 

import  "fmt"

func main() {

  message :="Welcome Google"
  
  var  greeting *string = &message            // & to refer the address
  
  fmt.Println("Msg is =",message," Address is = ",greeting)
  
  fmt.Println("Value @ = ",*greeting)       // * to value @ the address
  
  *greeting = "New Massage"                  // changing value at original address
  
  fmt.Println("Msg is =",message," Address is = ",greeting)
  
  fmt.Println("Value  is = ",*greeting)       // * to value @ the address
  
  
  fmt.Printf("Types :%T",greeting)
  
}

