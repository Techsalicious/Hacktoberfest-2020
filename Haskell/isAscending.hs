isAscending :: (Ord a) => [a] -> Bool
isAscending xs = and [ x <= y | (x,y) <- zip xs (tail xs) ]

