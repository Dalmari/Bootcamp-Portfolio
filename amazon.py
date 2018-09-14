import codecs                                           #use UTF-8
print "PRINT CONTENTS"
contents = ""
f = codecs.open ( 'input_optional.txt' , 'r+','utf-8') # Open the file, read contents, encoding with UTF
for line in f:
        contents = contents + line
print contents
f.close()

pfile = open ( 'output_optional.txt' , 'w' )
f = codecs.open ( 'input_optional.txt' , 'r+','utf-8')
lines = contents.split('\n')            #create seperate lines
print lines[0]

import numpy as np #module used for calculating percentiles

percx = []
minx = []
maxx = []
avex = []
sumx = []

for n, line in enumerate(f, 0):
            if "min" in lines[n]:       #check what operation each line is
                        minimum = min(int(s) for s in lines[n].split(":")[1].split(','))
                        minx.append("The min of " + str([int(s) for s in lines[n].split(":")[1].split(',')]) + " is " + str(minimum))
            if "max" in lines[n]:
                       maximum = max(int(s) for s in lines[n].split(":")[1].split(','))
                       maxx.append("The max of " + str([int(s) for s in lines[n].split(":")[1].split(',')]) + " is " + str(maximum))
            if "avg" in lines[n]:
                       average = sum(int(s) for s in lines[n].split(":")[1].split(','))/float(len([int(s) for s in lines[n].split(":")[1].split(',')]))
                       avex.append("The avg of " + str([int(s) for s in lines[n].split(":")[1].split(',')]) + " is " + str(average))
            if "sum" in lines[n]:
                       total = sum(int(s) for s in lines[n].split(":")[1].split(','))
                       sumx.append("The sum of " + str([int(s) for s in lines[n].split(":")[1].split(',')]) + " is " + str(total))
            elif "p" in lines[n]:
                       perc = np.percentile(np.array([int(s) for s in lines[n].split(":")[1].split(',')]),(lines[n].split('p'))[1].split(':')[0])
                       percx.append("The " + str((lines[n].split('p'))[1].split(':')[0]) +"th percentile of " + str([int(s) for s in lines[n].split(":")[1].split(',')]) + " is " + str(perc))
for item in minx:
  pfile.write("%s\n" % item)
for item in maxx:
  pfile.write("%s\n" % item)
for item in percx:
  pfile.write("%s\n" % item)
for item in avex:
  pfile.write("%s\n" % item)
for item in sumx:
  pfile.write("%s\n" % item)

pfile.close()
