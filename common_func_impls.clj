(defn myreduce [f init coll]
    (loop [f f coll coll acc init]
        (if (empty? coll)
            acc
            (recur f (rest coll) (f acc (first coll))))))

(defn mymap [f [x & xs]]
    (if (nil? x)
        ()
        (conj (mymap f xs) (f x))))

(defn mymax [lst-init]
    (loop [mx (first lst-init)
           lst (rest lst-init)]
        (if (empty? lst) mx
            (let [current (first lst)
                  larger (if (> current mx) current mx)]
                (recur larger (rest lst))))))

