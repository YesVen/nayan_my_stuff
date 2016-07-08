package main 

import "fmt"

func main() {  
	/*
	A slice can be created with the built-in function called make.
	Sytax: func make([]T, length, optional_capacity)  
	When called, make allocates an array and returns a slice that refers to that array.
	below code : gives link of 5 memory slices but only 3 active
	if we skip the capacity, size and capacity will be same as 3
	*/
	     
	      
			var num []int
			num=make([]int,3,5)  
			num[0]=11 
			num[2]=12  
			fmt.Println(num) 
			
			// reference type
			var num2 []int
			num2=num 
			num2[2]=111
			fmt.Println(num)
			fmt.Println(num2)
	/* A slice literal is declared just like an array literal, 
	   except you leave out the element count:*/
			letters := []string{"a", "b", "c", "d"} 
			fmt.Println(letters) 
			
	 /*We can set and get just like arrays.*/
	        s := make([]string, 3)
		    s[0] = "a"
		    s[1] = "b"
		    s[2] = "c"
		    fmt.Println("set:", s)
		    fmt.Println("get:", s[2])
		    
	 /*len and cap returns the length and capacity of the slice as expected.*/
	       fmt.Println("len:", len(s))
	       fmt.Println("cap:", cap(s))


    /* will not be able to add 3rd element in p as size is 2 only 
       we can create a new slice of bigger size and copy s */
//            p:=make([]int,2)
//            p[2]=123    //runtime error: index out of range
            
    /*we can create an empty slice n of bigger length and copy into n from p.*/
//		    n := make([]int, len(p)+5)
//		    copy(n, p)
//		    n[2]=123
//		    fmt.Println("cpy:", n)
               

    /* another way for above is using append
      append,which returns a slice containing one or more new values. Note that
      we need to accept a return value from append as we may get a new slice value.*/	    
		    s = append(s, "d")
		    fmt.Println("apd:", s)
		    s = append(s, "e", "f")
		    fmt.Println("apd:", s)
		    
		    s1:=[]string{"1", "2", "3", "4"} 
		    s = append(s, s1...) // appending slice type
		    fmt.Println("apd ...:", s)
             
             

     /*Slices support a “slice” operator with the syntax slice[low:high]. 
      For example, this gets a slice of the elements s[2], s[3] */	
		    l := s[2:4]              // s := make([]string, 3)
		    fmt.Println("sl1:", s)
		    fmt.Println("sl1:", l) 

    /* This slices up to (but excluding) s[5].*/	
		    l = s[:5]
		    fmt.Println("sl2:", l)

     /*And this slices up from (and including) s[2].*/
		    l = s[2:]
		    fmt.Println("sl3:", l)

     /*Slices can be composed into multi-dimensional data structures. 
     The length of the inner slices can vary, unlike with multi-dimensional arrays.*/
		    twoD := make([][]int, 3)
		    for i := 0; i < 3; i++ {
		        innerLen := i + 1
		        twoD[i] = make([]int, innerLen)
		        for j := 0; j < innerLen; j++ {
		            twoD[i][j] = i + j
		        }
		    }
		    fmt.Println("2d: ", twoD)

    /*We create a slice of three elements. Its cap is 4. 
      When add a 6th element, and its capacity will doubles to 8. */
            var pp []int
			pp=make([]int,3,4)  
			pp[0]=11
			pp[1]=12
			pp[2]=13  
			fmt.Println("After 4th element ",len(pp)," ",cap(pp)) 
			pp=append(pp,2)
			fmt.Println("After 5th element ",len(pp)," ",cap(pp))
			pp=append(pp,2)
			fmt.Println("After 6th element ",len(pp)," ",cap(pp)) 
			
    /* Creting slice from an array 
    if we update the array,slice will also updated
    */
    myArray:=[5]int{1,2,3,4,5}
    myslice :=myArray[:]
    fmt.Println(myslice)
    myArray[2]=99
    fmt.Println(myslice)
}

