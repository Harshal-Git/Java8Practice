This example is just to show default methods can be used with sub-classing and can be overridden.

1: Parent.java & Child.java -> interfaces with default methods
2: ParentImpl.java & ChildImpl.java  -> concrete classes implementing above interfaces respectively
3: Client.java ->  to execute all cases

4: OverridingParentImpl.java & OverridingChildImpl.java -> concrete classes providing extension to the above mentioned concrete classes

Observation: In this complete hierarchy; important thing to understand is regarding the class "OverridingChildImpl.java". It extends the "OverridingParentImpl.java" and 
implements the interface "Child.java" and doesn't override may method from both.

Now in this case, when we call the welcome() method from Child ref + OverridingChildImpl object from "Client.java" it will call the more specific version of that method 
from a concrete class rather than from the interface. OverridingParent method is chosen despite "Child" interface as that being a more specific type because 
it’s a concrete method from a class rather than a method default.  

	-> So here concrete methods is given preference over interface default method because it is more specific. (See Hierarchy.jpg)
