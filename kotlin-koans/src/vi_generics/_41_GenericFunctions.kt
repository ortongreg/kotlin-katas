package vi_generics

import java.util.ArrayList
import java.util.HashSet
import util.TODO

fun task41(): Nothing = TODO(
    """
        Task41.
        Add a 'partitionTo' function that splits a collection into two collections according to a predicate.
        Uncomment the commented invocations of 'partitionTo' below and make them compile.

        There is a 'partition()' function in the standard library that always returns two newly created lists.
        You should write a function that splits the collection into two collections given as arguments.
        The signature of the 'toCollection()' function from the standard library may help you.
    """,
        references = *arrayOf({ l: List<Int> ->
            l.partition { it > 0 }
            l.toCollection(HashSet<Int>())
        })
)

fun List<String>.partitionWordsAndLines(): Pair<List<String>, List<String>> {
//    task41()
//    return partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    return Pair(listOf(), listOf())
}

fun Set<Char>.partitionLettersAndOtherSymbols(): Pair<Set<Char>, Set<Char>> {
//    task41()
//    return partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    return Pair(setOf(), setOf());
}

fun <T, C : MutableCollection<in T>> Collection<T>.partitionTo(includes: C, excludes: C, predicate: (T) -> Boolean): Pair<C, C> {
    this.forEach { i -> if (predicate(i)) includes.add(i) else excludes.add(i) }
    return Pair(includes, excludes)
}

