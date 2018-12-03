package main

import (
	"fmt"
	"math"
)

func isPrime(num int) bool {
	if num%2 == 0 {
		return false
	}
	for div := 3; div < int(math.Sqrt(float64(num))+1); div += 2 {
		if num%div == 0 {
			return false
		}
	}
	return true
}

func main() {
	N := 10001
	i := 2
	x := 3
	for i < N {
		x += 2
		if isPrime(x) {
			i++
		}
	}
	fmt.Println(x)
}
