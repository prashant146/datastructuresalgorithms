package datastructuresandalgorithms.greedy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MinimumProductSubArrayTest {

    private MinimumProductSubArray minimumProductSubArray = new MinimumProductSubArray();

    @Test
    public void testMinProductSubset(){

        int a[] = new int[]{ -1, -1, -2, 4, 3 };
        int n = 5;
        Assert.assertEquals("minimum product should match value", -24, MinimumProductSubArray.minProductSubset(a, 5));

        a = new int[]{ -8, -4, -2, -1, 3 };
        n = 5;
        Assert.assertEquals("minimum product should match value", -192, MinimumProductSubArray.minProductSubset(a, 5));

        a = new int[]{ 0, 1, 4, 5, 10};
        n = 5;
        Assert.assertEquals("minimum product should match value", 0, MinimumProductSubArray.minProductSubset(a, 5));

        a = new int[]{ 1, 4, 6, 10 };
        n = 5;
        Assert.assertEquals("minimum product should match value", 1, MinimumProductSubArray.minProductSubset(a, 5));

        a = new int[]{ -1, -1, -2, 0, 3 };
        n = 5;
        Assert.assertEquals("minimum product should match value", -6, MinimumProductSubArray.minProductSubset(a, 5));


    }

}
