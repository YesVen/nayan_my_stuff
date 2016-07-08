package main 

import
     "fmt"
 
func main() {

    var myMap map[string]int   // Declaration     
    myMap = make(map[string]int) // initialization
    
//   myMap:= make(map[string]int) //Declaration & initialization  
    
    //statement sets the key to the value  
    myMap["route1"] = 66
    myMap["route2"] = 88
    myMap["route3"] = 99
    myMap["route5"] = 44
    fmt.Println(myMap)
    
    //map literal
     myMap2 := map[string]int{    
		    "rsc": 3711,
		    "r":   2138,
		    "gri": 1908,
		    "adg": 912,
		}
    
    /*retrieves the value stored under the key 
    "route" and assigns it to a new variable i: */
	    i := myMap["route1"]
	    fmt.Println("route1 =",i)
    
    /*if the requested key doesn't exist will get 
      the default value of type */
	    j := myMap["root"]
	    fmt.Println("root  =",j)
    
     //len function returns on the number of items in a map:
       le := len(myMap)
       fmt.Println("len =",le)

    /*The built in delete function removes an entry from the map:
    The delete function doesn't return anything, and will do
    nothing if the specified key doesn't exist. */
        delete(myMap, "route1")
    
    /*
    A two-value assignment tests for the existence of a key: 
    the first value is assigned the value stored under the key "route". 
    If that key doesn't exist, get the default value of type. 
    The second value (ok) is a bool that is true if the key exists in the map, 
    and false if not. 
    */
    value, test := myMap["route1"]
    fmt.Println("route1 exist ? ",test ,"value =",value)
    value2, test2 := myMap["route2"]
    fmt.Println("route2 exist ? ",test2 ,"value =",value2)
    
    //testing without getting value
     _, test3 := myMap["route2"]
     fmt.Println(test3)
     
     
     //To iterate over the contents of a map, use the range keyword: 
     for key, value := range myMap2 {
	    fmt.Println("Key:", key, "Value:", value)
	 }
    
}

