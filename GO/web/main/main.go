package main

import ( 
   "net/http"
   "html/template"
)

type User struct{
	Name string
	Pass string
}
func main(){

	templates,_ :=template.ParseFiles("views/Login.html")
	http.HandleFunc("/login", func(w http.ResponseWriter ,r *http.Request){ 
		 templates.ExecuteTemplate(w,"Login.html",nil)      
     })
	
	templates2,_ :=template.ParseFiles("views/welcome.html")
	http.HandleFunc("/submit", func(w http.ResponseWriter ,r *http.Request){ 
	     name:=r.FormValue("name")
         password:=r.FormValue("password")
         user:=User{Name:name,Pass:password} 
		 templates2.ExecuteTemplate(w,"welcome.html",user)
      
     })
	http.ListenAndServe(":9996", nil)	
}
