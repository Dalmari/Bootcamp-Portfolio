#generate random number between 10 and 99
import random
lotteryNo = (random.randint(10,99))
#lotteryNo = 31  #for testing

done = False                     #Creating a loop on the try command
while not done:
    try:
        entry = (raw_input("Please enter any two digit number here: "))
        done = True
    except ValueError:
        entry = (raw_input("Sorry, you did not enter a number with 2 digits, press enter to start again. "))


while len((entry))!= 2 :           #loop like a boss if not using 2 characters
    entry = (raw_input("Sorry, you did not enter a number with 2 digits, try again: "))

print "User's pick was " + (entry[0]) + (entry[1])
lotteryNo_str = str(lotteryNo)
print  "And the lottery number was... "+ lotteryNo_str[0] + lotteryNo_str[1]

if (lotteryNo_str == entry) :
    print "Congratulations you have an exact match, you win R10 000.00"
elif (entry[0] == lotteryNo_str[1]) and (entry[1] == lotteryNo_str[0]):
    print "Congratulations you have all the digits (but in reverse), you win R5 000.00"
elif (entry[0] == lotteryNo_str[0]) or (entry[0] == lotteryNo_str[1]) or (entry[1] == lotteryNo_str[0]) or (entry[1] == lotteryNo_str[0]):
    print "Congratulations you have one correct digit, you win R1 000.00"
else :
    print "Sorry, no matches."
    

