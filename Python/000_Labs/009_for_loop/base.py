a = int(input("Please enter line length: "))
b = input("What type of line do you prefer: vertical or horizontal? ")
horizontal= b=="horizontal";
vertical= b=="vertical";
if(vertical):
    for a in range(0,a):
        print("*")
if(horizontal):
    for a in range(0,a):
        print("*", end= "")