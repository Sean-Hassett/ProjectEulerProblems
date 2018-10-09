package main

import "fmt"

const MaxN = 100

func main() {
	sumOfSquares := 0
	sum := 0

	for i := 1; i <= MaxN; i++ {
		sum += i
		sumOfSquares += i * i
	}
	fmt.Println((sum * sum) - sumOfSquares)
}
