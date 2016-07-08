package main

import ( 
  "net/http"
  "time"
)

func timeHandler(w http.ResponseWriter, r *http.Request) {
  tm := time.Now().Format(time.RFC1123)
  w.Write([]byte("The time is: " + tm))
}

func main() {
	  mux := http.NewServeMux()
	  // Convert the timeHandler function to a HandlerFunc type
	  th := http.HandlerFunc(timeHandler)
	  // And add it to the ServeMux
	  mux.Handle("/", th)
	  http.ListenAndServe(":8800", mux)

   /* ServeMux.HandleFunc method is sortcut for converting a 
      function to a HandlerFunc type and then adding it to a ServeMux */
//	  mux := http.NewServeMux()
//	  mux.HandleFunc("/", timeHandler) 
//	  http.ListenAndServe(":3000", mux)
 
 // using annonymous function 
//     mux := http.NewServeMux()
//	 mux.HandleFunc("/", func(w http.ResponseWriter ,req *http.Request){
//			 tm := time.Now().Format(time.RFC1123)
//             w.Write([]byte("The time is: " + tm))
//		}) 
//	 http.ListenAndServe(":9019", mux)
 
// A DefaultServeMux gets instantiated by default when the HTTP package is used 
//	 http.HandleFunc("/", func(w http.ResponseWriter ,req *http.Request){
//			 tm := time.Now().Format(time.RFC1123)
//             w.Write([]byte("The time is: " + tm))
//		}) 
//	 http.ListenAndServe(":9919", nil)

}











//using http.Handle
//	  th := http.HandlerFunc(timeHandler) 
//	  http.Handle("/", th)  	              						   // http.Handle("/time1", http.StripPrefix("/time1", th))						
//	  http.ListenAndServe(":8996", nil)
