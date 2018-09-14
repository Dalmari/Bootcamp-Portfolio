age = int(raw_input("In what year were you born? \n"))
import datetime
now = datetime.datetime.now()
calc_age = now.year-age     #Current age
if calc_age > 18 :
    print "Congrats you are old enough."
