# HibernateBasicApplication

Hibernate- It is an ORM Tool

Features- Hibernate will take care of creating tables
1. Hibernate will take care queries
2. Database Independent
3. Database Migration its very easy
4. Lightweight, Simple, Scalability
5. HQL
6. HCQL
7. Named Queries
8. Association Mapping 

Hibernate Architecture-

O[Object]               M[HBM]             R[RDBMS]
Employee.java                               Employee
empId                               empid empname empsalary
empName
empSalary

HibernateBasics
com.csi.jpa
Employee.java
Service.java

src/main/java
employee.hbm.xml
hibernate.cfg.xml

-----------------------------------

Caching in Hibernate
1. First Level Cache- Session
Each time need to create new session for every transaction

2. Second Level Cache- SessionFactory
Once create It will be available for whole application



-----------------------------------------------------------------

<!DOCTYPE hibernate-configuration PUBLIC
  "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
  "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
  
  
  ----------------------------------------------------------------------------
  
  Add below line in window-> preferences-> Java-> Installed JRE-> Default VM Arguments
  
  --add-opens java.base/java.lang=ALL-UNNAMED