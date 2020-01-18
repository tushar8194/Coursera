1. .reduce(_-_) Operation :

=> This is non associative operation and that will give nondeterministic results

2. Why Spark ?

    (a) Spark has better fault tolerent management. 
        It uses functional programing power of immutability and in-memory. Stores all transformation and can re-generate RDDs.

    (b) Better in network latency.
        Reduce transfer or use of data over network.

    (c) Spark minimally do store in disk to avoid I/O cost.
