price = float(raw_input ("Please enter the price of the package you would like to purchase: ZAR"))
kms = float(raw_input ("Please enter the total distance of delivery (km): "))


method = raw_input("Would you like deliver by air or freight? (air/freight): ")
if (method.upper() == "AIR") :
    cost_method = 0.36
else:
    cost_method = 0.25

insurance = raw_input ("Would you like Full or Limited insurance? (full/limited): ")
if (insurance.upper() == "FULL") :
    cost_insurance = 50.00
else:
    cost_insurance = 25.00

gift = raw_input ("Is this a gift? (Yes/No): ")
if (gift.upper() == "YES") :
    cost_gift = 15.00
else:
    cost_gift = 0
    
priority = raw_input ("Priority or standard delivery?(Priority/standard): ")
if (priority.upper() == "PRIORITY") :
    cost_priority = 100.00
else:
    cost_priority = 20.00
print "The total delivery fee works out to:"
Total = price + (cost_method * kms) + cost_insurance + cost_gift + cost_priority
print Total
    
                 
