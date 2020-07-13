package datastructuresandalgorithms.greedy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubArrayTest {

    private MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();

    @Test
    public void testMaxProductSubset(){
        int arr[] ={-1, -1, -2, 4, 3};
        int n = 5;
        Assert.assertEquals("max product should match: ", 24, maximumProductSubArray.maxProductSubset(arr, n));

        arr = new int[]{-1, 0};
        n = 2;
        Assert.assertEquals("max product should match: ", 0, maximumProductSubArray.maxProductSubset(arr, n));

        arr = new int[]{-10, -6, -1, 4, 5};
        n = 5;
        Assert.assertEquals("max product should match: ", 1200, maximumProductSubArray.maxProductSubset(arr, 5));

        arr = new int[]{-10, -8, -6, -1, 2, 5};
        n = 6;
        Assert.assertEquals("max product should match: ", 4800, maximumProductSubArray.maxProductSubset(arr, 5));

        arr = new int[]{0, 1, 2, 6, 12};
        n = 5;
        Assert.assertEquals("max product should match: ", 144, maximumProductSubArray.maxProductSubset(arr, 5));

    }
}
