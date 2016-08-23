import spock.lang.Specification

/**
 * Created by webonise on 23/8/16.
 */
class QuickSortTest extends Specification {

    def "check for one element" () {

        setup:
        QuickSort quickSort= new QuickSort();
        int[] array = [11]
        int[] result=[11]


        when:
        quickSort.quicksort(array)

        then:
        array==result;

    }

    def "check for more than one element"() {
        setup:
        QuickSort quickSort= new QuickSort();
        int[] array = [123,14,57,8]
        int[] Result=[8,14,57,123]

     when:
        quickSort.quicksort(array)

        then:
        array == Result
    }


    def "check for more than one  same element"() {

        setup:
        QuickSort quickSort= new QuickSort();
        int[] array = [123,123,123,123]
        int[] Result=[123,123,123,123]

        when:
        quickSort.quicksort(array)

        then:
        array == Result
    }

    def "check for negative numbers"() {

        setup:
        QuickSort quickSort= new QuickSort();
        int[] array = [-3,-1,-2]
        int[] Result=[-3,-2,-1]

        when:
        quickSort.quicksort(array)

        then:
        array == Result
    }





}
