package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Iz  reason: invalid class name and case insensitive filesystem */
public final class C03620Iz {
    public int A00;
    public final int A01;
    public final HashMap A02;
    public final List A03;
    public final List A04;
    public final C18100vl A05;

    public final HashMap A00() {
        return (HashMap) this.A05.getValue();
    }

    public final boolean A01(int i, int i2) {
        int i3;
        HashMap hashMap = this.A02;
        C02050Cn r5 = (C02050Cn) hashMap.get(Integer.valueOf(i));
        if (r5 == null) {
            return false;
        }
        int i4 = r5.A01;
        int i5 = i2 - r5.A00;
        r5.A00 = i2;
        if (i5 == 0) {
            return true;
        }
        for (C02050Cn r1 : hashMap.values()) {
            if (r1.A01 >= i4 && !r1.equals(r5) && (i3 = r1.A01 + i5) >= 0) {
                r1.A01 = i3;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.0Cn, java.lang.Object] */
    public C03620Iz(List list, int i) {
        this.A03 = list;
        this.A01 = i;
        if (i >= 0) {
            this.A04 = AnonymousClass000.A13();
            HashMap hashMap = new HashMap();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C03290Hk r1 = (C03290Hk) this.A03.get(i3);
                Integer valueOf = Integer.valueOf(r1.A01);
                int i4 = r1.A02;
                ? obj = new Object();
                obj.A02 = i3;
                obj.A01 = i2;
                obj.A00 = i4;
                hashMap.put(valueOf, obj);
                i2 += i4;
            }
            this.A02 = hashMap;
            this.A05 = AnonymousClass1DF.A01(new C08140ec(this));
            return;
        }
        throw AnonymousClass000.A0k("Invalid start index");
    }
}
