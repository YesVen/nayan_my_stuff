package main 

import (
   "net/http"
   "text/template"
)
func main() {
	
	 http.HandleFunc("/",func(w http.ResponseWriter ,req * http.Request){
	 		w.Header().Add("Content Type","text/html")
	 		
	 		/*
	 		tmpl,err :=template.New("test").Parse(doc)
	 		if err==nil{
	 			tmpl.Execute(w,nil)
	 		}
	 	   })  */
	 		
	 		/*
	 		tmpl,err :=template.New("test").Parse(docParam)
	 		if err==nil{
	 			tmpl.Execute(w,req.URL.Path)
	 		}
	 	   })   */
	 		
	 		/*
	 		tmpl,err :=template.New("test").Parse(docParam2)
	 		if err==nil{
	 			context :=Context{"Citutech :)!!!"}  
	 			tmpl.Execute(w,context)
	 		}
	 	   })
	 		*/
	 		
	 		 
	 		tmpl,err :=template.New("test").Parse(docParam3)
	 		if err==nil{ 
	 			context :=&Context{"Citutech :)!!!"}
				//context :=new(Context) 
	 			tmpl.Execute(w,context)
	 		}
	 	   })
	 		
	 	     
	 http.ListenAndServe(":9099",nil) 
}


const doc =`
<!DOCTYPE html>
  <html>
    <head>
       <title>Example Title</title>
     </head>
     <body>
        <h1> Hello Templates </h1>
     </body>
   </html>
`
const docParam =`
<!DOCTYPE html>
  <html>
    <head>
       <title>Example Title</title>
     </head>
     <body>
        <h1> Hello {{.}}</h1>    
     </body>
   </html>
`
type  Context struct{
	Message string
}
func (c *Context) NameResolver()string{
	return "hello citi :))"
}
const docParam2 =`
<!DOCTYPE html>
  <html>
    <head>
       <title>Example Title</title>
     </head>
     <body>
        <h1> Hello {{.Message}}</h1>    
     </body>
   </html>
`
const docParam3 =`
<!DOCTYPE html>
  <html>
    <head>
       <title>Example Title</title>
     </head>
     <body>
        <h1> Hello {{.NameResolver}}</h1>
        <h1> Hello {{.Message}}</h1>    
     </body>
   </html>
`
// <h1> Hello {{.NameResolver(parameter1,parameter2)}}</h1>