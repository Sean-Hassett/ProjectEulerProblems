package main

import (
	"fmt"
)

func main() {
	N := 2000000
	boolArray := make([]bool, N)
	for i := 0; i < N; i++ {
		boolArray[i] = true
	}
	total := 0
	for x := 2; x < N; x++ {
		if boolArray[x] {
			total += x
			for y := x + x; y < N; y += x {
				boolArray[y] = false
			}
		}
	}
	fmt.Println(total)
}
