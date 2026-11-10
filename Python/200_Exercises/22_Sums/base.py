max = int(input("Please enter a number: "))
sum = 0

for stella in range (1,max+1):
    print(stella, end="+")
    sum = sum + stella
print(max)
sum = sum + max     
print("The sum is " + str(sum))
