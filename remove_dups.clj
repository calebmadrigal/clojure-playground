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

                
(def m [{:name "foo" :value 1} {:name "baz" :value 2} {:name "foo" :value 3}])

(println (remove-dups-by-key m :name))

; An alternate implementation
(println
    ((fn [recs]
        (vals (reduce #(assoc %1 (:name %2) %2) {} recs)))
            m))
