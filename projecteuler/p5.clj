#!/usr/bin/env clojure

(println
    (first 
        (take 1
            (for [i (next (range)) :when 
                (every? #(= 0 %)
                    (map #(mod i %) 
                         (range 1 21)))] i))))

