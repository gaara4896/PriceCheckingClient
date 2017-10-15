# Price Checking Client

### Tools

```
oracle jdk 8
sbt
```

### Run

`sbt`

`run`

### Usage

Usage: COMMAND [ARGS]

Commands:
help    To know usage of command                
price   Get the price with name of item         
code    Get the price with code of the item     
exit    Exit the system
admin   Use as admin

### Example

```
$admin add 88888 Milk 3.5
Enter Password: admin
Successfully added item with code: 88888 and name Milk
```

```
$item Coffee
Code: 12345, Name: Coffee, Price:20.0
Code: 12344, Name: Coffee, Price:30.0
```

##### Default admin password: _admin_
