package X;

import java.util.Collections;
import java.util.List;

public class CW8 {
    public final long A00;
    public final List A01;
    public final List A02;

    public int A00() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((CR8) list.get(i)).A00 == 2) {
                return i;
            }
        }
        return -1;
    }

    public CW8(List list, List list2, long j) {
        this.A00 = j;
        this.A01 = Collections.unmodifiableList(list);
        this.A02 = Collections.unmodifiableList(list2);
    }
}
