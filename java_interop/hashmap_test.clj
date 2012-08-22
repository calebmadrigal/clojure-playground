(println (Math/sqrt 16))

(def name_age_map (new java.util.HashMap {"caleb" 27, "whitney" 26, "hastin" 2, "john" 27}))

(let [name "caleb"]
	(println (format "%s is %d years old." name (.get name_age_map name))))

(defn show_ages [mymap]
	(let [keyset_init (.keySet mymap)]
		(loop [keyset keyset_init]
			(when (not (empty? keyset))
				(let [name (first keyset)
					  age (.get mymap keyset)]
					(println (format "- %s is %d years old." name age))
					(recur (rest keyset)))))))

(println "\nAll keys:")
(show_ages name_age_map)

