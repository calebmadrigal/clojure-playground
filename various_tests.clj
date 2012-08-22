#!/usr/bin/env clojure

(defn factorial [n]
   (loop [acc 1
          num n]
      (if (= 0 num) acc
          (recur (* num acc) (- num 1)))))

(def x 5)
(print (format "(factorial %d) = %d\n" x (factorial x)))

(defn mymax [lst-init]
    (loop [mx (first lst-init)
           lst (rest lst-init)]
        (if (empty? lst) mx
            (let [current (first lst)
                  larger (if (> current mx) current mx)]
                (recur larger (rest lst))))))

(println (mymax '(4 2 6 6 2 43 9)))

