package X;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.CiR  reason: case insensitive filesystem */
public final class C25587CiR {
    public static final E0K A05 = new C26625D6v();
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final C25834Cmn A01;
    public final List A02;
    public final List A03;
    public final Map A04 = new AnonymousClass00O(0);

    /* JADX WARNING: type inference failed for: r0v1, types: [X.00O, java.util.Map] */
    public C25587CiR(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        List list3 = this.A02;
        int size = list3.size();
        int i = Integer.MIN_VALUE;
        C25834Cmn cmn = null;
        for (int i2 = 0; i2 < size; i2++) {
            C25834Cmn cmn2 = (C25834Cmn) list3.get(i2);
            if (cmn2.A04 > i) {
                i = cmn2.A04;
                cmn = cmn2;
            }
        }
        this.A01 = cmn;
    }
}
