package main

import (
	"fmt"
	"strconv"
)

func isPalindrome(num int) bool {
	s := strconv.Itoa(num)
	n := len(s)
	for n > 1 {
		if s[0] != s[n-1] {
			return false
		}
		s = s[1 : n-1]
		n = len(s)
	}
	return true
}

func main() {
	largestPalindrome := 0

	for i := 999; i > 100; i-- {
		for j := i; j > 100; j-- {
			num := i * j
			if num > largestPalindrome {
				if isPalindrome(num) {
					largestPalindrome = num
					break
				}
			}
		}
	}
	fmt.Println(largestPalindrome)
}
