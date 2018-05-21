(ns clojure-noob.core
  (:gen-class))

(defn hello-world 
  [n]
  (loop [iteration 1]
    (println "Hello World.")
    (if (= iteration n)
      (println "Goodbye!")
      (recur (inc iteration)))))

(defn -main
  []
  (hello-world 5))

