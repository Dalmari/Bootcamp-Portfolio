weight = float(raw_input("Please enter your weight (in kgs): \n"))
height = float(raw_input("Please enter your height (in metres): \n"))

BMI = weight / (height * height)
print "Your BMI is " + str(BMI)
if (BMI >= 30) :
    print "You are obese."
elif (BMI >= 25) :
    print "You are overweight."
elif (BMI >= 18.5) :
    print "You are normal."
else:
    print "You are underweight."
