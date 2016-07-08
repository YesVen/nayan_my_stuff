package main 

import "fmt"
import  "time"	

func ChannelSetter(Message string,chann chan string){
	  fmt.Println("before setter..",Message)
	 chann  <- Message 
	 fmt.Println("after setter..",Message) 
}
func ChannelGetter(chann chan string){
	   msg := <- chann 
	    fmt.Println("ChannelGetter ",msg)
	    
}
func main() { 
          messages := make(chan string,2)   												//messages := make(chan string,2) //Buffered
          go ChannelSetter("ping",messages) 
           go ChannelSetter("ping2",messages)  
          time.Sleep(12*time.Millisecond)
}



//
//
//
//
//func sum(s []int, c chan int) {
//	sum := 0
//	for _, v := range s {
//		sum += v
//	}
//	c <- sum // send sum to c
//	fmt.Println("after set")
//}
//
//func main() {
//	s := []int{7, 2, 8, 1, 4, 0}
//
//	c := make(chan int)
//	go sum(s[:len(s)/2], c)
//	go sum(s[len(s)/2:], c)
//	 
//	  //x, y := <-c, <-c // receive from c
//      x:=<-c
////      y:=<-c
//    
//	  fmt.Println(x) //, y, x+y)
//	 
//	 time.Sleep(12*time.Millisecond)
//} 
