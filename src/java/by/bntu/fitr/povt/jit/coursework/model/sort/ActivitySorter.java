
package by.bntu.fitr.povt.jit.coursework.model.sort;

import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ActivitySorter {
    private static Map<ActivitySortType, Comparator<Activity>> map;

    static {
        map = new HashMap<>();
        map.put(ActivitySortType.TIME_ASC, new SortByTimeASC());
        
    }

    public static void sort(TimeTable timeTable, ActivitySortType type) {

        timeTable.sort(map.get(type));

    }

    public static void addFileComparator(ActivitySortType type, Comparator<Activity> comparator) {
        map.put(type, comparator);
    }
}
