# Consumirlo mediente postman con el siguiente curl

curl --location --request POST 'localhost:8081/api/DevOps' \
--header 'X-Parse-REST-API-Key: 2f5ae96c-b558-4c7b-a590-a501ae1c3f6cm' \
--header 'Content-Type: application/json' \
--data-raw '{
"message" : "This is a test",
"to": "Juan Perez",
"from":"Rita Asturia",
"timeToLifeSec" : 45
}'
