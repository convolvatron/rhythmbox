(defproject rhythmbox "zero"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins [[speclj "3.3.2"]]
  :target-path "target/%s"
  :test-paths ["spec"]
  :main rhythmbox.main
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}})
