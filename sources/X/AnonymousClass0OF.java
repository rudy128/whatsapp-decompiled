package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0OF  reason: invalid class name */
public final class AnonymousClass0OF {
    public boolean A00;
    public final C06970a9 A01 = C06970a9.A02(new C18090vk[16]);
    public final Map A02 = new LinkedHashMap();

    public static final void A00(AnonymousClass0OF r6) {
        C06970a9 r5 = r6.A01;
        int i = r5.A00;
        if (i > 0) {
            Object[] objArr = r5.A01;
            int i2 = 0;
            do {
                ((C18090vk) objArr[i2]).invoke();
                i2++;
            } while (i2 < i);
        }
        r5.A08();
        r6.A02.clear();
        r6.A00 = false;
    }

    public static final void A01(AnonymousClass0OF r4) {
        Map map = r4.A02;
        for (C015408x r1 : map.keySet()) {
            AnonymousClass0CW r0 = (AnonymousClass0CW) AnonymousClass0QV.A01(r1).A05.A02.get(r1);
            if (r0 != null) {
                r1.A00 = r0;
            } else {
                throw AnonymousClass000.A0n("committing a node that was not updated in the current transaction");
            }
        }
        map.clear();
        r4.A00 = false;
    }
}
