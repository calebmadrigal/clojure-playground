#!/usr/bin/env clojure

(defn myrange
    [& {:keys [start end] :or {start 0 end :inf}}]
        (cond
            (and (= end :inf) (= start 0)) (range)
            (not (= start 0)) (drop-while #(< % start) (range))
            :else (range end)))

(println (myrange :end 5))
(println (take 20 (myrange)))
(println (take 20 (myrange :start 10)))
