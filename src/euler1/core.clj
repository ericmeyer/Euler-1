(ns euler1.core)

(defn divisible-by? [denominator numerator]
  (= 0 (rem numerator denominator)))
  
(defn divisible-by-three-or-five? [n]
  (or (divisible-by? 3 n) (divisible-by? 5 n)))
  
(defn sum-of-natural-numbers-divisble-by-three-or-five-less-than [max]
  (reduce + (filter divisible-by-three-or-five? (range 1 max))))