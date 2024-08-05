siege -b -c10 -v -t30s 'http://localhost:8080/api/records?value=testvalue10 POST'
siege -b -c25 -v -t30s 'http://localhost:8080/api/records?value=testvalue25 POST'
siege -b -c50 -v -t30s 'http://localhost:8080/api/records?value=testvalue50 POST'
siege -b -c100 -v -t30s 'http://localhost:8080/api/records?value=testvalue100 POST'