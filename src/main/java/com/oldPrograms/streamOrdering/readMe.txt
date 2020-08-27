To understand the part - how streams will deal with ordered (list) and disordered(hashset) collections.

From book:

A Stream intuitively presents an order because each element is operated upon, or encountered, in turn. We call this the encounter order. 
How the encounter order is defined depends on both the source of the data and the operations performed on the Stream.

The encounter order is propagated across the intermediate operations.

Few methods to deal with ordering / sorting of elements directly from the stream results:

unordered()
forEachOrdered()
sorted()


