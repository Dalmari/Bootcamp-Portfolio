import math
menu = ['nachos','tortillas','quesidillas','jalapenos','guacamole']
stock = {'nachos': 550,
         'tortillas': 1000,
         'quesidillas': 800,
         'guacamole': 100,
         'wildcard': 40
         }
price = {'wildcard': 0,
         'nachos': 99,
         'quesidillas': 95,
         'tortillas': 45,
         'guacamole': 35
         }
print {k: price[k]*stock[k] for k in price}
print "ZAR " + str(sum (price[k]*stock[k] for k in stock))
