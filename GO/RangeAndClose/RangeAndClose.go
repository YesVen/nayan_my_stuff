package main 
import "fmt" 

//range will not work until the channel is closed explicitly
func main() {
     message := make(chan int)
     count := 3

     go func() {
          for i := 1; i <= count; i++ {
               message <-  i  
          }
          close(message)
        }()

     for msg := range message {
          fmt.Println(msg)
     }
     fmt.Println("End main")
}









//func fibonacci(n int, c chan int) {
//	x, y := 0, 1
//	for i := 0; i < n; i++ {
//		c <- x
//		x, y = y, x+y
//	}
//	// close(c)
//}
//
//func main() {
//	c := make(chan int, 10)
//	go fibonacci(cap(c), c)
//	
// //range keyword which when used with a channel will wait on the channel until it is closed. 
//	for i := range c {
// 		fmt.Println(i)
// 	}
//
//   v, ok := <-c 
// 	fmt.Println("Closed ?" ,ok , v)
//}

