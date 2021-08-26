public class MedianOfTwoSortedArrays {
    /*
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    The overall run time complexity should be O(log (m+n)).*/
    public float mergeAndSortArrays(float[] array1, float[] array2){
        float[] array3 = new float[array1.length+array2.length];
        int array1Index = 0;
        int array2Index = 0;
        int arrayIndex3 = 0;
        while (array1Index<array1.length && array2Index<array2.length){
            if (array1[array1Index]<=array2[array2Index]){
                array3[arrayIndex3]=array1[array1Index];
                array1Index++;
            }
            else{
                array3[arrayIndex3]=array2[array2Index];
                array2Index++;
            }
            arrayIndex3++;
        }

        while (array1Index<array1.length){
            array3[arrayIndex3]=array1[array1Index];
            array1Index++;
            arrayIndex3++;
        }   

        while (array2Index<array2.length){
            array3[arrayIndex3]=array2[array2Index];
            array2Index++;
            arrayIndex3++;
        }
        return medianOfTwoSortedArray(array3);
    }

    public float medianOfTwoSortedArray(float[] array){
        int m = array.length;
        if (m%2==1)
            return array[m/2];
        else
            return (array[m/2]+array[m/2-1])/2;

    }
}
