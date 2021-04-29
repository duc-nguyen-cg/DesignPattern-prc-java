package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    @Override
    public int findMax(Set<Integer> numbers){
        CollectionUtils collectionUtil = new CollectionUtils();
        List<Integer> numberList = new ArrayList<>(numbers);
        return collectionUtil.findMax(numberList);
    }
}
