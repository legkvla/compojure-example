(ns compojure.example.routes
  (:use compojure.core
        compojure.example.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defroutes main-routes
  ; (GET "/" [] (index-page))
  (POST "/site" req
    (println "Post params: " (:params req))
    (println "Post: " (slurp (:body req) :encoding "utf-8"))
    "OK"
    )
  ;(route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))
