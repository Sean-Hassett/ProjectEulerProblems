package main

import "fmt"

func isValidNum(num int) bool {
	for i := 20; i > 0; i-- {
		if num%i != 0 {
			return false
		}
	}
	return true
}

func main() {
	testNum := 20 * 19
	testing := true

	for testing {
		if isValidNum(testNum) {
			fmt.Println(testNum)
			testing = false
		} else {
			testNum += 20
		}
	}
}
