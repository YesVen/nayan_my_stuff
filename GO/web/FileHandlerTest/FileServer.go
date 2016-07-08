
package main 
import  "net/http"  

   func main(){   
   //create an empty ServeMux.	
	  mux := http.NewServeMux()
   //create a new handler.
	  fs := http.FileServer(http.Dir("public"))  
   //register new handler with ServeMux
	  mux.Handle("/", fs)
   /*create a new server and start listening for incoming requests */
	  http.ListenAndServe(":8884", mux)
	  
// A DefaultServeMux gets instantiated by default when the HTTP package is used		   
//	  fs := http.FileServer(http.Dir("public"))
//	  http.Handle("/", fs)     																		// http.Handle("/file/", http.StripPrefix("/file/", fs))
//	  http.ListenAndServe(":8099", nil)
    
   
 // http.ListenAndServe(":8999" , http.FileServer(http.Dir("public")))
} 