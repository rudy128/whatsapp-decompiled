package X;

import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.A8w  reason: case insensitive filesystem */
public final class C20135A8w {
    public static final C20045A4o A0R = new Object();
    public int A00 = Integer.MAX_VALUE;
    public int A01 = -1;
    public Long A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final C22801Dg A07;
    public final C22801Dg A08;
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0L();
    public final C22851Dl A0A;
    public final C131326ku A0B;
    public final AnonymousClass1KB A0C;
    public final C133666pH A0D;
    public final C18030ve A0E;
    public final C34141jz A0F;
    public final C200710s A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final C18140vp A0J;
    public final C18090vk A0K;
    public final C22821Di A0L;
    public final AnonymousClass1OS A0M;
    public final boolean A0N;
    public final AnonymousClass1DS A0O;
    public final AnonymousClass1DS A0P;
    public final AnonymousClass11P A0Q;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00b7, code lost:
        if ((!X.C20045A4o.A00(r5).contains(((X.A2R) r3.get()).A00)) == false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20135A8w(X.AnonymousClass1DS r21, X.AnonymousClass1DS r22, X.AnonymousClass1DS r23, X.AnonymousClass1DS r24, X.AnonymousClass1DS r25, X.AnonymousClass1DS r26, X.AnonymousClass1DS r27, X.AnonymousClass1DS r28, X.C131326ku r29, X.AnonymousClass1KB r30, X.C133666pH r31, X.AnonymousClass11P r32, X.C18000vb r33, X.C18030ve r34, X.CW0 r35, X.AnonymousClass10I r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38, X.C18140vp r39, X.C18090vk r40, X.C22821Di r41, X.AnonymousClass1OS r42) {
        /*
            r20 = this;
            r7 = r32
            r6 = r33
            r5 = r34
            r16 = r36
            r15 = r30
            r0 = r16
            X.C18070vi.A0w(r7, r5, r0, r6, r15)
            r14 = r31
            r4 = r35
            r3 = r37
            r0 = r38
            r17 = r29
            r1 = r17
            X.C18070vi.A0x(r4, r14, r3, r0, r1)
            r2 = r39
            r19 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r1 = r19
            X.C18070vi.A0y(r2, r1, r13, r12, r11)
            r8 = 19
            r18 = r25
            r1 = r18
            X.C18070vi.A0d(r1, r8)
            r10 = r26
            r9 = r27
            X.AnonymousClass8BW.A1J(r10, r9)
            r1 = 22
            r8 = r28
            X.C18070vi.A0d(r8, r1)
            r1 = r20
            r1.<init>()
            r1.A0Q = r7
            r1.A0E = r5
            r1.A0C = r15
            r1.A0D = r14
            r1.A0I = r3
            r1.A0H = r0
            r0 = r17
            r1.A0B = r0
            r1.A0J = r2
            r1.A06 = r13
            r1.A0O = r12
            r1.A0P = r11
            r0 = r42
            r1.A0M = r0
            r0 = r41
            r1.A0L = r0
            r0 = r40
            r1.A0K = r0
            r1.A03 = r10
            r1.A05 = r9
            r1.A04 = r8
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A09 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.A00 = r0
            r0 = -1
            r1.A01 = r0
            X.1Dg r7 = X.C108945cZ.A0R()
            r1.A08 = r7
            X.1Dg r14 = X.C108945cZ.A0R()
            r1.A07 = r14
            X.1jz r0 = new X.1jz
            r0.<init>(r6)
            r1.A0F = r0
            X.10s r0 = X.C200710s.A00(r16)
            r1.A0G = r0
            r2 = 6743(0x1a57, float:9.449E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r2)
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r3.get()
            X.A2R r0 = (X.A2R) r0
            java.lang.String r2 = r0.A00
            java.util.HashSet r0 = X.C20045A4o.A00(r5)
            boolean r0 = r0.contains(r2)
            r2 = r0 ^ 1
            r0 = 1
            if (r2 != 0) goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            r1.A0N = r0
            X.AGN r0 = new X.AGN
            r0.<init>(r1)
            r4.A00(r0, r7, r14)
            X.AyP r2 = new X.AyP
            r2.<init>(r1)
            r3 = 25
            r0 = r19
            X.C20339AGv.A01(r0, r7, r2, r3)
            X.AyQ r0 = new X.AyQ
            r0.<init>(r1)
            X.C20339AGv.A01(r13, r7, r0, r3)
            X.AyR r0 = new X.AyR
            r0.<init>(r1)
            X.C20339AGv.A01(r12, r7, r0, r3)
            X.AyS r0 = new X.AyS
            r0.<init>(r1)
            X.C20339AGv.A01(r9, r7, r0, r3)
            X.AyT r0 = new X.AyT
            r0.<init>(r1)
            X.C20339AGv.A01(r11, r7, r0, r3)
            X.AyU r0 = new X.AyU
            r0.<init>(r1)
            X.C20339AGv.A01(r10, r7, r0, r3)
            X.AyV r0 = new X.AyV
            r0.<init>(r1)
            X.C20339AGv.A01(r8, r7, r0, r3)
            X.AyW r2 = new X.AyW
            r2.<init>(r1)
            r0 = r18
            X.C20339AGv.A01(r0, r7, r2, r3)
            r2 = 35
            X.AGr r0 = new X.AGr
            r0.<init>(r1, r2)
            r1.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20135A8w.<init>(X.1DS, X.1DS, X.1DS, X.1DS, X.1DS, X.1DS, X.1DS, X.1DS, X.6ku, X.1KB, X.6pH, X.11P, X.0vb, X.0ve, X.CW0, X.10I, X.00H, X.00H, X.0vp, X.0vk, X.1Di, X.1OS):void");
    }

    public static final void A04(C20135A8w a8w, AnonymousClass1BI r7, String str) {
        C18030ve r1 = a8w.A0E;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r1, 7212)) {
            A2R A0F2 = AnonymousClass8BT.A0F(a8w);
            AnonymousClass8lH r2 = new AnonymousClass8lH(str, r7.getRawString());
            A4G a4g = (A4G) A0F2.A0D.get();
            List list = a4g.A00;
            C18070vi.A0W(list);
            synchronized (list) {
                if (list.isEmpty()) {
                    A4G.A01(a4g);
                }
                list.remove(r2);
                r2.A00 = C108955ca.A0m();
                list.add(0, r2);
                if (list.size() > C18020vd.A00(r5, a4g.A03, 7262)) {
                    C50582Uz.A00(list);
                }
                C21446AkD.A01(a4g.A04, a4g, 33);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C20135A8w r25, java.util.List r26) {
        /*
            r5 = r25
            X.0ve r7 = r5.A0E
            r0 = 7533(0x1d6d, float:1.0556E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            r4 = r26
            if (r0 == 0) goto L_0x0047
            X.A2R r0 = X.AnonymousClass8BT.A0F(r5)
            X.9qT r0 = r0.A02()
            if (r0 == 0) goto L_0x0047
            java.util.List r1 = r0.A01
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r2.next()
            X.9qS r0 = (X.C193659qS) r0
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = r0.A00
            X.1BI r1 = r1.A02(r0)
            X.1E7 r0 = new X.1E7
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x002a
        L_0x0047:
            boolean r0 = r5.A0N
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 30
            X.6FG r0 = new X.6FG
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0085
        L_0x0058:
            X.6FE r0 = new X.6FE
            r0.<init>(r3)
            r4.add(r0)
            X.AM6 r2 = X.AnonymousClass8BT.A0G(r5)
            X.0ve r0 = r2.A00
            boolean r0 = X.C20045A4o.A01(r0)
            if (r0 == 0) goto L_0x0085
            X.8rN r1 = new X.8rN
            r1.<init>()
            java.lang.Integer r0 = X.C108955ca.A0g()
            r1.A00 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A01 = r0
            X.AM6.A01(r2, r1)
            X.18K r0 = r2.A01
            r0.CC7(r1)
        L_0x0085:
            X.00H r2 = r5.A0I
            java.lang.Object r0 = r2.get()
            X.A2R r0 = (X.A2R) r0
            X.00H r0 = r0.A0D
            java.lang.Object r1 = r0.get()
            X.A4G r1 = (X.A4G) r1
            java.util.List r3 = r1.A00
            X.C18070vi.A0W(r3)
            boolean r0 = X.AnonymousClass000.A1a(r3)
            if (r0 != 0) goto L_0x00a3
            X.A4G.A01(r1)
        L_0x00a3:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0185
            r0 = 7212(0x1c2c, float:1.0106E-41)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0185
            X.Atx r1 = new X.Atx
            r1.<init>(r5)
            X.99r r0 = new X.99r
            r0.<init>(r1)
            r4.add(r0)
            monitor-enter(r3)
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0182 }
        L_0x00c3:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x0147
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0182 }
            X.9N2 r11 = (X.AnonymousClass9N2) r11     // Catch:{ all -> 0x0182 }
            boolean r0 = r11 instanceof X.AnonymousClass8lH     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r9 = r2.get()     // Catch:{ all -> 0x0182 }
            X.A2R r9 = (X.A2R) r9     // Catch:{ all -> 0x0182 }
            X.8lH r11 = (X.AnonymousClass8lH) r11     // Catch:{ all -> 0x0182 }
            r7 = 0
            X.C18070vi.A0d(r11, r7)     // Catch:{ all -> 0x0182 }
            X.1Ty r1 = r9.A02     // Catch:{ all -> 0x0182 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = r11.A01     // Catch:{ all -> 0x0182 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A03(r8)     // Catch:{ all -> 0x0182 }
            X.AEW r6 = r1.A08(r0)     // Catch:{ all -> 0x0182 }
            X.1PM r1 = r9.A06     // Catch:{ all -> 0x0182 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A03(r8)     // Catch:{ all -> 0x0182 }
            X.1yf r10 = r1.A01(r0)     // Catch:{ all -> 0x0182 }
            if (r6 == 0) goto L_0x00c3
            if (r10 == 0) goto L_0x00c3
            int r1 = r10.A03     // Catch:{ all -> 0x0182 }
            r0 = 3
            if (r1 != r0) goto L_0x0141
            r9 = 2
            java.util.List r6 = r6.A0P     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = ", "
            X.B20 r0 = X.B20.A00     // Catch:{ all -> 0x0182 }
            java.lang.String r6 = X.C29431cG.A0h(r1, r6, r0)     // Catch:{ all -> 0x0182 }
        L_0x010b:
            java.lang.String r1 = r11.A00     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = r10.A08     // Catch:{ all -> 0x0182 }
            X.C18070vi.A0W(r0)     // Catch:{ all -> 0x0182 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0182 }
            X.0wS r25 = X.C18460wS.A00     // Catch:{ all -> 0x0182 }
            r14 = 0
            X.9tx r13 = new X.9tx     // Catch:{ all -> 0x0182 }
            r17 = r14
            r18 = r14
            r22 = r14
            r24 = r14
            r15 = r14
            r20 = r8
            r21 = r0
            r23 = r6
            r26 = r7
            r19 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "business_search"
            r0 = 41
            X.99s r1 = A00(r5, r13, r1, r4, r0)     // Catch:{ all -> 0x0182 }
            X.AyX r0 = new X.AyX     // Catch:{ all -> 0x0182 }
            r0.<init>(r5)     // Catch:{ all -> 0x0182 }
            r1.A00 = r0     // Catch:{ all -> 0x0182 }
            goto L_0x00c3
        L_0x0141:
            r9 = 1
            X.AEH r0 = r6.A08     // Catch:{ all -> 0x0182 }
            java.lang.String r6 = r0.A03     // Catch:{ all -> 0x0182 }
            goto L_0x010b
        L_0x0147:
            X.AM6 r5 = X.AnonymousClass8BT.A0G(r5)     // Catch:{ all -> 0x0182 }
            int r4 = r3.size()     // Catch:{ all -> 0x0182 }
            X.0ve r0 = r5.A00     // Catch:{ all -> 0x0182 }
            boolean r0 = X.C20045A4o.A01(r0)     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x0180
            X.8rN r2 = new X.8rN     // Catch:{ all -> 0x0182 }
            r2.<init>()     // Catch:{ all -> 0x0182 }
            java.lang.Integer r0 = X.C108955ca.A0f()     // Catch:{ all -> 0x0182 }
            r2.A00 = r0     // Catch:{ all -> 0x0182 }
            java.lang.Integer r0 = X.C17880vN.A0h()     // Catch:{ all -> 0x0182 }
            r2.A01 = r0     // Catch:{ all -> 0x0182 }
            X.AM6.A01(r5, r2)     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = "recent_search_size"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0182 }
            java.util.Map r0 = X.C108975cc.A0h(r1, r0)     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = X.AnonymousClass8BW.A0m(r0)     // Catch:{ all -> 0x0182 }
            r2.A04 = r0     // Catch:{ all -> 0x0182 }
            X.18K r0 = r5.A01     // Catch:{ all -> 0x0182 }
            r0.CC7(r2)     // Catch:{ all -> 0x0182 }
        L_0x0180:
            monitor-exit(r3)
            return
        L_0x0182:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20135A8w.A05(X.A8w, java.util.List):void");
    }

    public static final boolean A06(C20135A8w a8w) {
        AnonymousClass1DS r1 = a8w.A06;
        if (r1.A06() == null) {
            return true;
        }
        Number A1C = C108945cZ.A1C(r1);
        if (A1C == null || A1C.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean A08(C18030ve r2) {
        C20045A4o a4o = A0R;
        C18070vi.A0d(r2, 0);
        if (a4o.A03(r2) || a4o.A02(r2)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(C39611tM r2, String str) {
        if ((r2 instanceof C39631tO) && C18070vi.A18(((C39631tO) r2).A01, AnonymousClass3MX.A0l(str))) {
            return true;
        }
        if ((r2 instanceof C48582Na) && C18070vi.A18(((C48582Na) r2).A00.A0J, AnonymousClass3MX.A0l(str))) {
            return true;
        }
        if (!(r2 instanceof C1776199s) || !C18070vi.A18(((C1776199s) r2).A02.A07, str)) {
            return false;
        }
        return true;
    }

    public final void A0B(AnonymousClass1BI r28, Integer num, String str, int i, boolean z) {
        List<C39611tM> A10 = AnonymousClass3MW.A10(this.A07);
        if (A10 != null) {
            int i2 = 3;
            if (i == 28) {
                i2 = 2;
            }
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (C39611tM r1 : A10) {
                if (A09(r1, r28.getRawString())) {
                    if (r1 instanceof C48582Na) {
                        i2 = 0;
                    } else if (r1 instanceof C39631tO) {
                        i2 = 1;
                    }
                    i3 = i5 + 1;
                }
                if ((r1 instanceof C48582Na) || (r1 instanceof C39631tO)) {
                    i4++;
                } else if (!(r1 instanceof C1776199s)) {
                }
                i5++;
            }
            AM6 A0G2 = AnonymousClass8BT.A0G(this);
            C34141jz r2 = this.A0F;
            boolean A1T = AnonymousClass000.A1T(r2.A02, 98);
            String A022 = r2.A02();
            int A032 = C108955ca.A03(r2);
            String A0A2 = A0A();
            if (C20045A4o.A01(A0G2.A00)) {
                C171228rN r9 = new C171228rN();
                AnonymousClass8BT.A1C(r9, C17880vN.A0i(), A1T ? 1 : 0);
                r9.A02 = Integer.valueOf(i2);
                AM6.A01(A0G2, r9);
                AM6.A02(A0G2, r9, (Boolean) null, Integer.valueOf(A032), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), (Integer) null, num, (Integer) null, (Long) null, A0A2, (List) null);
                A0G2.A01.CC7(r9);
            }
            AM6 am6 = A0G2;
            am6.A04(Boolean.valueOf(z), Integer.valueOf(i2), A022, str, (String) null, (Map) null, 1, A1T ? 1 : 0);
        }
    }

    public final boolean A0C(AnonymousClass1BI r5) {
        List<C39611tM> A10 = AnonymousClass3MW.A10(this.A07);
        if (A10 != null && (!(A10 instanceof Collection) || !A10.isEmpty())) {
            for (C39611tM r1 : A10) {
                if ((r1 instanceof C1776199s) && C18070vi.A18(((C1776199s) r1).A02.A07, C72463Mc.A0n(r5))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final C1776199s A00(C20135A8w a8w, C195819tx r8, String str, List list, int i) {
        C196069uP r1 = AnonymousClass8BT.A0F(a8w).A04.A02;
        if (r1.A00 == null) {
            r1.A00();
        }
        C20079A6f a6f = r1.A00;
        C18070vi.A0X(a6f);
        boolean A1T = AnonymousClass000.A1T(i, 41);
        C1776199s r0 = new C1776199s(a6f, r8, new C22012AwE(a8w, r8), new C22326B3d(a8w, r8, str, i), i, A1T);
        list.add(r0);
        return r0;
    }

    public static final AnonymousClass6FI A01(C20135A8w a8w) {
        boolean z;
        APP app = AnonymousClass8BT.A0F(a8w).A04;
        C196069uP r2 = app.A02;
        if (r2.A00 == null) {
            r2.A00();
        }
        C20079A6f a6f = r2.A00;
        C18070vi.A0X(a6f);
        C20079A6f a6f2 = r2.A00;
        if (!r2.A03() || a6f2 == null || a6f2.A05()) {
            z = true;
        } else {
            z = app.A00;
        }
        return new AnonymousClass6FI(a6f, new C21873Atz(a8w), a8w.A0N, z);
    }

    public static final ArrayList A02(C20135A8w a8w, C24887COf cOf) {
        AnonymousClass1BI A002;
        ArrayList A13 = AnonymousClass000.A13();
        C42621yT r6 = cOf.A00;
        r6.A02();
        AnonymousClass00H r8 = a8w.A0I;
        A2R a2r = (A2R) r8.get();
        C34141jz r11 = (C34141jz) cOf.A01;
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A11 = AnonymousClass8BR.A11(C18070vi.A0E(a2r.A0B), new C1605388w[1], 0);
        if (AnonymousClass000.A1a(r11.A04())) {
            C1602687u r1 = a2r.A0A;
            List A042 = r11.A04();
            C18070vi.A0X(A042);
            A11.add(r1.BGg(A042));
        }
        Iterator it = a2r.A08.A06().iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q2 = C17880vN.A0Q(it);
            r6.A02();
            C18070vi.A0b(A0Q2);
            if ((!a2r.A05.A0M(A0Q2)) && C25181Nf.A00(A0Q2, A11)) {
                r6.A02();
                A132.add(A0Q2);
            }
        }
        if (C17880vN.A1X(A132)) {
            A13.add(new AnonymousClass6FG(2131888256, 37));
            ArrayList A0E2 = C29351c6.A0E(A132);
            Iterator it2 = A132.iterator();
            while (it2.hasNext()) {
                A0E2.add(new C39631tO(C17880vN.A0Q(it2), 2));
            }
            A13.addAll(A0E2);
        }
        r6.A02();
        A2R a2r2 = (A2R) r8.get();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A112 = AnonymousClass8BR.A11(C18070vi.A0E(a2r2.A0B), new C1605388w[1], 0);
        if (AnonymousClass000.A1a(r11.A04())) {
            C25181Nf r9 = a2r2.A09;
            C24921Me r5 = a2r2.A07;
            List A043 = r11.A04();
            C18070vi.A0X(A043);
            A112.add(new C67142zJ(r5, r9, (C52682bJ) C18070vi.A0E(a2r2.A0C), A043));
        }
        Iterator it3 = a2r2.A09.A03().iterator();
        while (it3.hasNext()) {
            AnonymousClass1E7 A0O2 = C17880vN.A0O(it3);
            r6.A02();
            if (A0O2.A0H != null && (A002 = AnonymousClass1E7.A00(A0O2)) != null && (!a2r2.A05.A0M(A002)) && !a2r2.A08.A06().contains(A002) && C25181Nf.A00(A002, A112)) {
                r6.A02();
                A133.add(A0O2);
            }
        }
        if (C17880vN.A1X(A133)) {
            A13.add(new AnonymousClass6FG(2131888885, 37));
            ArrayList A0E3 = C29351c6.A0E(A133);
            Iterator it4 = A133.iterator();
            while (it4.hasNext()) {
                A0E3.add(new C48582Na(C17880vN.A0O(it4)));
            }
            A13.addAll(A0E3);
        }
        return A13;
    }

    public static final void A03(C20135A8w a8w) {
        String str;
        AnonymousClass8BT.A0G(a8w).A05(a8w.A0A());
        APP app = AnonymousClass8BT.A0F(a8w).A04;
        AnonymousClass19T r3 = app.A05;
        r3.markerStart(207368785);
        C196069uP r4 = app.A02;
        if (!r4.A03()) {
            if (!r4.A03()) {
                AnonymousClass3MX.A1K(r4.A04, 3);
            }
            str = "location_permission_request_start";
        } else if (!((LocationManager) app.A04.A00.getSystemService("location")).isProviderEnabled("gps")) {
            if (r4.A03()) {
                AnonymousClass3MX.A1K(r4.A04, 4);
            }
            str = "turn_on_gps_setting_request_start";
        } else {
            r4.A02();
            str = "fetch_user_location_request_start";
        }
        r3.markerPoint(207368785, str);
    }

    public static final boolean A07(C20135A8w a8w) {
        if (A06(a8w)) {
            Object A062 = a8w.A03.A06();
            Boolean A0h = AnonymousClass000.A0h();
            if (!C18070vi.A18(A062, A0h) || !C18070vi.A18(a8w.A04.A06(), A0h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String A0A() {
        C196069uP r1 = AnonymousClass8BT.A0F(this).A04.A02;
        if (r1.A00 == null) {
            r1.A00();
        }
        String str = r1.A00.A08;
        C18070vi.A0X(str);
        return str;
    }
}
