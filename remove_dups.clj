#!/usr/bin/env clojure

(defn remove-dups-by-key [map_coll thekey]
    (loop [result [],
           seen-names #{},
           unseen-maps map_coll]
        (if (empty? unseen-maps)
            result
            (let [current (first unseen-maps),
                  current-name (current thekey)]
                (if (seen-names current-name)
                    (recur result seen-names (rest unseen-maps))
                    (recur (conj result current) (conj seen-names current-name) (rest unseen-maps)))))))

(defn remove-dups-by-key2 [map_coll thekey]
    (vals (reduce #(assoc %1 (thekey %2) %2) {} map_coll)))


(def m [{:name "Caleb" :value 1}
        {:name "Whitney" :value 2}
        {:name "Hastin" :value 3}
        {:name "Caleb" :value 4}])

(println (remove-dups-by-key m :name))
(println (remove-dups-by-key2 m :name))
