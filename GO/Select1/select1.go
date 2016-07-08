package main

import (
    "fmt"
    "time" 
    "strconv"
)

func getMessagesChannel(msg string, delay time.Duration) chan string {
     c := make(chan string)
     go func() {
          for i := 1; i <= 3; i++ { 
                c <-  msg + strconv.Itoa(i)
               // Wait before sending next message
               time.Sleep(time.Millisecond * delay)
          }
     }()
     return c
}

func main() {
     c1 := getMessagesChannel("first ", 300)
     c2 := getMessagesChannel("second ", 150)
     c3 := getMessagesChannel("third ", 10)

     for i := 1; i <= 3; i++ {
          fmt.Println(<-c1)
          fmt.Println(<-c2)
          fmt.Println(<-c3)
     }
 





/* Because of the reading operation on the first channel blocks for 
   300 milliseconds for each loop iteration and other operations must wait.
   What we actually want is to read messages from all channels as soon as 
   they are any. */
     for i := 1; i <= 9; i++ {
	     select {
		     case msg := <-c1:
		          fmt.Println(msg)
			 case msg := <-c2:
		          fmt.Println(msg)
		     case msg := <-c3:
		          fmt.Println(msg) 
		      
	     }
}
}
     
 