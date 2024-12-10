package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.6p0  reason: invalid class name and case insensitive filesystem */
public final class C133576p0 {
    public final HashMap A00 = C17880vN.A11();
    public final List A01 = AnonymousClass000.A13();

    public final int A00(String str) {
        C18070vi.A0d(str, 0);
        int i = 0;
        for (AnonymousClass881 BhH : this.A01) {
            if (C18070vi.A18(BhH.BhH(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void A01(AnonymousClass881 r5) {
        this.A01.add(r5);
        String BhH = r5.BhH();
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(BhH)) {
            C17880vN.A1N(BhH, hashMap, (long) hashMap.size());
        }
    }
}
