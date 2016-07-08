package main

import  "fmt"  
 
func main(){  
	var v int  // declaration  
	v=10      // initialization
	fmt.Println(v)
	
	var y,u =12,12
	fmt.Println(y,u)
	 
	var   i, j, k int32
	fmt.Println(i,j,k)
	
    var   c, ch byte 
    fmt.Println(c,ch)
    
    var  f, salary float32 
    fmt.Println(f,salary)
    
    var str1 string
    fmt.Println("name is ="+ str1) 
    
    var str2 = "Citiustech"
    fmt.Println("name is = "+ str2)
    
     
    var   a, b  int32 = 1,2 
    var   p, q  = 7,8 
    l, m  := 10,"abc"   //:= syntax is shorthand for declaring and initializing a variable
    age,name,salary,insured:= 33239,"Ajit",21234345435345645.23,false;
	fmt.Println(a,b,p,q,l,m )
	fmt.Println(age,name,salary,insured)  
	
	fmt.Printf("Types :%T %T %T %T %T %T %T %T %T %T",a,b,p,q,l,m,age,name,salary,insured)
	 
//	  i := 42
//      f := float64(i)

}