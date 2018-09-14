
######################## Function 1 ####################
print "Use function 'translate1(x)' or 'translate2(x)to get amino acid sequence using dictionary or if/elif function accordingly.\n Use 'mutate(x)'to replace 'a' with A and 'a' with 'T' and write to seperate files.\n Use txtTranslate(x) to read in from input file and translate."

SLC = {'ATT': 'I',
         'ATC': 'I',
         'ATA': 'I',
         'CTT': 'L',
         'CTC': 'L',
         'CTA': 'L',
         'CTG': 'L',
         'TTA': 'L',
         'TTG': 'L',
         'GTT': 'V',
         'GTC': 'V',
         'GTA': 'V',
         'GTG': 'V',
         'TTT': 'F',
         'TTC': 'F',
         'ATG': 'M',
         }


def translate1(x):         #x is the relevant DNA sequence to lookup
    y = [x[i:i+3] for i in range(0, len(x), 3)]     #split into 3 letter strings 
    return   "".join([SLC.get(item,"X") for item in y])     #"make any other codon be rinted as the amino acid X"



######################## Function 2 ####################


I = ["ATT","ATC","ATA"]
L = ["CTT","CTC","CTA","CTG","TTA","TTG"]
V = ["GTT","GTC","GTA","GTG"]
F = ["TTT","TTC"]
M = ["ATG"]
def translate2(x): 
    l = len(x)
    n = 0
    lst = []
    while n < l :
        if x[n:n+3] in I:
            lst.extend("I")
            n += 3
        elif x[n:n+3] in L:
            lst.extend("L")
            n += 3
        elif x[n:n+3] in V:
            lst.extend("V")
            n += 3
        elif x[n:n+3] in F:
            lst.extend("F")
            n += 3
        elif x[n:n+3] in M:
            lst.extend("M")
            n += 3
        else:
            lst.extend("X")
            n += 3
    return "".join(lst)


##################### Find & Replace Function ################
def mutate(x):
    with open("DNA.txt") as myFile:
        for num, line in enumerate(myFile, 1):
            if x in line:
                print "found in line ", num
                f = open("DNA.txt",'r')
        filedata = f.read()
        upper = filedata.replace("a","A")
        new = filedata.replace("a","T")
        g = open("normalDNA.txt",'w')
        g.write(upper)
        g.close()
        p = open("mutatedDNA.txt",'w')
        p.write(new)
        p.close()


################ txtTranslate Function ################

def txtTranslate(x):
      f = open(x,'r')
      filedata = f.read()
      return translate1(filedata)
    
      
