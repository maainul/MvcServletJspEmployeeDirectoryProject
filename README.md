# MvcServletJspEmployeeDirectoryProject

![MvcArchitecture](https://user-images.githubusercontent.com/37740006/86908658-b5c2e700-c138-11ea-9231-83e10fe32e70.png)


## Points To Remember of MVC Pattern

1. Clinet(Browser) send request to the controller (Application).

2. Once the Controller accept the request if additional data is 

   required then Controller communicate with the Model.

3. If client request from data that are in the database then Model fetch the data from 

    the database by help of Helper class And response data back to the Controller.

4. Controller Sends data to the view page

## Key points:

1. Model is POJO(plain Java object).

2. Model holds business logic

3. Never write business logic on Controller

4. Controller only exepting request and sending the response.


## Model = Normal Class   | View = .jsp   | Controller = Servlet

## Summary:

1. Controller : Control data flow.

2. Model : Holds database query. Business Logic

3. View : Design of page,show data page.


## How TestController perform operation

1. once you start the tom-cat server it will open this link: http://localhost:8080/TestDBProject/TestController

2. It will call the web.xml file

### web.xml

```.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
  <display-name>TestDBProject</display-name>



  <servlet>
    <description></description>
    <display-name>TestController</display-name>
    <servlet-name>TestController</servlet-name>
    <servlet-class>TestController</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>TestController</servlet-name>
    <url-pattern>/TestController</url-pattern>
  </servlet-mapping>
</web-app>




```


3. In the web.xml file it will first the .<url-pattern>/TestController</url-pattern>


4. Once it match then it will call the <servlet-name>TestController</servlet-name>

5. After calling the servlet name it will then go to the <servlet> </servlet>

```.xml
 <servlet>
    <description></description>
    <display-name>TestController</display-name>
    <servlet-name>TestController</servlet-name>
    <servlet-class>TestController</servlet-class>
  </servlet>
```

6. Once Servlet is matching It will call the  <servlet-class>TestController</servlet-class>

7. In the servlet class there is TestController. It is a java class file.

8. This class contains : TestController.java


```.java


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("test_view.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

```
9. It will call the method (doGet).

```.java

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("test_view.jsp");
		rd.forward(request, response);


```

10. doGet Method call the view page .... test_view.jsp

![view_page](https://user-images.githubusercontent.com/37740006/86908979-3bdf2d80-c139-11ea-93d8-d141e38c3ec7.png)



# Employee Directory Project

## Project Requirement

1. List Employee

2. Add new Employee

3. Update Employee

4. Delete Employee

Employee Directory_ is a web application developed using **JSP and Servlets**. The goal of the application is to keep track of the employees and the application involves the basic **CRUD** operations, it also involves the **MVC Design pattern**. 

## Tools and Technologies used

1. JSP
2. Servlets
3. MVC Design Pattern
4. MySQL Workbench
5. Bootstrap 4
6. Eclipse Oxygen
7. Apache tomcat 8

## Steps to install


1.Clone the application




2.Create a MySQL Database

```sql
CREATE DATABASE employeedirectory;
```

3.Create a table and insert values

```sql
create table tbl_employee(
id int primary key not null auto_increment,
name varchar(255) not null,
dob varchar(255) not null,
department varchar(255) not null
);

insert into tbl_employee(name, dob, department)values("Jhon", "12-12-1991", "Marketing");

insert into tbl_employee(name, dob, department)values("Sara", "21-05-1992", "Testing");

insert into tbl_employee(name, dob, department)values("Paul", "23-04-1988", "Development");

insert into tbl_employee(name, dob, department)values("David", "18-03-1989", "Support");
```

4.Change the MySQL Username and Password as per your installation

+ open `src/in/bushansirgur/util/DBConnectionUtil.java` file.
+ change `USERNAME` and `PASSWORD` as per your installation.

You can see the full post @ [Here](https://bushansirgur.in/creating-mvc-database-web-application-in-jsp-and-servlets-create-read-update-delete/)

For More Awesome Projects Subscribe to  Youtube channel [B2 Tech](https://www.youtube.com/b2tech) 

If you find any difficulty in installing the application then reach @ [Bushan Sirgur](http://BushanSirgur.in)

