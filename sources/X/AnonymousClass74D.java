package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.74D  reason: invalid class name */
public final class AnonymousClass74D {
    public long A00;
    public long A01;
    public long A02;
    public Integer A03;
    public Long A04;
    public final AnonymousClass18K A05;
    public final C36331ni A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass1CJ A08;
    public final C18030ve A09;

    private final JSONObject A05(Integer num, String str, String str2, String str3, int i, int i2, boolean z) {
        boolean z2;
        C46162Dk r1;
        if (z) {
            Collection A0H = this.A08.A0H();
            z2 = null;
            if (A0H != null) {
                boolean z3 = false;
                if (!A0H.isEmpty()) {
                    Iterator it = A0H.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C29691ci r12 = (C29691ci) it.next();
                        if ((r12 instanceof C46162Dk) && (r1 = (C46162Dk) r12) != null && AnonymousClass000.A1Z(r1.A02, C179509Ig.SUBSCRIBED)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z2 = Boolean.valueOf(z3);
            }
        } else {
            z2 = true;
        }
        JSONObject A15 = C17880vN.A15();
        A15.put("has_followed_channels", z2);
        if (C1402570p.A02(num) && C108985cd.A1b(this.A07)) {
            A15.put("directory_channel_index", i2);
            A15.put("directory_category_name", str3);
            A15.put("directory_category_index", i + 1);
        }
        if (num == AnonymousClass00R.A0Y) {
            A15.put("pill_type", str);
        } else if (num == AnonymousClass00R.A19 || num == AnonymousClass00R.A0j) {
            A15.put("thread_type", str2);
            return A15;
        }
        return A15;
    }

    public final void A0B(C179509Ig r13, C29681ch r14, Integer num, Long l, String str, int i, int i2, long j) {
        Integer num2 = num;
        boolean A15 = C18070vi.A15(r14, num);
        C1184663o r2 = new C1184663o();
        r2.A06 = r14.user;
        r2.A00 = Integer.valueOf(A00(num));
        r2.A01 = A03(num);
        if (r13 != null) {
            int ordinal = r13.ordinal();
            int i3 = 4;
            if (ordinal != A15) {
                i3 = 2;
                if (ordinal == 1) {
                    i3 = 3;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        i3 = 1;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
            }
            r2.A02 = Integer.valueOf(i3);
        }
        r2.A05 = Long.valueOf(j);
        boolean A022 = C1402570p.A02(num);
        if (A022) {
            r2.A03 = Long.valueOf(A02(this));
        }
        Integer num3 = r2.A00;
        if (num3 != null && num3.intValue() == 13) {
            r2.A04 = l;
        }
        if (A022 && C108985cd.A1b(this.A07)) {
            r2.A07 = A05(num2, (String) null, (String) null, str, i, i2, A15).toString();
        }
        this.A05.CC7(r2);
    }

    public final void A0C(C179509Ig r13, C29681ch r14, Integer num, String str, int i, int i2, long j, boolean z) {
        Integer num2 = num;
        C29681ch r4 = r14;
        int i3 = i;
        if (C1402570p.A02(num) && C108985cd.A1b(this.A07)) {
            A0B(r13, r4, num2, (Long) null, str, i2, i3, j);
        } else if (num == AnonymousClass00R.A0Y) {
            A06(r14, this, 5, i3, z);
        }
    }

    public final void A0E(C29681ch r6, Integer num, Integer num2, int i, int i2, long j) {
        C18070vi.A0d(r6, 0);
        Long l = this.A04;
        if (l == null || l.longValue() != j) {
            this.A04 = Long.valueOf(j);
            this.A02 = 0;
            this.A03 = null;
        }
        if (num2 != null) {
            this.A03 = num2;
        } else if (i == 0) {
            this.A03 = null;
        }
        C1183663e r4 = new C1183663e();
        r4.A06 = r6.user;
        r4.A05 = this.A04;
        r4.A03 = Integer.valueOf(i);
        r4.A01 = Integer.valueOf(i2);
        r4.A00 = num;
        r4.A02 = this.A03;
        long j2 = this.A02;
        this.A02 = 1 + j2;
        r4.A04 = Long.valueOf(j2);
        this.A05.CC7(r4);
    }

    public final void A0F(C29681ch r16, Integer num, Integer num2, Long l, String str) {
        C29681ch r8 = r16;
        C18070vi.A0d(r8, 0);
        Integer num3 = num;
        Integer num4 = num2;
        C18070vi.A0j(num3, num4);
        Integer num5 = num3;
        A07(r8, num5, num4, l, A05(num3, (String) null, str, (String) null, -1, -1, false), 3, -1);
    }

    public final void A0G(C29681ch r16, Integer num, Integer num2, Long l, String str) {
        C29681ch r8 = r16;
        C18070vi.A0d(r8, 0);
        Integer num3 = num;
        Integer num4 = num2;
        C18070vi.A0j(num3, num4);
        Integer num5 = num3;
        A07(r8, num5, num4, l, A05(num3, (String) null, str, (String) null, -1, -1, false), 4, -1);
    }

    public final void A0H(C29681ch r17, Integer num, Integer num2, Long l, String str, String str2, String str3, int i, int i2) {
        C29681ch r9 = r17;
        C18070vi.A0d(r9, 0);
        Integer num3 = num;
        int i3 = i;
        A07(r9, num3, num2, l, A05(num3, str, str2, str3, i2, i3, true), 1, i3);
    }

    public final void A0I(C29681ch r16, Integer num, Integer num2, Long l, String str, String str2, String str3, int i, int i2) {
        C29681ch r8 = r16;
        C18070vi.A0d(r8, 0);
        Integer num3 = num;
        int i3 = i;
        Integer num4 = num3;
        A07(r8, num4, num2, l, A05(num3, str, str2, str3, i2, i3, false), 2, i3);
    }

    public final void A0J(C29681ch r13, Integer num, List list, List list2, int i, long j) {
        Long l;
        int i2 = i;
        if (list.isEmpty()) {
            C1185263u r1 = new C1185263u();
            r1.A07 = r13.user;
            r1.A00 = Integer.valueOf(i2);
            r1.A01 = AnonymousClass3MY.A0f();
            r1.A02 = Integer.valueOf(C1402570p.A00(num));
            r1.A06 = Long.valueOf(j);
            this.A05.CC7(r1);
            return;
        }
        Iterator it = list.iterator();
        long j2 = 0;
        long j3 = 0;
        while (it.hasNext()) {
            C46162Dk r3 = (C46162Dk) it.next();
            C1185263u r4 = new C1185263u();
            r4.A07 = r13.user;
            r4.A00 = Integer.valueOf(i2);
            int i3 = 1;
            if (i == 0) {
                i3 = 2;
            }
            r4.A01 = Integer.valueOf(i3);
            r4.A02 = Integer.valueOf(C1402570p.A00(num));
            r4.A06 = Long.valueOf(j);
            r4.A08 = r3.A0M().user;
            j2++;
            r4.A05 = Long.valueOf(j2);
            if (i2 == 1 || !list2.contains(r3)) {
                l = null;
            } else {
                j3++;
                l = Long.valueOf(j3);
            }
            r4.A04 = l;
            int ordinal = r3.A02.ordinal();
            int i4 = 4;
            if (ordinal != 0) {
                i4 = 2;
                if (ordinal == 1) {
                    i4 = 3;
                } else if (ordinal == 2) {
                    continue;
                } else if (ordinal == 3) {
                    i4 = 1;
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
            r4.A03 = Integer.valueOf(i4);
            this.A05.CC7(r4);
        }
    }

    public static final long A01() {
        return AnonymousClass1JU.A00.A05();
    }

    public static final long A02(AnonymousClass74D r5) {
        long j = r5.A00;
        if (j != 0) {
            return j;
        }
        long A052 = AnonymousClass1JU.A00.A05();
        r5.A00 = A052;
        return A052;
    }

    public static Long A04(AnonymousClass74D r4) {
        long j = r4.A01;
        r4.A01 = 1 + j;
        return Long.valueOf(j);
    }

    public static final void A06(C29681ch r3, AnonymousClass74D r4, int i, int i2, boolean z) {
        if (C108955ca.A0W(r4.A07).A07()) {
            AnonymousClass648 r2 = new AnonymousClass648();
            r2.A07 = Long.valueOf(A02(r4));
            r2.A01 = Integer.valueOf(i);
            r2.A0A = r3.user;
            r2.A08 = C17880vN.A0n(i2);
            r2.A00 = Boolean.valueOf(z);
            r2.A06 = A04(r4);
            r4.A05.CC7(r2);
        }
    }

    private final void A07(C29681ch r4, Integer num, Integer num2, Long l, JSONObject jSONObject, int i, int i2) {
        AnonymousClass644 r2 = new AnonymousClass644();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = Integer.valueOf(A00(num));
        int i3 = 2;
        if (num == AnonymousClass00R.A0u) {
            i3 = 1;
        }
        r2.A02 = Integer.valueOf(i3);
        r2.A03 = A03(num);
        r2.A09 = r4.user;
        r2.A05 = Integer.valueOf(C1402570p.A00(num2));
        if (C1402570p.A02(num)) {
            r2.A06 = Long.valueOf(A02(this));
            if (num == num2) {
                r2.A07 = C17880vN.A0n(i2);
            }
        }
        r2.A0A = jSONObject.toString();
        r2.A04 = C1402570p.A01(num);
        Integer num3 = r2.A01;
        if (num3 != null && num3.intValue() == 13) {
            r2.A08 = l;
        }
        this.A05.CC7(r2);
    }

    public final void A08(int i) {
        C81323z3 r1 = new C81323z3();
        r1.A01 = Integer.valueOf(i);
        this.A05.CC7(r1);
    }

    public final void A09(int i, String str) {
        AnonymousClass00H r3 = this.A07;
        if (C108955ca.A0W(r3).A07()) {
            AnonymousClass648 r2 = new AnonymousClass648();
            r2.A07 = Long.valueOf(A02(this));
            r2.A01 = C17880vN.A0h();
            r2.A02 = Integer.valueOf(i);
            r2.A06 = A04(this);
            if (C108985cd.A1b(r3)) {
                r2.A0B = str;
            }
            this.A05.CC7(r2);
        }
    }

    public final void A0A(int i, boolean z) {
        if (C108955ca.A0W(this.A07).A03()) {
            C1182862w r2 = new C1182862w();
            r2.A01 = Integer.valueOf(i);
            r2.A00 = Integer.valueOf(C72453Mb.A04(z ? 1 : 0));
            r2.A03 = Long.valueOf(A02(this));
            r2.A02 = A04(this);
            this.A05.CC7(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r3 != 26) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C29681ch r6, java.lang.Integer r7, int r8, int r9) {
        /*
            r5 = this;
            X.0ve r2 = r5.A09
            r1 = 5491(0x1573, float:7.695E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0047
            X.62x r4 = new X.62x
            r4.<init>()
            if (r6 == 0) goto L_0x0052
            java.lang.String r0 = r6.user
        L_0x0015:
            r4.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A00 = r0
            r0 = -1
            if (r7 != 0) goto L_0x004d
            r3 = -1
        L_0x0021:
            r2 = 0
            if (r3 == r0) goto L_0x003a
            r1 = 1
            r0 = 2
            if (r3 == r0) goto L_0x0048
            r1 = 2
            r0 = 1
            if (r3 == r0) goto L_0x0048
            r1 = 3
            r0 = 12
            if (r3 == r0) goto L_0x0048
            r1 = 4
            r0 = 3
            if (r3 == r0) goto L_0x0048
            r1 = 5
            r0 = 26
            if (r3 == r0) goto L_0x0048
        L_0x003a:
            r4.A01 = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A02 = r0
            X.18K r0 = r5.A05
            r0.CC7(r4)
        L_0x0047:
            return
        L_0x0048:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x003a
        L_0x004d:
            int r3 = r7.intValue()
            goto L_0x0021
        L_0x0052:
            r0 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74D.A0D(X.1ch, java.lang.Integer, int, int):void");
    }

    public final void A0K(AnonymousClass206 r5, Integer num, int i, int i2) {
        C18030ve r3 = this.A09;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r3, 5492)) {
            AnonymousClass63Y r2 = new AnonymousClass63Y();
            r2.A01 = num;
            r2.A00 = Integer.valueOf(i);
            r2.A02 = Integer.valueOf(i2);
            if (r5.A0w() && C18020vd.A05(r1, r3, 8227)) {
                C20947Ac1 A002 = AnonymousClass9RY.A00(r5);
                if (A002 != null) {
                    r2.A03 = A002.A01.user;
                    r2.A05 = String.valueOf(A002.A00);
                }
                AnonymousClass1BI r0 = r5.A0v.A00;
                if (r0 != null) {
                    r2.A04 = r0.user;
                }
            }
            this.A05.CC7(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.C108985cd.A1b(r8) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, int r14, long r15) {
        /*
            r9 = this;
            X.00H r8 = r9.A07
            X.1c4 r0 = X.C108955ca.A0W(r8)
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0037
            X.1c4 r0 = X.C108955ca.A0W(r8)
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x001d
            boolean r1 = X.C108985cd.A1b(r8)
            r0 = 1
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r7 = 2
            if (r0 != 0) goto L_0x0038
            java.lang.Integer[] r1 = new java.lang.Integer[r7]
            r0 = 12
            X.AnonymousClass000.A1L(r1, r0)
            r0 = 13
            X.AnonymousClass000.A1M(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            boolean r0 = X.C200410p.A0U(r0, r1)
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            X.648 r6 = new X.648
            r6.<init>()
            long r0 = A02(r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r6.A01 = r0
            r6.A04 = r10
            r6.A0B = r12
            r6.A03 = r11
            long r4 = r9.A01
            r2 = 1
            long r0 = r4 + r2
            r9.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r6.A06 = r0
            boolean r0 = X.C108985cd.A1b(r8)
            if (r0 == 0) goto L_0x0072
            if (r13 == 0) goto L_0x0072
            r6.A09 = r13
            r0 = r15
            java.lang.Long r0 = X.C17880vN.A0o(r0, r2)
            r6.A05 = r0
        L_0x0072:
            X.18K r0 = r9.A05
            r0.CC7(r6)
            if (r14 != r7) goto L_0x0037
            r0 = 0
            r9.A00 = r0
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74D.A0L(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int, long):void");
    }

    public final void A0M(boolean z) {
        if (C108955ca.A0W(this.A07).A03()) {
            this.A01 = 0;
            C1182862w r2 = new C1182862w();
            r2.A03 = Long.valueOf(A02(this));
            int i = 5;
            if (z) {
                i = 1;
            }
            r2.A01 = Integer.valueOf(i);
            r2.A02 = A04(this);
            this.A05.CC7(r2);
        }
    }

    public AnonymousClass74D(AnonymousClass1CJ r2, C18030ve r3, AnonymousClass18K r4, C36331ni r5, AnonymousClass00H r6) {
        C18070vi.A0p(r4, r3, r6);
        C18070vi.A0d(r2, 5);
        this.A06 = r5;
        this.A05 = r4;
        this.A09 = r3;
        this.A07 = r6;
        this.A08 = r2;
    }

    public static final int A00(Integer num) {
        switch (num.intValue()) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 8:
                return 6;
            case 9:
                return 5;
            case 10:
                return 7;
            case 11:
                return 8;
            case 13:
                return 9;
            case 14:
                return 11;
            case 15:
            case 16:
            case 17:
            case 18:
                return 10;
            case 19:
            case 20:
            case 21:
                return 12;
            case 22:
            case 23:
                return 13;
            case 24:
                return 14;
            case 25:
                return 15;
            default:
                return 0;
        }
    }

    public static final Integer A03(Integer num) {
        int i;
        switch (num.intValue()) {
            case 15:
                i = 1;
                break;
            case 16:
            case 19:
                i = 2;
                break;
            case 17:
            case 20:
                i = 3;
                break;
            case 18:
            case 21:
                i = 4;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }
}
