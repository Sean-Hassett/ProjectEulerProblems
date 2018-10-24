package main

import (
	"fmt"
	"math"
)

const N = 600851475143

func isPrime(num int) bool {
	if num%2 == 0 {
		return false
	}
	div := 3
	for div < int(math.Sqrt(float64(num))) {
		if num%div == 0 {
			return false
		}
		div += 2
	}
	return true
}

func main() {

	for div := int(math.Sqrt(float64(N))); div > 2; div-- {
		if N%div == 0 {
			if isPrime(div) {
				fmt.Println(div)
				div = 0
			}
		}
	}
}
