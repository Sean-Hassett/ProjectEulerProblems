package main

import "fmt"

// a < b < c
// a + b + c = 1000

func main() {
	for a := 1; a <= 332; a++ {
		for b := a + 1; b <= 499; b++ {
			c := 1000 - a - b
			if c*c == a*a+b*b {
				fmt.Println(a * b * c)
			}
		}
	}
}
