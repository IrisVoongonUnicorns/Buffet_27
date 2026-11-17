import random
ver= int(input("How many numbers do you want to put in? "))
pither= [0,1,2,3,4,5,6,7,8,9,10]
for x in range (0, ver-1):
    pither[x]= random.randrange(0,10)
    print(pither[x], end=", ")
print(pither[x])