(ns test-library.core
  (:gen-class
   :name test.library.ClojureLibrary
   :methods
   [^:static [sayHello [] String]]))

(defn -sayHello []
  "Hello, World!")
