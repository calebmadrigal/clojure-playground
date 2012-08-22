#!/usr/bin/env clojure
(println (into (vector-of :char) [65 66 67]))

(println (into [] '(1 2 3)))

(def a-to-j (vec (map char (range 65 75))))

(println (nth a-to-j 4))
(println (get a-to-j 5))
(println (a-to-j 6))

(println (assoc a-to-j 0 "Caleb"))
(println (replace {\A :a, \C :c} a-to-j))

(def matrix [[1 2 3] [4 5 6] [7 8 9]])

(println (get-in matrix [1 2]))
(println (assoc-in matrix [1 2] "caleb"))

; Stack operations

(def stack [1 2 3])
(def stack2 (conj stack 4))
(println stack2)
(println (peek stack2))
(println (pop stack2))

; Vectors instead of reverse

(defn mymap [f coll]
    (loop [acc '()
           f f
           coll coll]
        (if (empty? coll)
            (reverse acc)
            (recur (conj acc (f (first coll))) f (rest coll)))))

(println (mymap #(+ % 10) '(1 2 3)))

(defn mymap2 [f coll]
    (loop [acc []
           f f
           coll coll]
        (if (empty? coll)
            acc
            (recur (conj acc (f (first coll))) f (rest coll)))))

(println (mymap2 #(+ % 20) '(1 2 3)))


; Subvec

(println (subvec a-to-j 3 6))

