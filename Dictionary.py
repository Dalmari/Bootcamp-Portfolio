definitions = {
        'asap': 'As soon as possible',
        'omw': 'Oh my word',
        'smh': 'Shakes my head',
        'tldr': 'Too long, didn\'t read',
    }

definitions['np']='no problem'
definitions['brb']='be right back'


lookup = raw_input("Enter abbreviation to lookup: ")
if lookup in definitions.keys():
    print lookup + ": "+ definitions[lookup]
else:
    print "Abbreviation not found."

