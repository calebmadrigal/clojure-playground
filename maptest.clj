#!/usr/bin/env clojure

(println 
    ((fn [recs] 
        (vals (reduce #(assoc %1 (:name %2) %2) {} recs))) 
            [{:name "foo" :value 1} {:name "baz" :value 2} {:name "foo" :value 3}]))

