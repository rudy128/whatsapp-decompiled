package X;

import java.util.Collections;
import java.util.List;

public class CR8 {
    public final int A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public CR8(int i, List list, List list2, List list3) {
        this.A00 = i;
        this.A02 = Collections.unmodifiableList(list);
        this.A01 = Collections.unmodifiableList(list2);
        this.A03 = Collections.unmodifiableList(list3);
    }
}
