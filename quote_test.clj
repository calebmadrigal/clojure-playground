
(defn runcode [c] 
    (println (format "%s \n\t=> %s" c (eval (read-string c)))))

(println "Quote:")
(runcode "(cons 1 '(2 3))")

(println '(1 2 3)) ; quote
(println `(1 2 3)) ; syntax-quote

(println "Unquote:")
(println '(1 2 ~(+ 3 4)))
(println `(1 2 ~(+ 3 4)))

(let [x 5]
	(println `(1 2 3 4 ~x)))

(println "Unquote splice:")
(let [x '(2 3)]
	(println `(1 ~x))
	(println `(1 ~@x)))
