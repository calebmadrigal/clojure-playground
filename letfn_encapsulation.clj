(letfn [(fact [acc n]
            (if (zero? n) acc
                (recur (* n acc) (dec n))))]
    (defn factorial [n] (fact 1 n)))

(println (factorial 5))

