package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1hg  reason: invalid class name and case insensitive filesystem */
public final class C32741hg implements C201511a {
    public C56092gt A00;
    public AnonymousClass71S A01;
    public Boolean A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass11S A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1TG A09;
    public final C24631Lb A0A;
    public final C18030ve A0B;
    public final AnonymousClass18K A0C;
    public final C32571hP A0D;
    public final AnonymousClass19Y A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final Map A0P;
    public final Map A0Q;
    public final C18100vl A0R = new C18110vm(C32751hh.A00);
    public final C24401Ke A0S;
    public final C24661Le A0T;
    public final AnonymousClass00H A0U;
    public final LinkedHashMap A0V = new C32761hi(this);

    public static final Integer A02(int i) {
        int i2;
        switch (i) {
            case 3:
                i2 = 3;
                break;
            case 4:
            case 10:
                i2 = 1;
                break;
            case 11:
                i2 = 4;
                break;
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public final void A05() {
        C56092gt r9 = this.A00;
        AnonymousClass71S r7 = this.A01;
        if (r9 != null && r7 != null) {
            ArrayList arrayList = new ArrayList();
            for (C56012gk r3 : r7.A0D.values()) {
                C46912Gj r2 = new C46912Gj();
                r2.A05 = Long.valueOf(r3.A05);
                r2.A06 = Long.valueOf(r3.A06);
                r2.A01 = Integer.valueOf(r3.A03);
                r2.A02 = Long.valueOf((long) r3.A00);
                r2.A00 = Integer.valueOf(r3.A02);
                r2.A04 = Long.valueOf((long) r3.A01);
                r2.A03 = Long.valueOf((long) r3.A04);
                String str = r3.A07;
                r2.A07 = str;
                if (str == null || str.length() == 0) {
                    this.A0C.CC7(r2);
                } else {
                    this.A0C.CC0(r2, AnonymousClass73K.A00, true);
                }
                arrayList.addAll(r3.A08.values());
            }
            this.A0F.CGF(new C146617Py(this, r7, arrayList, r9, 20));
            this.A01 = null;
        }
    }

    public final void A08(AnonymousClass77K r5) {
        C18070vi.A0d(r5, 0);
        C57602jL r3 = (C57602jL) this.A0M.get();
        String A002 = C50502Ur.A00(r5);
        if (A002 != null) {
            r3.A00.A05("status_privacy_type", A002);
        }
        r3.A00.A06("is_fb_crosspost", r5.A05);
    }

    public final void A09(AnonymousClass2HK r8, C139186yN r9, boolean z, boolean z2) {
        C18070vi.A0d(r9, 1);
        r8.A00 = Boolean.valueOf(z);
        List list = r9.A02;
        r8.A0C = Long.valueOf((long) list.size());
        r8.A0B = Long.valueOf(A01(list));
        List list2 = r9.A03;
        r8.A0H = Long.valueOf((long) list2.size());
        r8.A0G = Long.valueOf(A01(list2));
        List<C63372sx> list3 = r9.A01;
        r8.A09 = Long.valueOf((long) list3.size());
        r8.A08 = Long.valueOf(A01(list3));
        int i = 0;
        for (C63372sx A012 : list3) {
            i += A012.A01();
        }
        r8.A07 = Long.valueOf((long) i);
        long A013 = A01(list3);
        int i2 = 0;
        for (C63372sx A014 : list3) {
            i2 += A014.A01();
        }
        r8.A0A = Long.valueOf(A013 - ((long) i2));
        r8.A02 = Boolean.valueOf(z2);
        this.A0C.CC0(r8, new C18180vt(1, 1), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (java.lang.Integer.valueOf(r14) != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(com.whatsapp.jid.UserJid r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.util.List r24, java.util.List r25, java.util.List r26, java.util.Map r27) {
        /*
            r19 = this;
            r0 = 1
            r9 = r24
            X.C18070vi.A0d(r9, r0)
            r0 = 2
            r10 = r25
            X.C18070vi.A0d(r10, r0)
            r0 = 3
            r11 = r26
            X.C18070vi.A0d(r11, r0)
            r2 = r19
            X.2gt r4 = r2.A00
            if (r4 == 0) goto L_0x0095
            r3 = 1
            r7 = r21
            if (r21 == 0) goto L_0x002d
            r0 = 4
            int r1 = r7.intValue()
            if (r1 == r0) goto L_0x002d
            if (r1 == r3) goto L_0x002d
            r0 = 3
            if (r1 == r0) goto L_0x002d
            r0 = 2
            if (r1 == r0) goto L_0x002d
            r3 = 0
        L_0x002d:
            r6 = r20
            if (r22 != 0) goto L_0x009d
            if (r3 == 0) goto L_0x009b
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r6 == r0) goto L_0x009b
            r3 = 0
            r0 = 3
            java.util.List[] r1 = new java.util.List[r0]
            r1[r3] = r24
            r0 = 1
            r1[r0] = r25
            r0 = 2
            r1[r0] = r26
            java.util.List r0 = java.util.Arrays.asList(r1)
            X.C18070vi.A0X(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x004e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r3 = r5.next()
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            r14 = 0
        L_0x005f:
            if (r14 >= r1) goto L_0x004e
            java.lang.Object r0 = r3.get(r14)
            X.2sx r0 = (X.C63372sx) r0
            com.whatsapp.jid.UserJid r0 = r0.A0A
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x0096
            if (r14 < 0) goto L_0x004e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            if (r0 == 0) goto L_0x0099
        L_0x0077:
            X.11P r5 = r2.A08
            long r0 = r4.A06
            X.0vl r3 = r2.A0R
            java.lang.Object r3 = r3.getValue()
            java.util.Random r3 = (java.util.Random) r3
            long r17 = r3.nextLong()
            java.util.LinkedHashMap r13 = r2.A0V
            X.71S r4 = new X.71S
            r8 = r23
            r12 = r27
            r15 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            r2.A01 = r4
        L_0x0095:
            return
        L_0x0096:
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0099:
            r14 = -1
            goto L_0x0077
        L_0x009b:
            r14 = 0
            goto L_0x0077
        L_0x009d:
            int r14 = r22.intValue()
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32741hg.A0A(com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.Map):void");
    }

    public final void A0C(AnonymousClass206 r3, int i) {
        C56012gk r0;
        C138716xZ r1;
        C18070vi.A0d(r3, 0);
        AnonymousClass71S r02 = this.A01;
        if (r02 != null && (r0 = (C56012gk) r02.A0D.get(C60562oE.A00(r3))) != null && (r1 = (C138716xZ) r0.A08.get(r3.A0v)) != null) {
            r1.A0L = Integer.valueOf(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b2, code lost:
        if (r4 != 16) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass206 r10, java.lang.Boolean r11, java.lang.Boolean r12, java.lang.Long r13, java.lang.String r14, boolean r15) {
        /*
            r9 = this;
            r4 = 0
            if (r10 == 0) goto L_0x01c9
            int r1 = r10.A0u
            r0 = 56
            if (r1 == r0) goto L_0x01c9
            r0 = 67
            if (r1 == r0) goto L_0x01c9
            r0 = 68
            if (r1 == r0) goto L_0x01c9
            r0 = 79
            if (r1 == r0) goto L_0x01c9
            r0 = 86
            if (r1 == r0) goto L_0x01c9
            r0 = 93
            if (r1 == r0) goto L_0x01c9
            boolean r0 = r10 instanceof X.C444023h
            if (r0 != 0) goto L_0x01c9
            X.00H r0 = r9.A0I
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r3 = r0.A01(r10)
            boolean r8 = X.AnonymousClass25A.A0p(r10)
            if (r8 != 0) goto L_0x0166
            X.2HJ r2 = new X.2HJ
            r2.<init>()
            X.2gt r0 = r9.A00
            if (r0 == 0) goto L_0x0424
            long r0 = r0.A06
        L_0x003e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A06 = r0
            r2.A0C = r13
            int r0 = r14.hashCode()
            r1 = 3
            switch(r0) {
                case -2144528557: goto L_0x0417;
                case -2101465844: goto L_0x040b;
                case -2054838772: goto L_0x03fe;
                case -1911610141: goto L_0x03f2;
                case -1903704052: goto L_0x03e6;
                case -1892291233: goto L_0x03da;
                case -1867169789: goto L_0x03ce;
                case -1858954673: goto L_0x03c2;
                case -1735489987: goto L_0x03b7;
                case -1719306288: goto L_0x03ab;
                case -1632832982: goto L_0x039f;
                case -1597391554: goto L_0x0393;
                case -1412796971: goto L_0x0387;
                case -1393956401: goto L_0x037b;
                case -1302125668: goto L_0x036f;
                case -1050195209: goto L_0x0363;
                case -1031350867: goto L_0x0357;
                case -962621161: goto L_0x034b;
                case -705042791: goto L_0x033f;
                case -678813737: goto L_0x0333;
                case -678811828: goto L_0x0327;
                case -678803141: goto L_0x031c;
                case -678799174: goto L_0x0310;
                case -678797283: goto L_0x0304;
                case -621954360: goto L_0x02f8;
                case -383881924: goto L_0x02ec;
                case -379366874: goto L_0x02e0;
                case -319471333: goto L_0x02d4;
                case -160901288: goto L_0x02c8;
                case 92051438: goto L_0x02bc;
                case 102877576: goto L_0x02b0;
                case 431581758: goto L_0x02a4;
                case 453533720: goto L_0x0298;
                case 476588369: goto L_0x028d;
                case 1086481592: goto L_0x0282;
                case 1095692943: goto L_0x027e;
                case 1104124682: goto L_0x0272;
                case 1354954699: goto L_0x0266;
                case 1380799384: goto L_0x025a;
                case 1465774270: goto L_0x024e;
                case 1635687844: goto L_0x0242;
                case 1643533646: goto L_0x0236;
                case 1744829935: goto L_0x022a;
                case 2043678173: goto L_0x021d;
                case 2135113955: goto L_0x0210;
                default: goto L_0x0054;
            }
        L_0x0054:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A09 = r0
            r2.A02 = r11
            r2.A03 = r12
            X.0ve r1 = r9.A0B
            r0 = 10024(0x2728, float:1.4047E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            r7 = 0
            if (r0 == 0) goto L_0x0079
            X.36j r0 = X.C63672tV.A02(r10)
            if (r0 == 0) goto L_0x020a
            boolean r0 = r0.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0077:
            r2.A04 = r0
        L_0x0079:
            X.1Le r0 = r9.A0T
            int r4 = r0.A05()
            r1 = 3
            if (r4 == 0) goto L_0x008b
            r1 = 2
            r0 = 1
            if (r4 == r0) goto L_0x008b
            r0 = 2
            r1 = 4
            if (r4 == r0) goto L_0x008b
            r1 = 1
        L_0x008b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A05 = r0
            int r1 = r10.A09
            r4 = 3
            if (r1 == r4) goto L_0x00a7
            r4 = 4
            if (r1 == r4) goto L_0x0207
            r0 = 5
            if (r1 == r0) goto L_0x0204
            r0 = 10
            if (r1 == r0) goto L_0x0204
            r0 = 11
            if (r1 == r0) goto L_0x0204
            switch(r1) {
                case 20: goto L_0x0200;
                case 21: goto L_0x01fc;
                case 22: goto L_0x01f9;
                case 23: goto L_0x01f5;
                case 24: goto L_0x01f1;
                case 25: goto L_0x01ed;
                case 26: goto L_0x01e9;
                case 27: goto L_0x01e5;
                case 28: goto L_0x01e1;
                case 29: goto L_0x01de;
                case 30: goto L_0x01de;
                case 31: goto L_0x01de;
                case 32: goto L_0x01da;
                case 33: goto L_0x01d6;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A08 = r0
            if (r0 == 0) goto L_0x00b4
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L_0x00b5
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
            X.77K r0 = X.C63672tV.A00(r10)
            if (r0 == 0) goto L_0x01d3
            int r4 = r0.A00
            r1 = 3
            if (r4 == 0) goto L_0x00cf
            r1 = 2
            r0 = 1
            if (r4 == r0) goto L_0x00cf
            r0 = 2
            r1 = 4
            if (r4 == r0) goto L_0x00cf
            r1 = 1
        L_0x00cf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x00d3:
            r2.A07 = r0
            X.00H r0 = r9.A0L
            java.lang.Object r0 = r0.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r4 = r0.A01
            r0 = 8729(0x2219, float:1.2232E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x00fc
            X.36j r0 = X.C63672tV.A02(r10)
            if (r0 == 0) goto L_0x01cf
            java.util.Set r0 = r0.A05
            if (r0 == 0) goto L_0x01cf
            int r0 = r0.size()
            long r0 = (long) r0
        L_0x00f6:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
        L_0x00fc:
            r0 = 8857(0x2299, float:1.2411E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0119
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r2.A01 = r0
            X.11P r0 = r9.A08
            long r5 = X.AnonymousClass11P.A01(r0)
            long r0 = r10.A0I
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.A0B = r0
        L_0x0119:
            r0 = 8729(0x2219, float:1.2232E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x013e
            r0 = 9816(0x2658, float:1.3755E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x013e
            r0 = 9692(0x25dc, float:1.3581E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x013e
            int r1 = r10.A09
            r0 = 23
            if (r1 != r0) goto L_0x0138
            r7 = 1
        L_0x0138:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.A00 = r0
        L_0x013e:
            r0 = 11871(0x2e5f, float:1.6635E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0161
            X.36j r0 = X.C63672tV.A02(r10)
            if (r0 == 0) goto L_0x0161
            X.77N r3 = r0.A01
            if (r3 == 0) goto L_0x0161
            java.lang.String r0 = r3.A05
            r2.A0F = r0
            int r0 = r3.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0A = r0
            java.lang.String r0 = r3.A06
            r2.A0G = r0
        L_0x0161:
            X.18K r0 = r9.A0C
            r0.CC7(r2)
        L_0x0166:
            java.lang.String r0 = "success"
            boolean r1 = r14.equals(r0)
            X.00H r0 = r9.A0N
            if (r1 != 0) goto L_0x042e
            java.lang.Object r4 = r0.get()
            X.2tc r4 = (X.C63742tc) r4
            r2 = r14
            java.lang.String r0 = "request"
            boolean r3 = r14.equals(r0)
            if (r3 == 0) goto L_0x0181
            r2 = 0
        L_0x0181:
            int r1 = r14.hashCode()
            r0 = 12
            switch(r1) {
                case 1095692943: goto L_0x01ca;
                default: goto L_0x018a;
            }
        L_0x018a:
            r4.A04(r10, r13, r2, r0)
            X.00H r0 = r9.A0M
            java.lang.Object r2 = r0.get()
            X.2jL r2 = (X.C57602jL) r2
            X.205 r0 = r10.A0v
            java.lang.String r1 = r0.A01
            X.C18070vi.A0X(r1)
            X.2nU r4 = r2.A00
            java.lang.String r0 = "status_post_id"
            r4.A05(r0, r1)
            if (r3 != 0) goto L_0x0428
            java.lang.String r0 = "post_status_failure"
            r4.A04(r0)
            X.2iK r0 = r4.A02
            X.0ve r2 = r0.A00
            r1 = 8104(0x1fa8, float:1.1356E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01c9
            java.lang.Long r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x01c7
            long r1 = r0.longValue()
            X.1dL r0 = r4.A01
            r0.flowEndFail(r1, r14, r3)
        L_0x01c7:
            r4.A00 = r3
        L_0x01c9:
            return
        L_0x01ca:
            if (r3 == 0) goto L_0x018a
            r0 = 13
            goto L_0x018a
        L_0x01cf:
            r0 = 0
            goto L_0x00f6
        L_0x01d3:
            r0 = 0
            goto L_0x00d3
        L_0x01d6:
            r4 = 19
            goto L_0x00a7
        L_0x01da:
            r4 = 18
            goto L_0x00a7
        L_0x01de:
            r4 = 5
            goto L_0x00a7
        L_0x01e1:
            r4 = 8
            goto L_0x00a7
        L_0x01e5:
            r4 = 11
            goto L_0x00a7
        L_0x01e9:
            r4 = 17
            goto L_0x00a7
        L_0x01ed:
            r4 = 9
            goto L_0x00a7
        L_0x01f1:
            r4 = 10
            goto L_0x00a7
        L_0x01f5:
            r4 = 16
            goto L_0x00a7
        L_0x01f9:
            r4 = 6
            goto L_0x00a7
        L_0x01fc:
            r4 = 13
            goto L_0x00a7
        L_0x0200:
            r4 = 12
            goto L_0x00a7
        L_0x0204:
            r4 = 2
            goto L_0x00a7
        L_0x0207:
            r4 = 1
            goto L_0x00a7
        L_0x020a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x0077
        L_0x0210:
            java.lang.String r0 = "user_manual_retry"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 50
            goto L_0x0054
        L_0x021d:
            java.lang.String r0 = "user_cancelled"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 48
            goto L_0x0054
        L_0x022a:
            java.lang.String r0 = "media_switch_required"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 23
            goto L_0x0054
        L_0x0236:
            java.lang.String r0 = "media_error_optimistic_hash"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 16
            goto L_0x0054
        L_0x0242:
            java.lang.String r0 = "error_e2ee"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 44
            goto L_0x0054
        L_0x024e:
            java.lang.String r0 = "media_error_too_large"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 24
            goto L_0x0054
        L_0x025a:
            java.lang.String r0 = "media_error_no_permissions"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 8
            goto L_0x0054
        L_0x0266:
            java.lang.String r0 = "media_error_transcoding_unknown"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 30
            goto L_0x0054
        L_0x0272:
            java.lang.String r0 = "error_backfill_usync_failed"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 40
            goto L_0x0054
        L_0x027e:
            java.lang.String r0 = "request"
            goto L_0x03d1
        L_0x0282:
            java.lang.String r0 = "media_error_io"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 7
            goto L_0x0054
        L_0x028d:
            java.lang.String r0 = "cancelled"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 2
            goto L_0x0054
        L_0x0298:
            java.lang.String r0 = "error_upload"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 39
            goto L_0x0054
        L_0x02a4:
            java.lang.String r0 = "media_error_conn"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 26
            goto L_0x0054
        L_0x02b0:
            java.lang.String r0 = "error_invalid_message"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 43
            goto L_0x0054
        L_0x02bc:
            java.lang.String r0 = "error_expired"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 38
            goto L_0x0054
        L_0x02c8:
            java.lang.String r0 = "media_error_bad_media"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 9
            goto L_0x0054
        L_0x02d4:
            java.lang.String r0 = "error_client_out_of_memory"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 51
            goto L_0x0054
        L_0x02e0:
            java.lang.String r0 = "media_error_no_client_network"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 21
            goto L_0x0054
        L_0x02ec:
            java.lang.String r0 = "media_error_throttle"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 19
            goto L_0x0054
        L_0x02f8:
            java.lang.String r0 = "media_error_not_finalized"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 15
            goto L_0x0054
        L_0x0304:
            java.lang.String r0 = "media_error_url"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 27
            goto L_0x0054
        L_0x0310:
            java.lang.String r0 = "media_error_ssl"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 20
            goto L_0x0054
        L_0x031c:
            java.lang.String r0 = "media_error_oom"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 6
            goto L_0x0054
        L_0x0327:
            java.lang.String r0 = "media_error_fnf"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 11
            goto L_0x0054
        L_0x0333:
            java.lang.String r0 = "media_error_dns"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 18
            goto L_0x0054
        L_0x033f:
            java.lang.String r0 = "media_skipped_ep_no_primary_host"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 34
            goto L_0x0054
        L_0x034b:
            java.lang.String r0 = "media_error_optimistic_network_unsafe"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 29
            goto L_0x0054
        L_0x0357:
            java.lang.String r0 = "error_payload_too_big"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 41
            goto L_0x0054
        L_0x0363:
            java.lang.String r0 = "error_network"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 37
            goto L_0x0054
        L_0x036f:
            java.lang.String r0 = "media_error_wamsys"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 25
            goto L_0x0054
        L_0x037b:
            java.lang.String r0 = "media_error_no_direct_path"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 36
            goto L_0x0054
        L_0x0387:
            java.lang.String r0 = "media_error_server"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 13
            goto L_0x0054
        L_0x0393:
            java.lang.String r0 = "media_error_file_format_unsupported"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 31
            goto L_0x0054
        L_0x039f:
            java.lang.String r0 = "error_invalid_protobuf"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 45
            goto L_0x0054
        L_0x03ab:
            java.lang.String r0 = "ephemerally_expired"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 47
            goto L_0x0054
        L_0x03b7:
            java.lang.String r0 = "media_error_request"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 4
            goto L_0x0054
        L_0x03c2:
            java.lang.String r0 = "media_error_cronet"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 35
            goto L_0x0054
        L_0x03ce:
            java.lang.String r0 = "success"
        L_0x03d1:
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 1
            goto L_0x0054
        L_0x03da:
            java.lang.String r0 = "media_error_request_timeout"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 14
            goto L_0x0054
        L_0x03e6:
            java.lang.String r0 = "error_location"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 42
            goto L_0x0054
        L_0x03f2:
            java.lang.String r0 = "media_error_no_such_algorithm"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 28
            goto L_0x0054
        L_0x03fe:
            java.lang.String r0 = "server_error"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 46
            goto L_0x0054
        L_0x040b:
            java.lang.String r0 = "failed_insufficient_space"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 10
            goto L_0x0054
        L_0x0417:
            java.lang.String r0 = "user_deleted_unsent_message"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0054
            r1 = 49
            goto L_0x0054
        L_0x0424:
            r0 = 0
            goto L_0x003e
        L_0x0428:
            java.lang.String r0 = "post_status_request"
            r4.A04(r0)
            return
        L_0x042e:
            java.lang.Object r2 = r0.get()
            X.2tc r2 = (X.C63742tc) r2
            if (r8 == 0) goto L_0x043c
            r1 = 5
            r0 = 0
            r2.A04(r10, r0, r0, r1)
            return
        L_0x043c:
            r1 = 14
            r0 = 0
            r2.A04(r10, r0, r0, r1)
            X.00H r0 = r9.A0M
            java.lang.Object r1 = r0.get()
            X.2jL r1 = (X.C57602jL) r1
            X.205 r0 = r10.A0v
            java.lang.String r2 = r0.A01
            X.C18070vi.A0X(r2)
            X.2nU r1 = r1.A00
            java.lang.String r0 = "status_post_id"
            r1.A05(r0, r2)
            java.lang.String r0 = "post_status_success"
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32741hg.A0D(X.206, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, boolean):void");
    }

    public final void A0G(Integer num, String str) {
        String obj;
        C18070vi.A0d(str, 1);
        C57602jL r2 = (C57602jL) this.A0M.get();
        boolean A18 = C18070vi.A18(((C35511mM) r2.A01.get()).A01(AnonymousClass00R.A0L), true);
        C60162nU r22 = r2.A00;
        r22.A04("tap_status_share");
        r22.A05("status_share_method", str);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                obj = "text";
            } else if (intValue == 3) {
                obj = "video";
            } else if (intValue == 13) {
                obj = "gif";
            } else if (intValue == 1) {
                obj = "photo";
            } else if (intValue == 2) {
                obj = "voice";
            }
            r22.A05("status_content_type", obj);
            r22.A06("is_fb_auto_crossposting_enabled_end", A18);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown_content_type ");
        sb.append(num);
        obj = sb.toString();
        r22.A05("status_content_type", obj);
        r22.A06("is_fb_auto_crossposting_enabled_end", A18);
    }

    public final void A0H(Map map, int i) {
        long j;
        C56092gt r2 = this.A00;
        boolean z = false;
        if (r2 != null && !r2.A05 && r2.A08) {
            z = true;
        }
        C17960vV.A0F(z, "Report tab open only once per session");
        C46582Fc r22 = new C46582Fc();
        C56092gt r0 = this.A00;
        if (r0 != null) {
            j = r0.A06;
        } else {
            j = 0;
        }
        r22.A01 = Long.valueOf(j);
        r22.A00 = Long.valueOf((long) i);
        r22.A02 = C60562oE.A01(map);
        this.A0C.CC7(r22);
        C56092gt r02 = this.A00;
        if (r02 != null) {
            r02.A05 = true;
        }
    }

    public static final int A00(AnonymousClass206 r3, C32741hg r4, int i) {
        if (i == 11) {
            return 14;
        }
        if (i == 16) {
            return 7;
        }
        if (i == 18 || i == 23 || i == 29) {
            return 9;
        }
        if (i == 13) {
            return 11;
        }
        if (i == 14) {
            return 8;
        }
        if (i == 31) {
            return 3;
        }
        if (i == 32) {
            return 14;
        }
        switch (i) {
            case 1:
                String A0P2 = r3.A0P();
                if (A0P2 == null || C137186v3.A00(A0P2) != 1) {
                    return 2;
                }
                int codePointAt = Character.codePointAt(A0P2, 0);
                Set set = AnonymousClass73K.A01;
                Integer valueOf = Integer.valueOf(codePointAt);
                if (!set.contains(valueOf)) {
                    return 2;
                }
                String A012 = C18020vd.A01(C18040vf.A02, r4.A0B, 1852);
                C18070vi.A0X(A012);
                if (!AnonymousClass73K.A01(A012).contains(valueOf)) {
                    return 2;
                }
                return 15;
            case 2:
                return 3;
            case 3:
                return 14;
            case 4:
                return 6;
            case 5:
                return 4;
            case 6:
                return 8;
            case 7:
                return 10;
            case 8:
                return 5;
            case 9:
                return 2;
            default:
                return 1;
        }
    }

    public final void A03() {
        C63742tc r2 = (C63742tc) this.A0N.get();
        if (C63742tc.A03(r2)) {
            AnonymousClass2HA A002 = C63742tc.A00(r2);
            A002.A03 = 27;
            r2.A01.CC7(A002);
        }
    }

    public final void A04() {
        C18030ve r2 = this.A0B;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 12218) || C18020vd.A05(r1, r2, 11871)) {
            A05();
        }
        ((C138896xs) this.A0U.get()).A00 = null;
        C56092gt r3 = this.A00;
        if (r3 != null && r3.A08) {
            AnonymousClass2GK r22 = new AnonymousClass2GK();
            r22.A02 = Long.valueOf(r3.A06);
            r22.A04 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A07);
            r22.A05 = Long.valueOf((long) r3.A03);
            r22.A03 = Long.valueOf((long) r3.A02);
            int i = r3.A00;
            if (i != 0) {
                r22.A01 = Integer.valueOf(i);
            }
            int i2 = r3.A01;
            if (i2 != 0) {
                r22.A00 = Integer.valueOf(i2);
            }
            this.A0C.CC7(r22);
            this.A00 = null;
        }
    }

    public final void A06(int i) {
        Long l;
        C63742tc r3 = (C63742tc) this.A0N.get();
        if (C63742tc.A03(r3)) {
            AnonymousClass2HA A002 = C63742tc.A00(r3);
            A002.A03 = 24;
            A002.A02 = Integer.valueOf(i);
            r3.A01.CC7(A002);
        }
        if (C18020vd.A05(C18040vf.A02, ((C56972iK) r3.A05.get()).A00, 6708) && (l = ((C138896xs) r3.A03.get()).A00) != null) {
            ((C58082k7) r3.A04.get()).A00(i, l.longValue());
        }
        Long l2 = ((C138896xs) this.A0U.get()).A00;
        if (l2 != null) {
            ((C57602jL) this.A0M.get()).A00(i, l2.longValue());
        }
    }

    public final void A07(int i) {
        Long l;
        C63742tc r3 = (C63742tc) this.A0N.get();
        if (C63742tc.A03(r3)) {
            AnonymousClass2HA A002 = C63742tc.A00(r3);
            A002.A03 = 23;
            A002.A02 = Integer.valueOf(i);
            r3.A01.CC7(A002);
        }
        if (C18020vd.A05(C18040vf.A02, ((C56972iK) r3.A05.get()).A00, 6708) && (l = ((C138896xs) r3.A03.get()).A00) != null) {
            ((C58082k7) r3.A04.get()).A00(i, l.longValue());
        }
        Long l2 = ((C138896xs) this.A0U.get()).A00;
        if (l2 != null) {
            ((C57602jL) this.A0M.get()).A00(i, l2.longValue());
        }
    }

    public final void A0B(AnonymousClass206 r3, int i) {
        C56012gk r0;
        C138716xZ r1;
        AnonymousClass71S r02 = this.A01;
        if (r02 != null && (r0 = (C56012gk) r02.A0D.get(C60562oE.A00(r3))) != null && (r1 = (C138716xZ) r0.A08.get(r3.A0v)) != null) {
            r1.A0K = Integer.valueOf(i);
        }
    }

    public final void A0E(Boolean bool) {
        AnonymousClass00H r1 = this.A0U;
        ((C138896xs) r1.get()).A01();
        Long l = ((C138896xs) r1.get()).A00;
        if (l != null) {
            this.A00 = new C56092gt(this.A08, l.longValue(), C18070vi.A18(bool, true));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 == 3) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r1 = (X.C58082k7) r3.A04.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r4 = this;
            X.00H r0 = r4.A0N
            java.lang.Object r3 = r0.get()
            X.2tc r3 = (X.C63742tc) r3
            boolean r0 = X.C63742tc.A03(r3)
            if (r0 == 0) goto L_0x0044
            X.2HA r2 = X.C63742tc.A00(r3)
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            java.lang.Integer r0 = X.C63742tc.A01(r6)
            r2.A02 = r0
            r0 = 0
            java.lang.Integer r0 = X.C63742tc.A02(r5, r0)
            r2.A01 = r0
            if (r7 == 0) goto L_0x0071
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0039
            r0 = 2
            if (r1 == r0) goto L_0x0039
            r0 = 4
            if (r1 == r0) goto L_0x0039
            r0 = 3
            if (r1 != r0) goto L_0x0071
        L_0x0039:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x003d:
            r2.A00 = r0
            X.18K r0 = r3.A01
            r0.CC7(r2)
        L_0x0044:
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.2iK r0 = (X.C56972iK) r0
            X.0ve r2 = r0.A00
            r1 = 6708(0x1a34, float:9.4E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0070
            X.00H r0 = r3.A04
            java.lang.Object r1 = r0.get()
            X.2k7 r1 = (X.C58082k7) r1
            java.lang.Long r0 = r1.A00
            if (r0 == 0) goto L_0x0070
            long r2 = r0.longValue()
            X.1dL r1 = r1.A01
            java.lang.String r0 = "tap_status_share"
            r1.flowMarkPoint(r2, r0)
        L_0x0070:
            return
        L_0x0071:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32741hg.A0F(java.lang.Integer, java.lang.Integer, java.lang.Integer):void");
    }

    public static final long A01(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C63372sx) it.next()).A00();
        }
        return (long) i;
    }

    public C32741hg(AnonymousClass195 r25, AnonymousClass11S r26, AnonymousClass1M9 r27, AnonymousClass11P r28, AnonymousClass1TG r29, C24631Lb r30, C24661Le r31, C18030ve r32, AnonymousClass18K r33, C32571hP r34, AnonymousClass19Y r35, AnonymousClass10I r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46) {
        AnonymousClass11P r20 = r28;
        C18070vi.A0d(r20, 1);
        C18030ve r16 = r32;
        C18070vi.A0d(r16, 2);
        AnonymousClass00H r15 = r37;
        C18070vi.A0d(r15, 3);
        AnonymousClass11S r22 = r26;
        C18070vi.A0d(r22, 4);
        AnonymousClass10I r11 = r36;
        C18070vi.A0d(r11, 5);
        AnonymousClass18K r14 = r33;
        C18070vi.A0d(r14, 6);
        C24661Le r17 = r31;
        C18070vi.A0d(r17, 7);
        AnonymousClass1M9 r21 = r27;
        C18070vi.A0d(r21, 8);
        AnonymousClass1TG r19 = r29;
        C18070vi.A0d(r19, 9);
        C32571hP r13 = r34;
        C18070vi.A0d(r13, 10);
        AnonymousClass00H r10 = r38;
        C18070vi.A0d(r10, 11);
        C24631Lb r18 = r30;
        C18070vi.A0d(r18, 12);
        AnonymousClass195 r23 = r25;
        C18070vi.A0d(r23, 13);
        AnonymousClass00H r9 = r39;
        C18070vi.A0d(r9, 14);
        AnonymousClass00H r8 = r40;
        C18070vi.A0d(r8, 15);
        AnonymousClass00H r7 = r41;
        C18070vi.A0d(r7, 16);
        AnonymousClass19Y r12 = r35;
        C18070vi.A0d(r12, 17);
        AnonymousClass00H r6 = r42;
        C18070vi.A0d(r6, 18);
        AnonymousClass00H r5 = r43;
        C18070vi.A0d(r5, 19);
        AnonymousClass00H r4 = r44;
        C18070vi.A0d(r4, 20);
        AnonymousClass00H r3 = r45;
        C18070vi.A0d(r3, 21);
        AnonymousClass00H r2 = r46;
        C18070vi.A0d(r2, 22);
        this.A08 = r20;
        this.A0B = r16;
        this.A0L = r15;
        this.A06 = r22;
        this.A0F = r11;
        this.A0C = r14;
        this.A0T = r17;
        this.A07 = r21;
        this.A09 = r19;
        this.A0D = r13;
        this.A0U = r10;
        this.A0A = r18;
        this.A0O = r9;
        this.A0N = r8;
        this.A0I = r7;
        this.A0E = r12;
        this.A0M = r6;
        this.A0K = r5;
        this.A0H = r4;
        this.A0J = r3;
        this.A0G = r2;
        C32771hj r24 = new C32771hj(this);
        this.A0S = r24;
        this.A0Q = new HashMap();
        this.A0P = new HashMap();
        r23.registerObserver(r24);
    }
}
