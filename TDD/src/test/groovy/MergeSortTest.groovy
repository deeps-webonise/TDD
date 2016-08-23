/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'webonise' at '22/8/16 4:45 PM' with Gradle 2.14
 *
 * @author webonise, @date 22/8/16 4:45 PM
 */

import spock.lang.Specification



class MergeSortTest extends Specification {

    def "check indexes" () {

        setup:
        MergeSort mergeSort= new MergeSort();
        int[] array = [39,12]

        when:
        mergeSort.sort(array)

        then:
        mergeSort.lower < mergeSort.higher;
    }




    def "check for one element" () {

        setup:
        MergeSort mergeSort= new MergeSort();
        int[] array = [39]
        int[] result=[39]


        when:
        mergeSort.sort(array)

        then:
        array==result;



    }

    def "check for more than one element"() {

        setup:
        MergeSort mergeSort= new MergeSort();
        int[] array = [123,14,57,8]
        int[] Result=[8,14,57,123]

        when:
        mergeSort.sort(array)

        then:
        array == Result
    }


     def "check for more than one  same element"() {

        setup:
        MergeSort mergeSort= new MergeSort();
        int[] array = [123,123,123,123]
        int[] Result=[123,123,123,123]

        when:
        mergeSort.sort(array)

        then:
        array == Result
}

    def "check for negative numbers"() {

        setup:
        MergeSort mergeSort= new MergeSort();
        int[] array = [-3,-1,-2]
        int[] Result=[-3,-2,-1]

        when:
        mergeSort.sort(array)

        then:
        array == Result
    }


}










