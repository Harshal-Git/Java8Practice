Concept behind reduce() operation: reduce pattern


	Object accumulator = initialValue;
		
	for(Object element : collection) {
		accumulator = combine(accumulator, element);
	}

// accumulator - the initial value to start from
// combine - function to compare and return appropriate differentiation (max/min/equal/sum) between "accumulator" and "element"