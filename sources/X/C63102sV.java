package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.2sV  reason: invalid class name and case insensitive filesystem */
public class C63102sV {
    public static C63102sV A04 = new C63102sV(-2);
    public final int A00;
    public final List A01;
    public final Map A02;
    public final boolean A03 = false;

    public C63102sV(int i) {
        this.A00 = i;
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyList();
    }

    public C63102sV(List list, Map map, int i) {
        this.A00 = i;
        this.A02 = Collections.unmodifiableMap(map);
        this.A01 = Collections.unmodifiableList(list);
    }
}
