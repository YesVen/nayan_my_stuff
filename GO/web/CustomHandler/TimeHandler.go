package main

import ( 
  "net/http"
  "time"
)

/*
 we have an object (in this case it's a timeHandler struct, 
 but it could equally be a string or anything else),
 and we've implemented a method with the signature 
 ServeHTTP(http.ResponseWriter, *http.Request) on it. 
 That's all we need to make a handler.

*/
type timeHandler struct {
  format string
}
func (th *timeHandler) ServeHTTP(w http.ResponseWriter, r *http.Request) {
  tm := time.Now().Format(th.format)
  w.Write([]byte("The time is: " + tm))
}

func main() {
	  mux := http.NewServeMux() 
	  th := &timeHandler{format: time.RFC1123} 
	  mux.Handle("/", th) 
	  http.ListenAndServe(":3889", mux)
  
// A DefaultServeMux gets instantiated by default when the HTTP package is used
//	  th := &timeHandler{format: time.RFC1123}  
//	  http.Handle("/", th)  	              						   				// http.Handle("/time1", http.StripPrefix("/time1", th))						
//	  http.ListenAndServe(":8996", nil)
  
   
}









// //reuse the timeHandler in multiple routes
//  th1123 := &timeHandler{format: time.RFC1123}
//  mux.Handle("/time/rfc1123", th1123)
//
//  th3339 := &timeHandler{format: time.RFC3339}
//  mux.Handle("/time/rfc3339", th3339)