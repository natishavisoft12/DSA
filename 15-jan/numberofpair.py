from collections import Counter

def count_pairs_with_sum(arr, target):
    count = 0
    freq = Counter(arr)
    
    for num in arr:
        complement = target - num
        count += freq[complement]
        
        
        if complement == num:
            count -= 1
    
    return count // 2 
arr = [1, 2, 3, 4, 3]
target = 6
print(count_pairs_with_sum(arr, target))  