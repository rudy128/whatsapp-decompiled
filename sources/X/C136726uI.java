package X;

import java.util.Map;

/* renamed from: X.6uI  reason: invalid class name and case insensitive filesystem */
public final class C136726uI {
    public final Map A00 = C17880vN.A11();
    public final Map A01 = C17880vN.A11();

    public final synchronized String A00(String str) {
        return C17880vN.A0s(str, this.A00);
    }

    public final synchronized void A01(String str, String str2) {
        if (str2 != null) {
            this.A01.put(str2, str);
        }
        this.A00.put(str, str2);
    }

    public final synchronized void A02(String str, String str2) {
        if (str2 != null) {
            this.A01.remove(str2);
        }
        this.A00.remove(str);
    }

    public final synchronized boolean A03(String str) {
        return this.A00.containsKey(str);
    }
}
