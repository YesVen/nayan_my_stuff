package main 

import "fmt"

func main() {
	
	    data:=100
	    if data%2==0 {
	    	fmt.Println("data is even")
	    }
        if 7%2 != 0 {
	        fmt.Println("7 is odd")
         }else {
           fmt.Println("7 is even")
         }
         
       // num will be only known to this block (like loop variable)
	    if num := 9; num < 0 {            
	       fmt.Println(num, "is negative")
	     } else if num < 10 {
           fmt.Println(num, "has 1 digit")
         } else {
           fmt.Println(num, "has multiple digits")
         }
     
	    if t := test(); t > 100 {
		fmt.Println("YES")
	    }else {
        fmt.Println("NO")
        }
    } // main closed
      
	
	  func test() int {
	        return 102
	       }

