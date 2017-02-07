(ns day2.core
  (:require))

(enable-console-print!)

(println "This text is printed from src/day2/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))
(set! (.-innerHTML (.getElementById js/document "app")) "헬로 월드")
(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
(println (for [n (range 1 10)] (+ n 2)))
