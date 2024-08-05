# Stress Testing using Siege 

This repository provides an implementation of simple Spring Boot application that accepts incoming requests and stores data from request to PostgreSQL.

## Quick Start

To start the app stack, run the following command:
```
docker compose up
```

##  Experiments and results

The system load was generated with different levels of concurrency (10, 25, 50, 100) using Siege, with commands from the [script](siege.sh).

|                   | c = 10 | c = 25 | c = 50 | c = 100 |
|-------------------|--------|--------|--------|---------|
| Availability      | 100.00 | 100.00 | 100.00 | 100.00  |
| Avg response time | 0.00   | 0.01   | 0.01   | 0.04    |
| Throughput        | 0.08   | 0.12   | 0.11   | 0.09    |