package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2pZ  reason: invalid class name and case insensitive filesystem */
public class C61372pZ {
    public final int A00;
    public final List A01;

    public C61372pZ(List list) {
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = 0;
    }

    public C61372pZ(int i) {
        this.A01 = Collections.emptyList();
        this.A00 = i;
    }
}
