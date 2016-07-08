package main 

import "fmt"

	func sample2(name string,marks ...int) {
		fmt.Println(name,marks)
		fmt.Println(len(marks))
		fmt.Println(marks[1])
		
	}
	func sum(nums ...int) {
	    fmt.Print(nums, " ")
	    total := 0
	    for _, num := range nums {
	        total += num
	    }
	    fmt.Println(total)
	}
	
	func main() {
	    sample2("Neha", 12,23,34)
	    sum(1, 2)
	    sum(1, 2, 3)
	    nums := []int{1, 2, 3, 4}
	    sum(nums...)
	}
