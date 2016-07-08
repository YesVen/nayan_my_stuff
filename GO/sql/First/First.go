package main
import (
	  "fmt"
      "database/sql"
	_"github.com/go-sql-driver/mysql"
	  "log"
)
//go get github.com/go-sql-driver/mysql

func main() {
	  db,err := sql.Open("mysql", "root:root@(localhost:3306)/go") 
	if err != nil {
		log.Fatal(err) 
	}
	err = db.Ping()
		if err != nil {
			fmt.Println("ping")
		}
	defer db.Close()
	
	var (
	id int
	name string
   )
	rows, err := db.Query("select id, name from users where id = ?", 100)
	if err != nil {
		log.Fatal(err) 
	}
	defer rows.Close()
	
	for rows.Next() {
		err := rows.Scan(&id, &name)
		if err != nil {
			log.Fatal(err)
		} 
		fmt.Println(id, name)
	}
	
}

