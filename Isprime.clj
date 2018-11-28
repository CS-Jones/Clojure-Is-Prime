(defn is-prime? [n]
  (if (< 1 n)
    (empty? (filter #(= 0 (mod n %)) (range 2 n)))
    false))
          
(defn prime-seq [from to]
  (filter is-prime? (range from (inc to))))

(defn doprimes [x y]
  (def seqf(take 10(reverse(prime-seq x y))))
  (doseq [x seqf] (println x))
  (println (str "Total = " (reduce + seqf)))
)