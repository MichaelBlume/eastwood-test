(ns test-eastwood.core
  (:require [compojure.api.sweet :refer :all]
            [schema.core :as schema]))

(def v1-routes
  (routes
    (POST "/foo" []
          :return {:bar schema/Int}
          {:status 200 :body {:bar 35}})))
