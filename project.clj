(defproject comportexviz "0.0.8-SNAPSHOT"
  :description "Web visualisation of HTM algorithm as implemented in comportex"
  :url "http://github.com/nupic-community/comportexviz/"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.nfrac/comportex "0.0.8-SNAPSHOT"]
                 [rm-hull/monet "0.2.1"]
                 [com.keminglabs/c2 "0.2.4-SNAPSHOT"]]
  
  :plugins [[lein-cljsbuild "1.0.3"]
            [com.cemerick/austin "0.1.5"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "demos"
                        :source-paths ["src" "examples/demos"]
                        :compiler {:optimizations :advanced
                                   :output-dir "public/demos/out"
                                   :source-map "public/demos/comportexviz.js.map"
                                   :output-to "public/demos/comportexviz.js"}}
                       {:id "cortical-io"
                        :source-paths ["src" "examples/cortical_io"]
                        :compiler {:optimizations :advanced
                                   :output-dir "public/cortical_io/out"
                                   :source-map "public/cortical_io/comportexviz_cio.js.map"
                                   :output-to "public/cortical_io/comportexviz_cio.js"}}
                       {:id "inh"
                        :source-paths ["src" "examples/local_inhibition"]
                        :compiler {:optimizations :advanced
                                   :output-dir "public/local_inhibition/out"
                                   :source-map "public/local_inhibition/comportexviz_inh.js.map"
                                   :output-to "public/local_inhibition/comportexviz_inh.js"}}
                       ]})
