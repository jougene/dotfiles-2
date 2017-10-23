{:user  {:plugins  [[cider/cider-nrepl "0.15.1"]
                    [lein-ancient "0.6.12"]
                    [lein-cljfmt "0.5.7"]
                    [lein-cloverage "1.0.9"]
                    [lein-kibit "0.1.5"]
                    [lein-vanity "0.2.0"]
                    [jonase/eastwood "0.2.5"]
                    [venantius/ultra "0.5.1"]]
         :dependencies [[org.clojure/tools.trace "0.7.9"]
                        [cljfmt "0.5.7"]
                        [jonase/eastwood "0.2.5"]
                        [slamhound "1.5.5"]]
         :aliases {"slamhound" ["run" "-m" "slam.hound"]}}}
