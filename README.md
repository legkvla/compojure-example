# How to run

lein ring server

# Try these curls

* curl -d "param1=value1&param2=value2" -X POST http://localhost:3000/site
* curl -X POST -H "Content-Type: text/html; charset=UTF-8" --data-ascii "content=derinhält&date=asdf" http://localhost:3000/site
* curl -X POST -H "Content-Type: application/x-www-form-urlencoded; charset=UTF-8" --data-ascii "content=derinhält&date=asdf" http://localhost:3000/site
