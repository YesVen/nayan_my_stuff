package main 

import "fmt"

func main() {
		/*
		no parentheses surrounding the three
		components of the for statement and the
		braces { } are always required. 
		*/
		for j := 7; j <= 9; j++ {
	        fmt.Println(j)
	    }
		/*
		The init and post statement are optional.
		We can drop the semicolons:
		*/
	    sum := 1
		for ;sum < 10; { 
			sum += sum 
		}
		fmt.Println(sum)
		//an infinite loop
		i:=1
		for {
			if i>5{
			    break
			}
			fmt.Println(i)
			i++
	    }
		

}

