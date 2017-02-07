(ns calc.view
  (:require [dommy.core :as dommy :refer-macros [sel1]]
            [calc.model :refer [add]]))
(defn int-value [id]
  (js/parseInt (.-value (sel1 id))))

(defn calc []
  (dommy/set-value!
    (sel1 :input#answer)
    (add
      (int-value :input#x)
      (int-value :input#y))))


(def view
  [:div
    [:input#x]
    [:input#y]
    [:button {:on-click calc} " = "]
    [:input#answer]])
