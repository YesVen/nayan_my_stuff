package main 

import "fmt" 
import    "time"
 
func f(from string) {
    for i := 0; i < 28; i++ {  
    	time.Sleep(40*time.Millisecond)
        fmt.Println(from, ":", i)
    }
} 
func main() {
 
     f("test")  

/* To invoke this function in a goroutine, use go f(s).
   This new goroutine will execute concurrently with the calling one. */
//
    go f("goroutine1")
    go f("goroutine2")
    go f("goroutine3")

	//start a goroutine for an anonymous function call.	
	   go func(msg string) {
	   	for j := 1; j <= 5; j++ {	      
	        fmt.Println(msg,j)
	    }
	    }("citi")
	 
	
	var name string
	fmt.Scanln(&name)
    	
    } 

