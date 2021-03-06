(defproject clojure-swt-examples "0.1.0-SNAPSHOT"
  :description "List of Clojure SWT examples"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.eclipse/swt-gtk-linux-x86_64 "3.5.2"]
                 [org.clojure/core.match "0.2.0-alpha9"]
                 [egamble/let-else "1.0.1"]
                 [lein-swank "1.4.4"]]
  :aot [main.swt-simple-text-editor]
  :main main.swt-simple-text-editor)
