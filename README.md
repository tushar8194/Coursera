1. .reduce(\_-\_) Operation :

=> This is non associative operation and that will give nondeterministic results


2. Why Spark ?

    (a) Spark has better fault tolerent management. 
        It uses functional programing power of immutability and in-memory. Stores all transformation and can re-generate RDDs.

    (b) Better in network latency.
        Reduce transfer or use of data over network.

    (c) Spark minimally do store in disk to avoid I/O cost.


3. RDD : 

	(a) RDD is like Immutable scala collection.

	(b) Most operation on RDD are like higher order funciton, means taking a functions as an argument and returning a RDD.

	(c) Can be created by transformation on existing RDD or using 
	
		sc.parallelize : convert scala collection to RDD.
		
		sc.textfile : read text file and return RDD[String]

4. Transformations / Actions
Attempt | #1 | #2 | #3 | #4 | #5 | #6 | #7 | #8 | #9 | #10 | #11
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
Seconds | 301 | 283 | 290 | 286 | 289 | 285 | 287 | 287 | 272 | 276 | 269


Lazy / Eager
RDD is not immediatly calculated / immediate results
