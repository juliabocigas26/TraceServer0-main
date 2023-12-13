while IFS= read -r line; do

curl -H "Content-Type: application/json" -X PUT --data-binary "$line" http://localhost:8083/traceserver;

done < traces.json