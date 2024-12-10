package X;

import java.util.HashMap;

/* renamed from: X.1dp  reason: invalid class name and case insensitive filesystem */
public final class C30371dp {
    public Integer A00;
    public HashMap A01;
    public boolean A02 = true;
    public final int A03;

    public final void A00(Object obj, String str) {
        C18070vi.A0d(obj, 1);
        HashMap hashMap = this.A01;
        HashMap hashMap2 = hashMap;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (hashMap2 == null) {
            this.A01 = hashMap;
        }
        hashMap.put(str, obj);
    }

    public C30371dp(int i) {
        this.A03 = i;
    }
}
