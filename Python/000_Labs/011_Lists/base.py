import random
joke1= "Why did the chicken cross the road? To get to the other side."
joke2= "Why was the coder scared of computer science? Because it was a python."
joke3= "People talk about Iran this and Israel that, but Iran a marathon and the struggle isreal."
joke4= "Who lives in a pinapple under the sea? I don't know, Spongebob?"
joke5= "Why did Elsa hold onto the magic? She couldn't let it go."

team=[joke1, joke2, joke3, joke4, joke5]
other= random.randrange(0,4)
if other==0:
    print(joke1)
elif other==1:
    print(joke2)
elif other==2:
    print(joke3)
elif other==3:
    print(joke4)
else:
    print(joke5)