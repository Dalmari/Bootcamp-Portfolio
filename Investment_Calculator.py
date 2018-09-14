import math
P = float(raw_input("What amount are you investing?\n"))
i = float(raw_input("Enter the interest rate (%)\n"))/100
t = float(raw_input("How many years will you be investing?\n"))
interest = raw_input("Would you prefer simple or compund interest? (Simple/Compound):\n")

if (interest.upper() == "SIMPLE") :
    payout = P * (1+ i * t)
    print "At the end of the " + str(t) + " year(s) you will receive ZAR " + str(payout)
elif (interest.upper() == "COMPOUND") :
    payout = P * math.pow((1 + i),t) 
    print "At the end of the " + str(t) + " year(s) you will receive ZAR " + str(payout)
else :
    print "You did not enter 'simple' or 'compound', please start again"
