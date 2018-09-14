year = int(raw_input("What year would you like to start with? "))
extra = int(raw_input ("How many years thereafter do you want to check? "))
end = year + extra + 1

for i in range (year, end):
    if i % 4 == 0:      #Check if multiple of 4 
          print str(i) + " is a leap year"
    else :
        print str(i) + " isn't a leap year"
