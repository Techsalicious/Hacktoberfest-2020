-- Recursively checks if every item in a List is different or not
allDifferent :: Eq a => [a] -> Bool
allDifferent [] = True
allDifferent [_] = True
allDifferent (x:xs) = (notElem x xs) && (allDifferent xs)
