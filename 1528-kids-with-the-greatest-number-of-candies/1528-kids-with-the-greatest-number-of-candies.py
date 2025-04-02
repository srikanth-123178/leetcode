class Solution:
    def kidsWithCandies(self, candies, extraCandies):
        max_candies = max(candies)  # Find the maximum number of candies any kid has
        return [candy + extraCandies >= max_candies for candy in candies]  # Return boolean list

# Driver code (Only needed for local testing, GFG usually handles input/output)
if __name__ == "__main__":
    # Example test cases
    sol = Solution()
    
    candies1 = [2, 3, 5, 1, 3]
    extraCandies1 = 3
    print(sol.kidsWithCandies(candies1, extraCandies1))  # Output: [True, True, True, False, True]
    
    candies2 = [4, 2, 1, 1, 2]
    extraCandies2 = 1
    print(sol.kidsWithCandies(candies2, extraCandies2))  # Output: [True, False, False, False, False]
    
    candies3 = [12, 1, 12]
    extraCandies3 = 10
    print(sol.kidsWithCandies(candies3, extraCandies3))  # Output: [True, False, True]
