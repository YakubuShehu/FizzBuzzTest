<?php

// --------
// FizzBuzz Test using Java Programming Language 
// Author: Yakubu Shehu
// https://github.com/YakubuShehu
// https://yakubushehu.com
// --------

$outputString = "";

for ($i = 1; $i < 101; $i++) {
	
	if (($i % 3 == 0) && ($i % 5 == 0)) {
        $outputString .= "FizzBuzz ";
	}
	else if ($i % 3 == 0) {
		$outputString .= "Fizz ";
	}
	else if ($i % 5 == 0) {
		$outputString .= "Buzz ";
	}
	else {
		$outputString .= $i . " ";
	}
}

echo $outputString;

?>