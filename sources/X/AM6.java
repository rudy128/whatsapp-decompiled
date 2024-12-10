package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AM6 implements BAD {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;

    public final void A06(String str) {
        C18070vi.A0d(str, 0);
        AnonymousClass00H r2 = this.A02;
        C195369tE A0L = AnonymousClass8BR.A0L(r2);
        synchronized (A0L) {
            if (str.length() == 0 || A0L.A00 == null || A0L.A02 == null) {
                A0L.A00 = C108985cd.A0f();
                A0L.A02 = C108985cd.A0f();
            }
        }
        C195369tE A0L2 = AnonymousClass8BR.A0L(r2);
        synchronized (A0L2) {
            A0L2.A01 = C108985cd.A0f();
            A0L2.A03 = C108985cd.A0f();
        }
    }

    public final void A07(String str, String str2, String str3, int i) {
        if (C20045A4o.A01(this.A00)) {
            C171228rN r4 = new C171228rN();
            int i2 = i;
            AnonymousClass8BT.A1C(r4, C108955ca.A0h(), i2);
            r4.A02 = 2;
            A01(this, r4);
            String str4 = str2;
            A02(this, r4, (Boolean) null, AnonymousClass8BT.A0j(str4), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str3, (List) null);
            this.A01.CC7(r4);
            A04((Boolean) null, 2, str4, str, (String) null, (Map) null, 6, i2);
        }
    }

    public void Bi1(Integer num, Integer num2) {
    }

    public void Bib(Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
    }

    public static final Integer A00(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        int i = 0;
        if (intValue != 0) {
            i = 1;
            if (intValue != 1) {
                i = 2;
                if (intValue != 5) {
                    return null;
                }
            }
        }
        return Integer.valueOf(i);
    }

    public static final void A01(AM6 am6, C171228rN r2) {
        AnonymousClass00H r1 = am6.A02;
        r2.A06 = AnonymousClass8BR.A0L(r1).A01;
        r2.A03 = AnonymousClass8BR.A0L(r1).A01();
        r2.A05 = AnonymousClass8BR.A0L(r1).A00;
    }

    public static final void A03(AM6 am6, AnonymousClass2H5 r2) {
        AnonymousClass00H r1 = am6.A02;
        r2.A0C = AnonymousClass8BR.A0L(r1).A01;
        r2.A08 = AnonymousClass8BR.A0L(r1).A01();
        r2.A0B = AnonymousClass8BR.A0L(r1).A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Boolean r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map r14, int r15, int r16) {
        /*
            r8 = this;
            X.A4o r1 = X.C20135A8w.A0R
            X.0ve r3 = r8.A00
            boolean r0 = r1.A03(r3)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r1.A02(r3)
            if (r0 == 0) goto L_0x00c0
        L_0x0010:
            r0 = 6329(0x18b9, float:8.869E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r3, r0)
            if (r0 == 0) goto L_0x00c0
            X.8rp r2 = new X.8rp
            r2.<init>()
            r0 = 9454(0x24ee, float:1.3248E-41)
            boolean r0 = X.C18020vd.A05(r4, r3, r0)
            if (r0 == 0) goto L_0x0029
            r2.A09 = r11
        L_0x0029:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2.A00 = r0
            r2.A04 = r13
            r2.A0A = r12
            boolean r0 = X.C17890vO.A1R(r16)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            r5 = 1
            boolean r0 = X.C18070vi.A19(r9, r5)
            if (r0 == 0) goto L_0x00c1
            r1 = 3
        L_0x0045:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0049:
            r2.A02 = r0
            X.00H r7 = r8.A02
            X.9tE r0 = X.AnonymousClass8BR.A0L(r7)
            java.lang.String r0 = r0.A03
            r2.A05 = r0
            X.9tE r0 = X.AnonymousClass8BR.A0L(r7)
            java.lang.String r0 = r0.A02()
            r2.A08 = r0
            X.9tE r0 = X.AnonymousClass8BR.A0L(r7)
            java.lang.String r0 = r0.A02
            r2.A07 = r0
            X.9tE r0 = X.AnonymousClass8BR.A0L(r7)
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.9kR r0 = (X.C190139kR) r0
            android.content.SharedPreferences r0 = r0.A00()
            java.lang.String r6 = "pref_saved_search_session_action_order"
            int r0 = X.C17890vO.A00(r0, r6)
            long r0 = (long) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r2.A03 = r5
            if (r5 == 0) goto L_0x0096
            int r5 = (int) r0
            X.9tE r0 = X.AnonymousClass8BR.A0L(r7)
            int r1 = r5 + 1
            X.00H r0 = r0.A04
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BX.A0C(r0)
            X.C17880vN.A1C(r0, r6, r1)
        L_0x0096:
            if (r14 != 0) goto L_0x009c
            java.util.LinkedHashMap r14 = X.C17880vN.A13()
        L_0x009c:
            r0 = 8615(0x21a7, float:1.2072E-41)
            boolean r0 = X.C18020vd.A05(r4, r3, r0)
            if (r0 == 0) goto L_0x00af
            r0 = 7384(0x1cd8, float:1.0347E-41)
            java.lang.String r1 = r3.A0I(r0)
            java.lang.String r0 = "server_experiment_flag1"
            r14.put(r0, r1)
        L_0x00af:
            boolean r0 = X.AnonymousClass8BR.A1Y(r14)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = X.AnonymousClass8BW.A0m(r14)
            r2.A06 = r0
        L_0x00bb:
            X.18K r0 = r8.A01
            r0.CC7(r2)
        L_0x00c0:
            return
        L_0x00c1:
            if (r10 == 0) goto L_0x00d7
            int r0 = r10.intValue()
            r1 = 2
            if (r0 == r1) goto L_0x0045
            if (r0 != r5) goto L_0x00cf
            r1 = 0
            goto L_0x0045
        L_0x00cf:
            if (r0 != 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0049
        L_0x00d7:
            r0 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AM6.A04(java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, int):void");
    }

    public final void A05(String str) {
        C18030ve r3 = this.A00;
        if (C20045A4o.A01(r3)) {
            C171228rN r2 = new C171228rN();
            r2.A00 = C108955ca.A0e();
            r2.A01 = C17880vN.A0h();
            A01(this, r2);
            LinkedHashMap A13 = C17880vN.A13();
            A13.put("location_type", str);
            r3.A0N(8615);
            r2.A04 = AnonymousClass8BW.A0m(A13);
            this.A01.CC7(r2);
        }
    }

    public AM6(C18030ve r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final void A02(AM6 am6, C171228rN r4, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l, String str, List list) {
        LinkedHashMap A13 = C17880vN.A13();
        if (num != null) {
            A13.put("query_length", num);
        }
        if (num4 != null) {
            A13.put("serp_size", num4);
        }
        if (num5 != null) {
            A13.put("error_type", num5);
        }
        if (list != null) {
            A13.put("error_code", list);
        }
        if (num2 != null) {
            A13.put("item_rank", num2);
        }
        if (num3 != null) {
            A13.put("local_serp_size", num3);
        }
        if (str != null) {
            A13.put("location_type", str);
        }
        if (l != null) {
            A13.put("latency", l);
        }
        if (bool != null) {
            A13.put("is_cached", bool);
        }
        if (num7 != null) {
            A13.put("elapsed_time_in_sec", num7);
        }
        if (C18020vd.A05(C18040vf.A02, am6.A00, 8615) && num6 != null) {
            A13.put("verification_level", num6);
        }
        r4.A04 = AnonymousClass8BW.A0m(A13);
    }
}
