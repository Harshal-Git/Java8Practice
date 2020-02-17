Extracted from Book - as it is:

The Three Rules:  If you’re ever unsure of what will happen with default methods or with multiple inheritance of behavior, there are three simple rules for 
handling conflicts:

1. Any class wins over any interface. So if there’s a method with a body, or an abstract declaration, in the superclass chain, we can ignore the interfaces completely.

2. Sub type wins over super type. If we have a situation in which two interfaces are competing to provide a default method and one interface extends the other, the
subclass wins.

3. If the previous two rules don’t give us the answer, the subclass must either implement the method or declare it abstract.

-> Rule 1 is what brings us compatibility with old code.

