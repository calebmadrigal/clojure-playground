(ns calebmath)

(defn factorial [n-init]
    (loop [acc 1 n n-init]
        (if (zero? n) acc
            (recur (* n acc) (dec n)))))

