selection = int(raw_input("Enter the number for which you'd like its times' tables: \n"))
print "The " + str(selection) + " times table is:"

for i in range (1, 13):
    calc = selection * i
    print str(selection) + " x " + str(i) + " = " + str(calc)
