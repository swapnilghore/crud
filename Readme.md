
# Crud API in Springboot and Hibernate

It is an API created with the help of springboot and hibernate.

It will perform operations to read, add, update, delete the record of Student from the database.
## API Reference

### Get all the students from database

```http
  GET /getallstudents
```

### Get a single students from database

```http
  GET /getstudent/{rollno}
```

### Get a single students from database

```http
  POST /addstudent/stud
```
#### Send the Student object in json format

### Get a single students from database

```http
  PUT /updatestudent
```
#### sample url = localhost:8080/updatestudent?rno=10&name=Ram

### Get a single students from database

```http
  DELETE /deletestudent/rollno
```
#### sample url = localhost:8080/deletestudent/10110


#### Note: rollno is the RollNmber of student.


## Steps to configure project on local
### (Note: Mysql 5.1 version is used )
- Clone this repository.
- loacate the jar in home directory and add it to project.
- Run the project as Java Application.
- Test the endpoints in Postman.

