package chapter2_Sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sort_SelectionTest {

    @Test
    public void sort() {
        String[] a = Sort_Base.a;
        Sort_Selection.Sort(a);
        Assert.assertTrue(Sort_Base.IsSorted(a));
        Sort_Base.Show(a);
    }
}