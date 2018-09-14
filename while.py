sum1 = 0
count = 0
secretName = "BOB" #only Bob can trigger the loop

name = raw_input("Please enter your name: \n")  
if name.upper() == secretName:
    No = raw_input("Please enter a number, or press 'q' to exit: ")
    if No == "q":
       exit()
    else :
        while No != "-1":
            sum1 += float(No)
            count += 1
            No = raw_input("Please enter another number, or press 'q' to exit: ")
            if No == "q":
               exit()
        calc = sum1/(count)
        print "The average value of numbers entered before -1 was " + str(calc) + ", and the number of entries made before correctly entering \n -1 was " + str(count)
else :
    print "Incorrect name entered"

