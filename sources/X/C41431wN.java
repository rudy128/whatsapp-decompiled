package X;

import java.util.List;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
public abstract class C41431wN {
    public static final int[] A00(List list) {
        int[] iArr = new int[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) list.get(i)).intValue();
        }
        return iArr;
    }
}
