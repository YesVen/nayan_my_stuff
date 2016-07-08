package main 

import "fmt"

/*
const pi=3.14
const language="GO"
*/
const(                // to avoid repeatation of const use ()
	pi=3.14;
	language="GO"
) 
const(
	 
	/*iota identifier is used in const declarations
	 to simplify definitions of incrementing numbers.*/
    a=iota           
    b=iota
    c=iota        // (0,1,2)
    )
const(
	  d= 12         
      e=iota
      f         // (12,1,2)
    
//    d=iota           
//    e =12
//    f          //(0,12,12)
    
//     d=iota           
//     e =12
//     f =iota     //(0,12,2)
)

//const( 
//	   
////	  m=10 * (2 + iota)      //10*(2+0),10*(2+1),10*(2+2)
////    m=10 + (5* iota)       //10+(5*0),10+(5*1),10+(5*2),
////    m=5 - (3-iota)         //5-(3-0),5-(3-1),5-(3-2)
//    m=10 << (3* iota)             // left shift 3 times 
//    n 
//    o 
//)
func main() {
	 fmt.Println(pi,language)
	 fmt.Println(a,b,c)
	  fmt.Println(d,e,f) 
//	 fmt.Println(m,n,o) 

}

