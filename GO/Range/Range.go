package main 

import "fmt"

func main() {
	//with array
    a := [5]string{"a", "b", "c", "d"}
    for index := range a {
        fmt.Println("Array item", index, "is", a[index])
    }

   // with slice
    slice:=[]string{"a", "b", "c", "d"}
    for index:=range slice{
    	fmt.Println("slice item", index, "is", slice[index])
    }
    
    /* using 2 variable 1st is index and 2nd is value */     
    slice2:=[]string{"au", "bx", "cn", "dy"}
    for index,value:=range slice2{
    	fmt.Println("slice2 item",index, "is", value)
    }
    
    /*if only need value, index can be replaced by _  */
    for _,value:=range slice2{
    	fmt.Println("slice2 item is", value)
    }
    
    //on a map, range returns the key 
    capitals := map[string] string {
    	"France":"Paris", "Italy":"Rome", "Japan":"Tokyo" }
    for key := range capitals {
        fmt.Println("Map item: Capital of", key, "is", capitals[key])
    }

    /*range can also return two items, the index/key 
    and the corresponding value */
    for key2, val := range capitals {
        fmt.Println("Map item: Capital of", key2, "is", val)
    }

 
}

