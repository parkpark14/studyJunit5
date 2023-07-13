rabbitmq 설치 

producer
consumer
broker


테스트 케이스를 작성할 수 있어야 한다.[
junit5]()


docker run \
    --name mongodb \
    -d \
    -p 27017:27017 \
    -e MONGO_INITDB_ROOT_USERNAME=root \
    -e MONGO_INITDB_ROOT_PASSWORD=root \
    mongo


docker run --name mongodb -d -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=root mongo

docker exe -it mongodb /bin/bash
mongo가 안되어 => mongosh

db
show dbs

use jpatest
db.jpatest.insert({"name": "MongoDB Tutorial", "author": "velopert"});
db.createUser(
  {
    user: "book",
    pwd:  "1234",
    roles: [
    	{ "role" : "root", "db" : "admin" },
	]
  }
)


https://erjuer.tistory.com/120
 
