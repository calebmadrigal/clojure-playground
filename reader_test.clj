(println (pr-str '(1 2 3)))
(println (read-string "(1 2 3)"))
(println (eval (read-string "(* 4 5)")))
(println (eval '(conj '(1 2) 3)))

(defn runcode [c]
    (println (format "%s \n\t=> %s" (pr-str c) (eval c))))

(println)
(runcode '(+ 2 3))
