package main
import (
	  "fmt"
      "database/sql"
	_"github.com/go-sql-driver/mysql"
	   
) 
func main() { 
	var`id int
	var name string 
	
	 db,_ := sql.Open("mysql", "root:root@(localhost:3306)/go") 											// tx, err := db.Begin()
	 
	 
	 rows, _ := db.Query("select id, name from users where id = ?", 100)
	for rows.Next() { 
        rows.Scan(&id, &name) 
		fmt.Println(id, name)
	} 
	
//	selectstmt, _ := db.Prepare("select id, name from users where name = ?")
//	rows1,_:=selectstmt.Query("bbb")
	
//	
//	for rows1.Next() { 
//        rows1.Scan(&id, &name) 
//		fmt.Println(id, name)
//	} 

//   err = db.QueryRow("select name from users where id = ?", 100).Scan(&name)

//	
//	
//	insertstmt, _ := db.Prepare("insert into users values (?,?)")
//	insertstmt.Exec(400,"ddd")
	
//	editstmt, _ := db.Prepare("update users set name=? where id=?")
//	editstmt.Exec("kkk",200)
	
	deletestmt, _ := db.Prepare("delete from users where id=?")
	deletestmt.Exec(300)
	
	
	defer db.Close()
}

