package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class A7T {
    public String A00;
    public boolean A01;
    public final C183039Wr A02;
    public final C20136A8x A03;
    public final C57442j5 A04;
    public final HashMap A05 = C17880vN.A11();
    public final HashMap A06 = C17880vN.A11();
    public final HashMap A07 = C17880vN.A11();
    public final AnonymousClass11P A08;
    public final C18000vb A09;
    public final C18030ve A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r1.get(r2) != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashMap A01(java.util.HashMap r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = A00(r4, r0)
            java.lang.String r0 = r4.A00
            boolean r1 = X.C18070vi.A18(r1, r0)
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            java.util.HashMap r1 = r4.A06
            java.lang.Integer r3 = X.C17880vN.A0i()
            java.lang.Object r0 = r1.get(r3)
            if (r0 == 0) goto L_0x003c
            java.lang.Integer r2 = X.C17880vN.A0j()
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x003c
            java.util.HashMap r1 = r4.A07
            java.lang.Object r0 = r1.get(r3)
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x003c
        L_0x0035:
            java.lang.Object r0 = X.AnonymousClass8BT.A0r(r5, r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            return r0
        L_0x003c:
            r0 = 2
            r4.A03(r0)
            r0 = 3
            r4.A03(r0)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7T.A01(java.util.HashMap, int):java.util.HashMap");
    }

    public final boolean A0B(int i) {
        C18030ve r2;
        int i2;
        if (i == 2) {
            r2 = this.A0A;
            i2 = 8515;
        } else if (i != 3) {
            return false;
        } else {
            r2 = this.A0A;
            i2 = 8516;
        }
        return C18020vd.A05(C18040vf.A02, r2, i2);
    }

    public static final String A00(A7T a7t, int i) {
        return AnonymousClass11X.A00.A0B(a7t.A09, AnonymousClass11P.A01(a7t.A08) - TimeUnit.DAYS.toMillis((long) i));
    }

    public static final JSONObject A02(A7T a7t, int i) {
        HashMap hashMap = a7t.A05;
        Integer valueOf = Integer.valueOf(i);
        JSONObject jSONObject = (JSONObject) hashMap.get(valueOf);
        if (jSONObject != null) {
            return jSONObject;
        }
        C183039Wr r3 = a7t.A02;
        String A1I = AnonymousClass001.A1I("biz_interaction_counts_", AnonymousClass000.A10(), i);
        C18070vi.A0d(A1I, 0);
        JSONObject A16 = C17880vN.A16(C108955ca.A0C(r3.A00, "biz_integrity_logger").getString(A1I, C17880vN.A15().toString()));
        hashMap.put(valueOf, A16);
        return A16;
    }

    public A7T(C183039Wr r2, C20136A8x a8x, C57442j5 r4, AnonymousClass11P r5, C18000vb r6, C18030ve r7) {
        C18070vi.A0w(r2, r5, r6, a8x, r4);
        C18070vi.A0d(r7, 6);
        this.A02 = r2;
        this.A08 = r5;
        this.A09 = r6;
        this.A03 = a8x;
        this.A04 = r4;
        this.A0A = r7;
    }

    private final void A03(int i) {
        HashSet A12 = C17880vN.A12();
        HashMap A11 = C17880vN.A11();
        HashMap A112 = C17880vN.A11();
        int i2 = 0;
        do {
            JSONObject A022 = A02(this, i);
            JSONObject A0w = AnonymousClass8BW.A0w(A00(this, i2), A022);
            HashSet A122 = C17880vN.A12();
            Iterator A0s = AnonymousClass8BS.A0s(A0w);
            while (A0s.hasNext()) {
                A122.add(A0s.next());
            }
            if (i2 == 0) {
                A112.put("count_1d", Integer.valueOf(A122.size()));
                A112.put("count_total", AnonymousClass8BT.A0k("total_unique_thread_count", A022));
            }
            Number A1D = C108945cZ.A1D("count_7d", A112);
            if (A1D == null) {
                A1D = 0;
            }
            C17890vO.A0z("count_7d", A112, A1D.intValue() + A122.size());
            A12.addAll(A122);
            if (i2 == 6) {
                A112.put("count_7d_unique", Integer.valueOf(A12.size()));
            }
            JSONObject A023 = A02(this, i);
            JSONObject A0w2 = AnonymousClass8BW.A0w(A00(this, i2), A023);
            Iterator A0s2 = AnonymousClass8BS.A0s(A0w2);
            int i3 = 0;
            while (A0s2.hasNext()) {
                i3 += A0w2.optInt(C17880vN.A0v(A0s2));
            }
            if (i2 == 0) {
                A11.put("count_1d", Integer.valueOf(i3));
                A11.put("count_total", AnonymousClass8BT.A0k("total_message_count", A023));
            }
            Number A1D2 = C108945cZ.A1D("count_7d", A11);
            if (A1D2 == null) {
                A1D2 = 0;
            }
            C17890vO.A0z("count_7d", A11, A1D2.intValue() + i3);
            i2++;
        } while (i2 < 7);
        Integer valueOf = Integer.valueOf(i);
        this.A06.put(valueOf, A11);
        this.A07.put(valueOf, A112);
        this.A01 = false;
    }

    public final Long A04(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A07, i)) == null || (A1D = C108945cZ.A1D("count_7d", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }

    public final Long A05(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A06, i)) == null || (A1D = C108945cZ.A1D("count_1d", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }

    public final Long A06(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A06, i)) == null || (A1D = C108945cZ.A1D("count_7d", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }

    public final Long A07(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A06, i)) == null || (A1D = C108945cZ.A1D("count_total", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }

    public final Long A08(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A07, i)) == null || (A1D = C108945cZ.A1D("count_total", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }

    public final Long A09(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A07, i)) == null || (A1D = C108945cZ.A1D("count_1d", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }

    public final Long A0A(int i) {
        HashMap A012;
        Number A1D;
        if (!A0B(i) || (A012 = A01(this.A07, i)) == null || (A1D = C108945cZ.A1D("count_7d_unique", A012)) == null) {
            return null;
        }
        return C17890vO.A0N(A1D);
    }
}
