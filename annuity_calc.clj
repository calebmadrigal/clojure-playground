#!/usr/bin/env clj
; reduce(lambda total, addition: total + [(total[-1] + addition) * (1 + interest)], [addition_per_year] * years, [starting_amount])

(defn annuity [years interest add init]
    (reduce
        #(conj %1 (* (+ (last %1) %2) (+ 1 interest)))
        [init]
        (for [i (range years)] add)))

; Find investment returns by year for a $1000 investment at 7% interest
; for 10 years.
(println (annuity 10 0.07 0 1000))

; Find annuity value if contributing $1000 each month and starting with $7777
; with 10% interest for 10 years.
(println (annuity 10 0.10 1000 7777))

; Find annuity value if contributing $1000 each month and starting with $777
; with 10% interest for 10 years.
(println (annuity 10 0.07 0 1000))

; Test perpetuity annuity that pays out $6000 per year, given a $100000
; at 6.4% interest.
(println (annuity 30 0.064 -6000 100000))
