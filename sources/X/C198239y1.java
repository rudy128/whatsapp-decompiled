package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9y1  reason: invalid class name and case insensitive filesystem */
public final class C198239y1 {
    public static final C189129iY A03 = new Object();
    public final String A00;
    public final Map A01;
    public final C198239y1[] A02;

    public C198239y1(String str, C198239y1[] r7) {
        LinkedHashMap linkedHashMap;
        this.A00 = str;
        this.A02 = r7;
        if (r7 != null) {
            linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r4));
            for (C198239y1 r1 : r7) {
                linkedHashMap.put(r1.A00, r1);
            }
        } else {
            linkedHashMap = null;
        }
        this.A01 = linkedHashMap;
    }
}
