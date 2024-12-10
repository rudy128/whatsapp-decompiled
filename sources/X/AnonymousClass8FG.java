package X;

import android.os.Build;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8FG  reason: invalid class name */
public final class AnonymousClass8FG extends AnonymousClass8FK implements C22553BCk, BAW, BAX {
    public int A00;
    public Bundle A01;
    public AnonymousClass1DT A02;
    public D44 A03;
    public C20272AEf A04;
    public C20079A6f A05;
    public C195459tN A06;
    public AF1 A07;
    public A5P A08;
    public String A09;
    public ArrayList A0A;
    public HashSet A0B;
    public List A0C;
    public boolean A0D;
    public final C22801Dg A0E;
    public final C22801Dg A0F;
    public final AnonymousClass1DT A0G;
    public final C37361pP A0H;
    public final AnonymousClass1KB A0I;
    public final AM7 A0J;
    public final C192699op A0K;
    public final A5L A0L;
    public final C199299zl A0M;
    public final A36 A0N;
    public final AEQ A0O;
    public final AnonymousClass118 A0P;
    public final C219217x A0Q;
    public final C18000vb A0R;
    public final AnonymousClass1XN A0S;
    public final C41731wy A0T;
    public final C41731wy A0U;
    public final C41731wy A0V;
    public final C41731wy A0W;
    public final AnonymousClass10I A0X;
    public final AnonymousClass1DS A0Y;
    public final C20653ATl A0Z;
    public final C22427B7j A0a;
    public final AP5 A0b;
    public final C22433B7p A0c;
    public final List A0d;

    public static final void A05(AnonymousClass8FG r13) {
        String str;
        r13.A07 = null;
        r13.A08.A02();
        AnonymousClass3MX.A1J(r13.A0W, 12);
        AP5 ap5 = r13.A0b;
        ap5.A0D((String) null);
        C188769hx r2 = ap5.A09;
        r2.A0I = false;
        r2.A0G = AnonymousClass000.A13();
        r2.A02 = 0;
        r2.A03 = 9;
        C22801Dg r1 = r13.A0F;
        A36 a36 = r13.A0N;
        r1.A0F(A36.A00(a36, r13, 77));
        C20653ATl aTl = r13.A0Z;
        AEQ aeq = r13.A0O;
        C20079A6f a6f = r13.A05;
        if (a36.A0B()) {
            str = "all_descendents";
        } else {
            str = "current";
        }
        C190499l3 A022 = a36.A02();
        C184189aY r3 = new C184189aY(150, (String) null);
        aTl.A01();
        C20650ATi aTi = new C20650ATi(a6f, aTl, (Jid) null);
        aTl.A03 = aTi;
        C169208kX BGx = aTl.A0H.BGx(r3, A022, a6f, aeq, aTi, aTl.A0M.A00, "all_descendents", str, (String) null, "map_view_serp");
        BGx.A0E();
        aTl.A00 = BGx;
        AnonymousClass3MX.A1J(r13.A02, 2);
    }

    public void Bmu(List list) {
        this.A00 = 3;
    }

    public void Bmv(Map map) {
        AnonymousClass1D6 r0;
        AF1 af1;
        C18070vi.A0d(map, 0);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C20291AEz aEz = ((AF1) it.next()).A0B;
            AF0 af0 = (AF0) map.get(aEz.A0A);
            if (af0 != null) {
                aEz.A03 = af0;
            }
        }
        List list = this.A0C;
        if (!(list == null || (r0 = this.A08.A06) == null || (af1 = (AF1) r0.first) == null)) {
            A04(af1, this, list);
        }
        this.A08.A03();
        this.A00 = 2;
    }

    public void Bvo(C190599lD r1, int i) {
    }

    public static final Set A00(AnonymousClass8FG r6) {
        ArrayList arrayList = r6.A0A;
        if (arrayList.isEmpty()) {
            return C25511Om.A00;
        }
        if (arrayList.size() > 1) {
            C29391cC.A0H(arrayList, new C21486Akr(13));
        }
        float f = ((AF1) AnonymousClass8BS.A0Y(arrayList)).A06;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            AF1 af1 = (AF1) next;
            if (i >= 30 && af1.A06 != f) {
                break;
            }
            i++;
            A13.add(next);
        }
        return C29431cG.A12(A13);
    }

    public static final void A03(AF1 af1, AnonymousClass8KV r11, AnonymousClass8FG r12, Integer num) {
        int i = r11.A00;
        int i2 = 67;
        if (i == 1) {
            i2 = 66;
        }
        AM7 am7 = r12.A0J;
        C20291AEz aEz = af1.A0B;
        int i3 = aEz.A01;
        boolean z = af1.A0A;
        int i4 = aEz.A02;
        float f = r12.A08.A08.A02().A02;
        boolean z2 = af1.A09;
        Integer A022 = C20079A6f.A02(r12);
        LinkedHashMap A13 = C17880vN.A13();
        A13.put("ranked_position", Integer.valueOf(i3));
        A13.put("has_title", Boolean.valueOf(z));
        A13.put("is_selected", Boolean.valueOf(z2));
        A13.put("zoom_level", Float.valueOf(f));
        A13.put("segment_index", Integer.valueOf(i4));
        am7.A08(A022, num, A13, 11, i2, 1);
    }

    public static final void A06(AnonymousClass8FG r4) {
        int i = r4.A00;
        if (i == 0 || i == 3) {
            C20653ATl aTl = r4.A0Z;
            ArrayList arrayList = r4.A0A;
            ArrayList A0D2 = C29351c6.A0D(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0D2.add(((AF1) it.next()).A0B.A0A);
            }
            aTl.A05(A0D2, r4.A0d);
            r4.A00 = 1;
        }
    }

    public void A0S() {
        C195459tN r1 = this.A06;
        if (r1 != null) {
            r1.A00 = true;
        }
        this.A08.A02();
        this.A0b.A09();
        C20653ATl aTl = this.A0Z;
        aTl.A07 = null;
        aTl.A08 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r10.A02() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C169268kl A0T(X.AF1 r9, X.AF0 r10, int r11) {
        /*
            r8 = this;
            X.APR r3 = new X.APR
            r3.<init>(r8, r11)
            X.A6f r0 = r8.A05
            int r6 = r0.A03()
            boolean r0 = r0.A07()
            r5 = r10
            if (r0 == 0) goto L_0x0019
            boolean r0 = r10.A02()
            r7 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            X.A6f r0 = r8.A05
            java.lang.Double r0 = r0.A03
            X.C18070vi.A0b(r0)
            double r0 = r0.doubleValue()
            X.A6f r2 = r8.A05
            java.lang.Double r2 = r2.A04
            X.C18070vi.A0b(r2)
            com.google.android.gms.maps.model.LatLng r2 = X.AnonymousClass8BV.A09(r2, r0)
            r0 = 1
            X.APU r4 = new X.APU
            r4.<init>(r0)
            X.8kl r1 = new X.8kl
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.A00 = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8FG.A0T(X.AF1, X.AF0, int):X.8kl");
    }

    public final void A0U(boolean z) {
        C41731wy r1;
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            C219217x r12 = this.A0Q;
            if (r12.A06() && r12.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r1 = this.A0W;
                i = 8;
                AnonymousClass3MX.A1J(r1, i);
            }
        }
        r1 = this.A0W;
        i = 1;
        if (z) {
            i = 3;
        }
        AnonymousClass3MX.A1J(r1, i);
    }

    public void Bo2() {
        C197799xH A042 = this.A0N.A04();
        if (A042 != null) {
            this.A0V.A0E(A042);
        }
    }

    public void Boh() {
        this.A0N.A07();
        this.A0J.A03((Boolean) null, this.A0L.A04(), (String) null, 76);
        A05(this);
    }

    public void Bry(boolean z) {
        this.A0N.A02 = z;
        A05(this);
    }

    public void BvZ(boolean z) {
        this.A0N.A03 = z;
        this.A0J.A03(Boolean.valueOf(z), this.A0L.A04(), (String) null, 77);
        A05(this);
    }

    public void Bvp(C20079A6f a6f) {
        this.A05 = a6f;
        A05(this);
    }

    public void BzZ(boolean z) {
        this.A0N.A04 = z;
        this.A0J.A03(Boolean.valueOf(z), this.A0L.A04(), (String) null, 74);
        A05(this);
    }

    public static final void A04(AF1 af1, AnonymousClass8FG r12, List list) {
        Object A0T2;
        Object A0T3;
        ArrayList A0D2 = C29351c6.A0D(list);
        int i = -1;
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            AF1 af12 = (AF1) next;
            C20291AEz aEz = af12.A0B;
            AF0 af0 = aEz.A03;
            if (af0 == null) {
                A0T3 = new C174178wM(af12);
            } else {
                if (C18070vi.A18(aEz.A0A, af1.A0B.A0A)) {
                    i = i2;
                }
                A0T3 = r12.A0T(af12, af0, i2);
            }
            A0D2.add(A0T3);
            i2 = i3;
        }
        ArrayList A0m = C29431cG.A0m(A0D2);
        if (i == -1 || !C17880vN.A1X(A0m)) {
            AF0 af02 = af1.A0B.A03;
            if (af02 != null) {
                A0T2 = r12.A0T(af1, af02, 0);
            }
            r12.A0J.A05(C20079A6f.A02(r12), 1, A0m.size(), AnonymousClass000.A1W(af1.A0B.A03));
            r12.A0G.A0E(A0m);
        }
        A0T2 = A0m.remove(i);
        A0m.add(0, A0T2);
        r12.A0J.A05(C20079A6f.A02(r12), 1, A0m.size(), AnonymousClass000.A1W(af1.A0B.A03));
        r12.A0G.A0E(A0m);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8FG(android.app.Application r36, android.os.Bundle r37, X.C37361pP r38, X.C189329iu r39, X.AnonymousClass1KB r40, X.AM5 r41, X.AM7 r42, X.C20272AEf r43, X.C20079A6f r44, X.C20653ATl r45, X.A5L r46, X.C199299zl r47, X.C22427B7j r48, X.C22433B7p r49, X.A5P r50, X.AEQ r51, X.AnonymousClass118 r52, X.C219217x r53, X.C18000vb r54, X.AnonymousClass1XN r55, X.AnonymousClass7CB r56, X.AnonymousClass10I r57, java.lang.String r58, java.util.ArrayList r59) {
        /*
            r35 = this;
            r8 = 1
            r9 = r40
            r0 = r57
            int r16 = X.C72453Mb.A0G(r9, r0, r8)
            r7 = 3
            r5 = r52
            X.C18070vi.A0d(r5, r7)
            r6 = 4
            r3 = r54
            r14 = r36
            X.C18070vi.A0g(r14, r6, r3)
            r32 = 11
            r15 = r55
            r4 = r53
            X.AnonymousClass8BW.A1I(r15, r4)
            r33 = r46
            r10 = r49
            r1 = r33
            X.C18070vi.A0m(r10, r1)
            r2 = 19
            r34 = r42
            r1 = r34
            X.C18070vi.A0d(r1, r2)
            r17 = r48
            r11 = r47
            r12 = r41
            r1 = r56
            r2 = r17
            X.C18070vi.A0u(r11, r2, r12, r1)
            r2 = 24
            r13 = r39
            X.C18070vi.A0d(r13, r2)
            r2 = r35
            r2.<init>(r14)
            r2.A0I = r9
            r2.A0X = r0
            r2.A0P = r5
            r2.A0R = r3
            r0 = r58
            r2.A09 = r0
            r0 = r37
            r2.A01 = r0
            r0 = r43
            r2.A04 = r0
            r0 = r44
            r2.A05 = r0
            r14 = r51
            r2.A0O = r14
            r3 = r38
            r2.A0H = r3
            r9 = r45
            r2.A0Z = r9
            r2.A0S = r15
            r2.A0Q = r4
            r0 = r50
            r2.A08 = r0
            r2.A0c = r10
            r0 = r33
            r2.A0L = r0
            r0 = r59
            r2.A0A = r0
            r0 = r34
            r2.A0J = r0
            r2.A0M = r11
            r0 = r17
            r2.A0a = r0
            X.9op r0 = r13.A00(r1, r12)
            r2.A0K = r0
            java.lang.String r0 = "arg_business_marker_data"
            java.lang.Object r0 = r3.A02(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x009d
            r2.A0A = r0
        L_0x009d:
            java.lang.String r0 = "arg_filter_state"
            java.lang.Object r0 = r3.A02(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x00a9
            r2.A01 = r0
        L_0x00a9:
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r2.A0T = r0
            X.A5P r0 = r2.A08
            X.1DT r0 = r0.A07
            r2.A02 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r2.A0G = r0
            java.util.HashSet r1 = X.C17880vN.A12()
            java.util.Set r0 = A00(r2)
            r1.addAll(r0)
            r2.A0B = r1
            java.lang.String r0 = "arg_business_info_state"
            java.lang.Object r0 = r3.A02(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r5 = 0
            int r0 = X.C72463Mc.A0B(r0)
            r2.A00 = r0
            X.1Dg r1 = X.C108945cZ.A0R()
            java.util.ArrayList r0 = r2.A0A
            r1.A0F(r0)
            r2.A0E = r1
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r2.A0U = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r2.A0W = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r2.A0V = r0
            X.APM r0 = new X.APM
            r0.<init>()
            X.A36 r0 = r10.BGJ(r0)
            android.os.Bundle r4 = r2.A01
            r0.A08(r4)
            r2.A0N = r0
            X.APG r10 = new X.APG
            r10.<init>(r2, r8)
            X.API r4 = new X.API
            r4.<init>(r2, r5)
            X.APE r23 = new X.APE
            r23.<init>()
            X.APJ r26 = new X.APJ
            r26.<init>()
            X.APY r30 = new X.APY
            r30.<init>()
            r21 = 0
            r22 = r17
            r24 = r10
            r25 = r4
            r27 = r0
            r28 = r21
            r29 = r2
            r31 = r16
            X.AP5 r11 = r22.BH0(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A0b = r11
            X.1DT r4 = r11.A06
            X.C18070vi.A0X(r4)
            r2.A0Y = r4
            android.app.Application r12 = r2.A00
            java.lang.String r10 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.C18070vi.A0z(r12, r10)
            android.content.Context r10 = r12.getApplicationContext()
            android.content.res.Resources r12 = r10.getResources()
            r10 = 2131166470(0x7f070506, float:1.7947186E38)
            int r10 = r12.getDimensionPixelSize(r10)
            X.9M4[] r12 = new X.AnonymousClass9M4[r6]
            X.8kO r6 = new X.8kO
            r6.<init>(r10, r10)
            r12[r5] = r6
            X.8kM r5 = new X.8kM
            r5.<init>()
            r12[r8] = r5
            X.8kN r5 = new X.8kN
            r5.<init>(r10, r10)
            r12[r16] = r5
            X.8kL r5 = new X.8kL
            r5.<init>()
            java.util.ArrayList r5 = X.AnonymousClass8BR.A11(r5, r12, r7)
            r2.A0d = r5
            java.lang.String r5 = "saved_selected_multiple_choice_category"
            java.lang.Object r5 = r3.A02(r5)
            if (r5 == 0) goto L_0x017d
            r0.A09(r3)
        L_0x017d:
            r9.A07 = r2
            r9.A08 = r11
            java.util.List r7 = X.AnonymousClass3MW.A10(r1)
            if (r7 == 0) goto L_0x01dc
            X.A5P r6 = r2.A08
            X.A6f r5 = r2.A05
            r6.A04(r5, r7)
            X.A5P r5 = r2.A08
            r5.A06(r7)
            X.A5P r5 = r2.A08
            X.DAE r5 = r5.A08
            X.D44 r5 = r5.A02()
            float r8 = r5.A02
            java.lang.String r7 = r14.A00
            java.lang.String r24 = r0.A06()
            X.0ve r6 = r15.A03
            r5 = 4461(0x116d, float:6.251E-42)
            java.lang.String r25 = X.C108955ca.A0v(r6, r5)
            X.A5P r5 = r2.A08
            int r6 = r5.A01
            int r5 = r5.A00
            boolean r9 = r0.A04
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r19 = r0.A05()
            boolean r9 = r0.A03
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r9)
            java.lang.Integer r9 = r33.A04()
            int r30 = r9.intValue()
            r31 = 65
            r26 = r21
            r22 = r21
            r27 = r8
            r28 = r6
            r29 = r5
            r17 = r34
            r23 = r7
            r17.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x01dc:
            r5 = 19
            X.Are r6 = new X.Are
            r6.<init>(r2, r5)
            r5 = 22
            X.C20339AGv.A01(r4, r1, r6, r5)
            int r4 = r2.A00
            r1 = r16
            if (r4 == r1) goto L_0x01f1
            A06(r2)
        L_0x01f1:
            java.lang.String r1 = "arg_should_animate_on_gps_change"
            java.lang.Object r1 = r3.A02(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0201
            boolean r1 = r1.booleanValue()
            r2.A0D = r1
        L_0x0201:
            X.1Dg r3 = X.C108945cZ.A0R()
            r1 = 77
            X.8wC r0 = X.A36.A00(r0, r2, r1)
            r3.A0F(r0)
            r2.A0F = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8FG.<init>(android.app.Application, android.os.Bundle, X.1pP, X.9iu, X.1KB, X.AM5, X.AM7, X.AEf, X.A6f, X.ATl, X.A5L, X.9zl, X.B7j, X.B7p, X.A5P, X.AEQ, X.118, X.17x, X.0vb, X.1XN, X.7CB, X.10I, java.lang.String, java.util.ArrayList):void");
    }
}
