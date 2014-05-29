(ns import-admin-boundaries.core
  (:gen-class)
  (:require [clojure.tools.cli :refer [parse-opts]]))

(def database-default "pangaeaultima"

(def cli-opts
  ["-u" "--username USERNAME" "username for the database connection"]
  ["-p" "--password PASSWORD" "password for the database connection"]
  ["-d" "--database DATABASE" "database where the GEOSHAPE and GEOSHAPE_NAME table exists"]
  )
  
(defn -main
  "import geojson document into the GEOSHAPE and GEOSHAPE_NAME tables."
  [& args]
  nil)
