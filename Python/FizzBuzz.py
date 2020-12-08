###
# > FizzBuzz Test using Python Programming Language 
# > Author: Yakubu Shehu
# > https://github.com/YakubuShehu
# > https://yakubushehu.com
###


outputString = ""

for i in range(1,101):

    if ((i%3 == 0) and (i%5 == 0)):
        outputString+="FizzBuzz ";
        
    elif (i%3 == 0):
        outputString+="Fizz ";
        
    elif (i%5 == 0):
        outputString+="Buzz ";
        
    else:
        outputString+=(str(i) + " ");


print(outputString)


input("\n\nPress any key to continue");
