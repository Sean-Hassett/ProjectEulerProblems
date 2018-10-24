package main

import "fmt"

const MaxN = 4000000

func main() {
	sum := 0
	f0 := 1
	f1 := 1
	temp := 0

	for f0+f1 < MaxN {
		f1 = f0 + f1
		if f1%2 == 0 {
			sum += f1
		}
		temp = f0
		f0 = f1
		f1 = temp
	}
	fmt.Println(sum)
}
