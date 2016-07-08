package main 

import (
   "net/http"
   "text/template"
)
func main() {
	
	 http.HandleFunc("/",func(w http.ResponseWriter ,req * http.Request){
	 		w.Header().Add("Content Type","text/html") 
	 		
	 		templates :=template.New("template")
	 		templates.New("test").Parse(doc)
	 		templates.New("headerName").Parse(header)
	 		templates.New("footerName").Parse(footer)  
	 			context :=Context{
	 				[3]string{"Lemon","Orange","Apple"},
	 			    "The title", 
	 			}
	 			templates.Lookup("test").Execute(w,context) 
	 	   })
	 	     
	 http.ListenAndServe(":8899",nil) 
}
const doc =`
  {{template "headerName" .Title}}
  <body>
         <h1>List of Fruit</h1>       
         <ul>
            {{range .Fruit}}
            <li>{{.}}</li>
            {{end}}
         </ul>
     </body>
  {{template footerName }}
 `
const header =`
!DOCTYPE html>
  <html>
    <head>
       <title>{{.}}</title>s
     </head>
`
const footer =`
 </html>
`
type Context struct{
	Fruit [3]string
	Title string
}
