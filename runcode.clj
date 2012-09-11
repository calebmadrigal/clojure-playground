; Allows you to do (runcode '(+ 2 3)), and it displays "(+ 2 3) => 5"
(defn runcode [c]
    (println (format "%s \n\t=> %s" (pr-str c) (eval c))))
