ti = int(input("Please enter a number: "))
lb = int(input("Please input a sencond number: "))
ps= input("What would you like to use? Multiply, Divide, Subtract, or Add? ")
m= ("Multiply")
d= ("Divide")
s= ("Subtract")
a= ("Add")
if ps==m:
    print(str(ti*lb))
elif ps==d:
    print(str(ti/lb))
elif ps==s:
    print(str(ti-lb))
elif ps==a:
    print(str(ti+lb))            