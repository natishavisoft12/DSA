def minimize_tower_diff(arr, k):
    n = len(arr)
    if n == 1:
        return 0  
    
    arr.sort()
    
    diff = arr[-1] - arr[0]
    
    smallest = arr[0] + k
    largest = arr[-1] - k
    
    for i in range(1, n):
        min_height = min(smallest, arr[i] - k)
        max_height = max(largest, arr[i - 1] + k)
        
        diff = min(diff, max_height - min_height)
    
    return diff


arr = [1, 5, 8, 10]
k = 2
print(minimize_tower_diff(arr, k))  