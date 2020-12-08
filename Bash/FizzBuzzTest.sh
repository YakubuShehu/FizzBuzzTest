#!/bin/bash


echo "[Bash version --> ${BASH_VERSION}]"
echo ""

####
# > FizzBuzz Test using Python Programming Language 
# > Author: Yakubu Shehu
# > https://github.com/YakubuShehu
# > https://yakubushehu.com
####


outputString=""

for i in {1..100}
do
	if [ $(($i % 3)) -eq 0 ] && [ $(($i % 5)) -eq 0 ]
	then
        outputString+="FizzBuzz "
	elif [ $(($i % 3)) -eq 0 ]
	then
		outputString+="Fizz "
	elif [ $(($i % 5)) -eq 0 ]
	then
		outputString+="Buzz "
	else
		outputString+=$i" "
	fi
done

echo $outputString