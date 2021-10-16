(ns pokedex-clj.core)

(defn poke-url
  "build a urll for pokeapi"
  [& colls]
  (->> (cons "https://pokeapi.co/api/v2" colls)
       (interpose "/")
       (apply str)))