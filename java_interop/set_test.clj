(println
	(let [origin (java.awt.Point. 0 0)]
		(set! (.x origin) 5)
		(set! (.y origin) 10)
		(str origin)))
