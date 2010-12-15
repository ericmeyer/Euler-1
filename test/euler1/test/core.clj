(ns euler1.test.core
  (:use [euler1.core] :reload)
  (:use [clojure.test]))

(deftest three-is-divisible
  (is (divisible-by-three-or-five? 3)))

(deftest two-is-not-divisible
  (is (not (divisible-by-three-or-five? 2))))

(deftest five-is-divisible
  (is (divisible-by-three-or-five? 5)))

(deftest fifteen-is-divisible
  (is (divisible-by-three-or-five? 15)))

(deftest sum-less-than-1
  (is (= (sum-of-natural-numbers-divisble-by-three-or-five-less-than 10) 23)))
  
(deftest sum-less-than-1000
  (is (= (sum-of-natural-numbers-divisble-by-three-or-five-less-than 1000) 233168)))