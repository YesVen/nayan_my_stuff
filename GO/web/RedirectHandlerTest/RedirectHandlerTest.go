package main

import ( 
  "net/http"
)
func main() {  
  //create an empty ServeMux.	
	  mux := http.NewServeMux()
  //create a new handler.
	  rh := http.RedirectHandler("http://www.google.com", 301)
  //register new handler with ServeMux
	  mux.Handle("/", rh) 
  //create a new server and start listening for incoming requests  
      http.ListenAndServe(":9991", mux) 
    
    
// A DefaultServeMux gets instantiated by default when the HTTP package is used
//	  rh := http.RedirectHandler("http://www.google.com", 301) 
//	  http.Handle("/", rh)  																		// http.Handle("/go", http.StripPrefix("/go", rh))	   
//    http.ListenAndServe(":8995", nil)

    
    // http.ListenAndServe(":8991" , http.RedirectHandler("http://www.google.com", 301))
  
 
}