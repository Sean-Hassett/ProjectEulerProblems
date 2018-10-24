package main

import "fmt"

const MaxN = 1000

func main() {
	sum := 0
	for i := 3; i < MaxN; i++ {
		if i%3 == 0 || i%5 == 0 {
			sum += i
		}
	}
	fmt.Println(sum)
}
