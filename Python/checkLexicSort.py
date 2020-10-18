#checks if a list of strings is sorted

stringList = ["apple", "cat", "bat"]

def sort(lists):

    if not lists:
        print("empty")
        return False

    for i in range(len(lists)-1):
        if lists[i] > lists[i+1]:
            return False
    return True

print(sort(stringList))
