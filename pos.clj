#!/usr/bin/env clojure

(defn pos [e coll]
    (loop [idx 0, s coll]
        (if (= e (first s))
            idx
            (recur (inc idx) (next s)))))


(println (pos 7 '(6 2 3 7 2)))


