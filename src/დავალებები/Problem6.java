package დავალებები;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Problem6 {
/*
დაწერეთ საკუთარი მონაცემთა სტრუქტურა, რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ ელემენტი
 */

    class MyDS
    {
        ArrayList<Integer> customArray;
        HashMap<Integer, Integer> customHashMap;

        public MyDS()
        {
            customArray = new ArrayList<Integer>();
            customHashMap = new HashMap<Integer, Integer>();
        }



        void remove(int x)
        {
            Integer index = customHashMap.get(x);
            if (index == null)
                return;

            customHashMap.remove(x);


            int size = customArray.size();
            Integer last = customArray.get(size-1);
            Collections.swap(customArray, index,  size-1);

            customArray.remove(size-1);

            // Update hash table for new index of last element
            customHashMap.put(last, index);
        }

    }
}
